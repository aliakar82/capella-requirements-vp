/*******************************************************************************
 * Copyright (c) 2017, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.vp.requirements.semantic.browser.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.DAnnotation;
import org.polarsys.capella.vp.requirements.model.helpers.RelationAnnotationHelper;
import org.polarsys.kitalpha.vp.requirements.Requirements.Requirement;

/**
 * @author Joao Barata
 */
public class RepresentationIncomingRelationQuery extends AbstractViewpointQuery {

	/**
	 * @param object: The model element for which the semantic browser extension is generated
	 * @return List of object to display in the parent category
	 */
	public List<Object> computeQuery(Object object) {
		List<Object> result = new ArrayList<Object>();
    DRepresentationDescriptor descriptor = (DRepresentationDescriptor) object;

    for (DAnnotation allocation : RelationAnnotationHelper.getAllocations(descriptor, RelationAnnotationHelper.IncomingRelationAnnotation)) {
      Requirement requirement = RelationAnnotationHelper.getRequirement(allocation);
      if (requirement != null) {
        result.add(requirement);
      }
    }

    return result;
	}
}
