/**
 *
 *  Copyright (c) 2016 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */

package org.polarsys.kitalpha.vp.requirements.Requirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.vp.requirements.Requirements.AbstractRelation;
import org.polarsys.kitalpha.vp.requirements.Requirements.RelationType;
import org.polarsys.kitalpha.vp.requirements.Requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.AbstractRelationImpl#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.AbstractRelationImpl#getReqIFRelationType <em>Req IF Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRelationImpl extends ReqIFElementImpl implements AbstractRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2016 THALES GLOBAL SERVICES.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n\r\n Contributors:\r\n    Thales - initial API and implementation"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected RelationType relationType;

	/**
	 * The default value of the '{@link #getReqIFRelationType() <em>Req IF Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFRelationType()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_RELATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFRelationType() <em>Req IF Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFRelationType()
	 * @generated
	 * @ordered
	 */
	protected String reqIFRelationType = REQ_IF_RELATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRelationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.ABSTRACT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RelationType getRelationType() {

		if (relationType != null && relationType.eIsProxy()) {
			InternalEObject oldRelationType = (InternalEObject) relationType;
			relationType = (RelationType) eResolveProxy(oldRelationType);
			if (relationType != oldRelationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RequirementsPackage.ABSTRACT_RELATION__RELATION_TYPE, oldRelationType, relationType));
			}
		}
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RelationType basicGetRelationType() {

		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setRelationType(RelationType newRelationType) {

		RelationType oldRelationType = relationType;
		relationType = newRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_RELATION__RELATION_TYPE,
					oldRelationType, relationType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getReqIFRelationType() {

		return reqIFRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReqIFRelationType(String newReqIFRelationType) {

		String oldReqIFRelationType = reqIFRelationType;
		reqIFRelationType = newReqIFRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.ABSTRACT_RELATION__REQ_IF_RELATION_TYPE, oldReqIFRelationType,
					reqIFRelationType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.ABSTRACT_RELATION__RELATION_TYPE:
			if (resolve)
				return getRelationType();
			return basicGetRelationType();
		case RequirementsPackage.ABSTRACT_RELATION__REQ_IF_RELATION_TYPE:
			return getReqIFRelationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RequirementsPackage.ABSTRACT_RELATION__RELATION_TYPE:
			setRelationType((RelationType) newValue);
			return;
		case RequirementsPackage.ABSTRACT_RELATION__REQ_IF_RELATION_TYPE:
			setReqIFRelationType((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RequirementsPackage.ABSTRACT_RELATION__RELATION_TYPE:
			setRelationType((RelationType) null);
			return;
		case RequirementsPackage.ABSTRACT_RELATION__REQ_IF_RELATION_TYPE:
			setReqIFRelationType(REQ_IF_RELATION_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RequirementsPackage.ABSTRACT_RELATION__RELATION_TYPE:
			return relationType != null;
		case RequirementsPackage.ABSTRACT_RELATION__REQ_IF_RELATION_TYPE:
			return REQ_IF_RELATION_TYPE_EDEFAULT == null ? reqIFRelationType != null
					: !REQ_IF_RELATION_TYPE_EDEFAULT.equals(reqIFRelationType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ReqIFRelationType: "); //$NON-NLS-1$
		result.append(reqIFRelationType);
		result.append(')');
		return result.toString();
	}

} //AbstractRelationImpl