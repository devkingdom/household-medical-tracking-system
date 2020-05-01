/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * Represents a business.
 */
@Entity(name = "business")
public class BusinessEntity {
    /**
     * The set of addresses for this business.
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "address", joinColumns = { @JoinColumn(name = "address_id") })
    private List<AddressEntity> addresses;
    /**
     * The alternate name for this business.
     */
    @Column(name = "alt_name")
    private String altName;
    /**
     * The database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_id", nullable = false)
    private int id;
    /**
     * The business primary name.
     */
    @Basic
    private String name;

    /**
     * Gets the addresses
     * @return The addresses
     */
    public List<AddressEntity> getAddresses() {
        return addresses;
    }

    /**
     * Gets the altName
     * @return The altName
     */
    public String getAltName() {
        return altName;
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
     * Sets the addresses.
     * @param addresses The addresses to set
     */
    public void setAddresses(List<AddressEntity> addresses) {
        this.addresses = addresses;
    }

    /**
     * Sets the altName.
     * @param altName The altName to set
     */
    public void setAltName(String altName) {
        this.altName = altName;
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
