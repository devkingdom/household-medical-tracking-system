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
 * Represents a connect number.
 */
@Entity(name = "contact_information")
public class ContactInformationEntity {
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
    @Column(name = "contact_infomration_id", nullable = false)
    private int id;
    /**
     * The number to use.
     */
    @Column(name = "value", nullable = false)
    private String number;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactInformationEntity other = (ContactInformationEntity) obj;
        if (number == null) {
            if (other.number != null) {
                return false;
            }
        }
        else if (!number.equals(other.number)) {
            return false;
        }
        return true;
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
     * Gets the number
     * @return The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((number == null) ? 0 : number.hashCode());
        return result;
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
    
    /**
     * Sets the number.
     * @param number The number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
