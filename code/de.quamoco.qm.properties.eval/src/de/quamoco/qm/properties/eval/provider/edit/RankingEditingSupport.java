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

package de.quamoco.qm.properties.eval.provider.edit;

import org.eclipse.jface.viewers.TableViewer;

import de.quamoco.qm.properties.eval.model.InfluencingOrRefiningElement;
import de.quamoco.qm.properties.eval.provider.InfluencingOrRefiningElementLabelProvider;

public class RankingEditingSupport extends AbstractEditingSupport {

	public RankingEditingSupport(TableViewer viewer) {
		super(viewer, InfluencingOrRefiningElementLabelProvider.COLUMN_RANKING);
	}

	@Override
	protected void setValue(InfluencingOrRefiningElement<?> element,
			Object value) {
		int newRanking = Integer.parseInt((String) value);
		element.setRanking(newRanking);
	}

}
