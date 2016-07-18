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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.vp.requirements.Requirements.AbstractRelation;
import org.polarsys.kitalpha.vp.requirements.Requirements.Requirement;
import org.polarsys.kitalpha.vp.requirements.Requirements.RequirementType;
import org.polarsys.kitalpha.vp.requirements.Requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.RequirementImpl#getRequirementType <em>Requirement Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.RequirementImpl#getOwnedRelations <em>Owned Relations</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.RequirementImpl#getReqIFChapterName <em>Req IF Chapter Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.RequirementImpl#getReqIFForeignID <em>Req IF Foreign ID</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.RequirementImpl#getReqIFPrefix <em>Req IF Prefix</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.requirements.Requirements.impl.RequirementImpl#getReqIFText <em>Req IF Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends AttributeOwnerImpl implements Requirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2016 THALES GLOBAL SERVICES.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n\r\n Contributors:\r\n    Thales - initial API and implementation"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRequirementType() <em>Requirement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementType()
	 * @generated
	 * @ordered
	 */
	protected RequirementType requirementType;

	/**
	 * The cached value of the '{@link #getOwnedRelations() <em>Owned Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRelation> ownedRelations;

	/**
	 * The default value of the '{@link #getReqIFChapterName() <em>Req IF Chapter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFChapterName()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_CHAPTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFChapterName() <em>Req IF Chapter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFChapterName()
	 * @generated
	 * @ordered
	 */
	protected String reqIFChapterName = REQ_IF_CHAPTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqIFForeignID() <em>Req IF Foreign ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFForeignID()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_FOREIGN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFForeignID() <em>Req IF Foreign ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFForeignID()
	 * @generated
	 * @ordered
	 */
	protected String reqIFForeignID = REQ_IF_FOREIGN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqIFPrefix() <em>Req IF Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFPrefix() <em>Req IF Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFPrefix()
	 * @generated
	 * @ordered
	 */
	protected String reqIFPrefix = REQ_IF_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqIFText() <em>Req IF Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFText()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFText() <em>Req IF Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIFText()
	 * @generated
	 * @ordered
	 */
	protected String reqIFText = REQ_IF_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RequirementType getRequirementType() {

		if (requirementType != null && requirementType.eIsProxy()) {
			InternalEObject oldRequirementType = (InternalEObject) requirementType;
			requirementType = (RequirementType) eResolveProxy(oldRequirementType);
			if (requirementType != oldRequirementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RequirementsPackage.REQUIREMENT__REQUIREMENT_TYPE, oldRequirementType, requirementType));
			}
		}
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RequirementType basicGetRequirementType() {

		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setRequirementType(RequirementType newRequirementType) {

		RequirementType oldRequirementType = requirementType;
		requirementType = newRequirementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__REQUIREMENT_TYPE,
					oldRequirementType, requirementType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractRelation> getOwnedRelations() {

		if (ownedRelations == null) {
			ownedRelations = new EObjectContainmentEList<AbstractRelation>(AbstractRelation.class, this,
					RequirementsPackage.REQUIREMENT__OWNED_RELATIONS);
		}
		return ownedRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getReqIFChapterName() {

		return reqIFChapterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReqIFChapterName(String newReqIFChapterName) {

		String oldReqIFChapterName = reqIFChapterName;
		reqIFChapterName = newReqIFChapterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__REQ_IF_CHAPTER_NAME,
					oldReqIFChapterName, reqIFChapterName));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getReqIFForeignID() {

		return reqIFForeignID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReqIFForeignID(String newReqIFForeignID) {

		String oldReqIFForeignID = reqIFForeignID;
		reqIFForeignID = newReqIFForeignID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__REQ_IF_FOREIGN_ID,
					oldReqIFForeignID, reqIFForeignID));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getReqIFPrefix() {

		return reqIFPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReqIFPrefix(String newReqIFPrefix) {

		String oldReqIFPrefix = reqIFPrefix;
		reqIFPrefix = newReqIFPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__REQ_IF_PREFIX,
					oldReqIFPrefix, reqIFPrefix));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getReqIFText() {

		return reqIFText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReqIFText(String newReqIFText) {

		String oldReqIFText = reqIFText;
		reqIFText = newReqIFText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__REQ_IF_TEXT,
					oldReqIFText, reqIFText));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT__OWNED_RELATIONS:
			return ((InternalEList<?>) getOwnedRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT__REQUIREMENT_TYPE:
			if (resolve)
				return getRequirementType();
			return basicGetRequirementType();
		case RequirementsPackage.REQUIREMENT__OWNED_RELATIONS:
			return getOwnedRelations();
		case RequirementsPackage.REQUIREMENT__REQ_IF_CHAPTER_NAME:
			return getReqIFChapterName();
		case RequirementsPackage.REQUIREMENT__REQ_IF_FOREIGN_ID:
			return getReqIFForeignID();
		case RequirementsPackage.REQUIREMENT__REQ_IF_PREFIX:
			return getReqIFPrefix();
		case RequirementsPackage.REQUIREMENT__REQ_IF_TEXT:
			return getReqIFText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT__REQUIREMENT_TYPE:
			setRequirementType((RequirementType) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__OWNED_RELATIONS:
			getOwnedRelations().clear();
			getOwnedRelations().addAll((Collection<? extends AbstractRelation>) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_CHAPTER_NAME:
			setReqIFChapterName((String) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_FOREIGN_ID:
			setReqIFForeignID((String) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_PREFIX:
			setReqIFPrefix((String) newValue);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_TEXT:
			setReqIFText((String) newValue);
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
		case RequirementsPackage.REQUIREMENT__REQUIREMENT_TYPE:
			setRequirementType((RequirementType) null);
			return;
		case RequirementsPackage.REQUIREMENT__OWNED_RELATIONS:
			getOwnedRelations().clear();
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_CHAPTER_NAME:
			setReqIFChapterName(REQ_IF_CHAPTER_NAME_EDEFAULT);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_FOREIGN_ID:
			setReqIFForeignID(REQ_IF_FOREIGN_ID_EDEFAULT);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_PREFIX:
			setReqIFPrefix(REQ_IF_PREFIX_EDEFAULT);
			return;
		case RequirementsPackage.REQUIREMENT__REQ_IF_TEXT:
			setReqIFText(REQ_IF_TEXT_EDEFAULT);
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
		case RequirementsPackage.REQUIREMENT__REQUIREMENT_TYPE:
			return requirementType != null;
		case RequirementsPackage.REQUIREMENT__OWNED_RELATIONS:
			return ownedRelations != null && !ownedRelations.isEmpty();
		case RequirementsPackage.REQUIREMENT__REQ_IF_CHAPTER_NAME:
			return REQ_IF_CHAPTER_NAME_EDEFAULT == null ? reqIFChapterName != null
					: !REQ_IF_CHAPTER_NAME_EDEFAULT.equals(reqIFChapterName);
		case RequirementsPackage.REQUIREMENT__REQ_IF_FOREIGN_ID:
			return REQ_IF_FOREIGN_ID_EDEFAULT == null ? reqIFForeignID != null
					: !REQ_IF_FOREIGN_ID_EDEFAULT.equals(reqIFForeignID);
		case RequirementsPackage.REQUIREMENT__REQ_IF_PREFIX:
			return REQ_IF_PREFIX_EDEFAULT == null ? reqIFPrefix != null : !REQ_IF_PREFIX_EDEFAULT.equals(reqIFPrefix);
		case RequirementsPackage.REQUIREMENT__REQ_IF_TEXT:
			return REQ_IF_TEXT_EDEFAULT == null ? reqIFText != null : !REQ_IF_TEXT_EDEFAULT.equals(reqIFText);
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
		result.append(" (ReqIFChapterName: "); //$NON-NLS-1$
		result.append(reqIFChapterName);
		result.append(", ReqIFForeignID: "); //$NON-NLS-1$
		result.append(reqIFForeignID);
		result.append(", ReqIFPrefix: "); //$NON-NLS-1$
		result.append(reqIFPrefix);
		result.append(", ReqIFText: "); //$NON-NLS-1$
		result.append(reqIFText);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl