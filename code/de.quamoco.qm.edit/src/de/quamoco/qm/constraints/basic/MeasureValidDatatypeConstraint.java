/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2012 Technische Universitaet Muenchen and                      |
| Fraunhofer-Institut fuer Experimentelles Software Engineering (IESE)     |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
|                                                                          |
+-------------------------------------------------------------------------*/

package de.quamoco.qm.constraints.basic;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;

import de.quamoco.qm.Measure;
import de.quamoco.qm.QmPackage;
import de.quamoco.qm.Type;
import edu.tum.cs.emf.commons.validation.FeatureModelConstraintBase;

/**
 * Constraint to identify measures that have an invalid data type.
 * 
 * @author herrmama
 * @author $Author: lochmann $
 * @version $Rev: 4974 $
 * @levd.rating YELLOW Hash: 47A66891CA5E7C2C50BF0C46F941F235
 */
public class MeasureValidDatatypeConstraint extends FeatureModelConstraintBase {

	/** Constructor. */
	public MeasureValidDatatypeConstraint() {
		super(QmPackage.Literals.MEASURE__TYPE);
	}

	/** {@inheritDoc} */
	@Override
	protected IStatus validate(EObject target) {
		Measure measure = (Measure) target;
		if (measure.getType().getValue() == Type.NONE_VALUE) {
			return createFailureStatus();
		}
		return createSuccessStatus();
	}
}
