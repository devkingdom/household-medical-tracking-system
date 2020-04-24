/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a medical code from a doctor or insurance company.
 */
@Entity(name = "medical_code")
public class MedicalCodeEntity {
    /**
     * The code provided.
     */
    @Basic
    private String code;
    /**
     * A description.
     */
    @Basic
    private String description;
    /**
     * The database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id", nullable = false)
    private int id;
    
    /**
     * Gets the code
     * @return The code
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Gets the description
     * @return The description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Gets the id
     * @return The id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Sets the code.
     * @param code The code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Sets the description.
     * @param description The description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the id.
     * @param id The id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
