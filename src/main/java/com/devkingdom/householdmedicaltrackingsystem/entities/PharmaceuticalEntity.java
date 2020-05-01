/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Represents prescriptions or medication.
 */
@Entity(name = "pharmaceutical")
public class PharmaceuticalEntity {
    /**
     * The expiration date of this medication.
     */
    @Column(name = "expiration_date")
    private Date expiration;
    /**
     * The unique database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pharmaceutical_id", nullable = false)
    private int id = -1;
    /**
     * The maker of this medication.
     */
    @Basic
    private String manufacturer;
    /**
     * The patient this is for.
     */
    @OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private PatientEntity patient;

    /**
     * Gets the expiration
     * @return The expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Gets the id
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the manufacturer
     * @return The manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Gets the patient
     * @return The patient
     */
    public PatientEntity getPatient() {
        return patient;
    }

    /**
     * Sets the expiration.
     * @param expiration The expiration to set
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    /**
     * Sets the id.
     * @param id The id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the manufacturer.
     * @param manufacturer The manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Sets the patient.
     * @param patient The patient to set
     */
    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }
}
