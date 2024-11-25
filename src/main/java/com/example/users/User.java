//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.11.24 à 11:55:18 PM CET 
//


package com.example.users;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour User complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appUserRole" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="imageProfilPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birthDay" type="{http://example.com/users}birthDay"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "firstName",
    "lastName",
    "email",
    "appUserRole",
    "locked",
    "enabled",
    "imageProfilPath",
    "birthDay"
})
public class User {

    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String appUserRole;
    protected boolean locked;
    protected boolean enabled;
    @XmlElement(required = true)
    protected String imageProfilPath;
    @XmlElement(required = true)
    protected BirthDay birthDay;

    /**
     * Obtient la valeur de la propriété firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Définit la valeur de la propriété firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtient la valeur de la propriété lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Définit la valeur de la propriété lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété appUserRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUserRole() {
        return appUserRole;
    }

    /**
     * Définit la valeur de la propriété appUserRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUserRole(String value) {
        this.appUserRole = value;
    }

    /**
     * Obtient la valeur de la propriété locked.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Définit la valeur de la propriété locked.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Obtient la valeur de la propriété enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Définit la valeur de la propriété enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtient la valeur de la propriété imageProfilPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageProfilPath() {
        return imageProfilPath;
    }

    /**
     * Définit la valeur de la propriété imageProfilPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageProfilPath(String value) {
        this.imageProfilPath = value;
    }

    /**
     * Obtient la valeur de la propriété birthDay.
     * 
     * @return
     *     possible object is
     *     {@link BirthDay }
     *     
     */
    public BirthDay getBirthDay() {
        return birthDay;
    }

    /**
     * Définit la valeur de la propriété birthDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDay }
     *     
     */
    public void setBirthDay(BirthDay value) {
        this.birthDay = value;
    }

}
