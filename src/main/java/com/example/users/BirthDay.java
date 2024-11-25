//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.11.24 à 11:55:18 PM CET 
//


package com.example.users;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour birthDay complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="birthDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "birthDay", propOrder = {
    "day",
    "month",
    "year"
})
public class BirthDay {

    protected int day;
    protected int month;
    protected int year;

    /**
     * Obtient la valeur de la propriété day.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Définit la valeur de la propriété day.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Obtient la valeur de la propriété month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Définit la valeur de la propriété month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Obtient la valeur de la propriété year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Définit la valeur de la propriété year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
