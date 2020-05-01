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
 * Holds an address database record.
 */
@Entity(name = "address")
public class AddressEntity {

    /**
     * The city.
     */
    @Basic
    private String city;
    /**
     * The unique database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", nullable = false)
    private int id = -1;
    /**
     * The postal code.
     */
    @Column(name = "postal_code", nullable = false)
    private String postalCode;
    /**
     * The two digit state.
     */
    @Column(name = "state", nullable = false)
    private String state;
    /**
     * The main address.
     */
    @Column(name = "street1", nullable = false)
    private String street1;
    /**
     * The second address line.
     */
    @Column(name = "street2", nullable = false)
    private String street2;
    
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
        final AddressEntity other = (AddressEntity) obj;
        if (postalCode == null) {
            if (other.postalCode != null) {
                return false;
            }
        }
        else if (!postalCode.equals(other.postalCode)) {
            return false;
        }
        if (state == null) {
            if (other.state != null) {
                return false;
            }
        }
        else if (!state.equals(other.state)) {
            return false;
        }
        if (street1 == null) {
            if (other.street1 != null) {
                return false;
            }
        }
        else if (!street1.equals(other.street1)) {
            return false;
        }
        return true;
    }
    
    /**
     * Gets the city
     * @return The city
     */
    public String getCity() {
        return city;
    }
    
    /**
     * Gets the id
     * @return The id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Gets the postalCode
     * @return The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }
    
    /**
     * Gets the state
     * @return The state
     */
    public String getState() {
        return state;
    }
    
    /**
     * Gets the street1
     * @return The street1
     */
    public String getStreet1() {
        return street1;
    }
    
    /**
     * Gets the street2
     * @return The street2
     */
    public String getStreet2() {
        return street2;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((postalCode == null) ? 0 : postalCode.hashCode());
        result = (prime * result) + ((state == null) ? 0 : state.hashCode());
        result = (prime * result) + ((street1 == null) ? 0 : street1.hashCode());
        return result;
    }
    
    /**
     * Sets the city.
     * @param city The city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * Sets the id.
     * @param id The id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Sets the postalCode.
     * @param postalCode The postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    /**
     * Sets the state.
     * @param state The state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the street1.
     * @param street1 The street1 to set
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }
    
    /**
     * Sets the street2.
     * @param street2 The street2 to set
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }
}
