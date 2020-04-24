/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.devkingdom.householdmedicaltrackingsystem.models.GenderEnum;

/**
 * Represents someone that gets services and prescriptions.
 */
@Entity(name = "patient")
public class PatientEntity {
    /**
     * The date of birth.
     */
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    /**
     * The first name of this patient.
     */
    @Column(name = "first_name")
    private String firstName;
    
    /**
     * The gender.
     */
    @Basic
    private GenderEnum gender;
    
    /**
     * The unique database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", nullable = false)
    private int id = -1;
    
    /**
     * The last name of this patient.
     */
    @Column(name = "last_name")
    private String lastName;
    /**
     * The middle name of this patient.
     */
    @Column(name = "middle_name")
    private String middleName;
    
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
        final PatientEntity other = (PatientEntity) obj;
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null) {
                return false;
            }
        }
        else if (!dateOfBirth.equals(other.dateOfBirth)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        }
        else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        }
        else if (!lastName.equals(other.lastName)) {
            return false;
        }
        return true;
    }
    
    /**
     * Gets the dateOfBirth
     * @return The dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    /**
     * Gets the firstName
     * @return The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the gender
     * @return The gender
     */
    public GenderEnum getGender() {
        return gender;
    }

    /**
     * Gets the id
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the lastName
     * @return The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the middleName
     * @return The middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
        result = (prime * result) + ((firstName == null) ? 0 : firstName.hashCode());
        result = (prime * result) + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    /**
     * Sets the dateOfBirth.
     * @param dateOfBirth The dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Sets the firstName.
     * @param firstName The firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the gender.
     * @param gender The gender to set
     */
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    /**
     * Sets the id.
     * @param id The id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the lastName.
     * @param lastName The lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the middleName.
     * @param middleName The middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "PatientEntity [dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", lastName=" + lastName
                + ", middleName=" + middleName + "]";
    }

}
