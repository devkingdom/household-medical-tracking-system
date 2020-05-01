/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents an insurance record.
 */
@Entity(name = "insurance")
public class InsuranceEntity {
    /**
     * The group number for the insurance item.
     */
    @Column(name = "group_number", nullable = false)
    private String groupNumber;
    /**
     * The database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id", nullable = false)
    private int id;
    /**
     * A name for this.
     */
    @Column(name = "name", nullable = false)
    private String name;
    
    /**
     * Gets the groupNumber
     * @return The groupNumber
     */
    public String getGroupNumber() {
        return groupNumber;
    }
    
    /**
     * Gets the id
     * @return The id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Gets the name
     * @return The name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the groupNumber.
     * @param groupNumber The groupNumber to set
     */
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    
    /**
     * Sets the id.
     * @param id The id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Sets the name.
     * @param name The name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
