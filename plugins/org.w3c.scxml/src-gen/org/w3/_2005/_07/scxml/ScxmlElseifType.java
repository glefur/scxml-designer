/**
 */
package org.w3._2005._07.scxml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elseif Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlElseifType#getCond <em>Cond</em>}</li>
 *   <li>{@link org.w3._2005._07.scxml.ScxmlElseifType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlElseifType()
 * @model extendedMetaData="name='scxml.elseif.type' kind='elementOnly'"
 * @generated
 */
public interface ScxmlElseifType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' attribute.
	 * @see #setCond(String)
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlElseifType_Cond()
	 * @model dataType="org.w3._2005._07.scxml.CondLangDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='cond'"
	 * @generated
	 */
	String getCond();

	/**
	 * Sets the value of the '{@link org.w3._2005._07.scxml.ScxmlElseifType#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3._2005._07.scxml.ScxmlPackage#getScxmlElseifType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ScxmlElseifType
