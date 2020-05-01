package com.devkingdom.householdmedicaltrackingsystem.models;

public class Patient {

    private double dateOfBirth;

    private String firstName;

    private GenderEnum gender;

    private Insurance insuranceid;

    private String lastName;

    private String middleName;

    /**
     * Gets the dateOfBirth
     * @return The dateOfBirth
     */
    public double getDateOfBirth() {
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
     * Gets the insuranceid
     * @return The insuranceid
     */
    public Insurance getInsuranceid() {
        return insuranceid;
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
     * Sets the dateOfBirth.
     * @param dateOfBirth The dateOfBirth to set
     */
    public void setDateOfBirth(double dateOfBirth) {
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
     * Sets the insuranceid.
     * @param insuranceid The insuranceid to set
     */
    public void setInsuranceid(Insurance insuranceid) {
        this.insuranceid = insuranceid;
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
}
