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
import javax.persistence.OneToOne;

/**
 * Represents a service on a
 */
@Entity(name = "service")
public class ServiceEntity {
    /**
     * The business that provided this service.
     */
    @OneToOne
    private BusinessEntity business;
    /**
     * Charge for this service.
     */
    @Basic
    private double cost;
    /**
     * The description of this service item.
     */
    @Basic
    private String description;
    /**
     * Any discounts or reductions.
     */
    @Basic
    private double discount;
    /**
     * The unique database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id", nullable = false)
    private int id = -1;
    /**
     * The medical code for this record.
     */
    @OneToOne
    private MedicalCodeEntity medicalCode;
    /**
     * Extra details.
     */
    @Basic
    private String notes;
    /**
     * The patient that received this service.
     */
    @OneToOne
    private PatientEntity patient;
    /**
     * A payment made for this item.
     */
    @Basic
    private double payment;

    /**
     * Gets the business
     * @return The business
     */
    public BusinessEntity getBusiness() {
        return business;
    }
    
    /**
     * Gets the cost
     * @return The cost
     */
    public double getCost() {
        return cost;
    }
    
    /**
     * Gets the description
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the discount
     * @return The discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Gets the id
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the medicalCode
     * @return The medicalCode
     */
    public MedicalCodeEntity getMedicalCode() {
        return medicalCode;
    }

    /**
     * Gets the notes
     * @return The notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Gets the patient
     * @return The patient
     */
    public PatientEntity getPatient() {
        return patient;
    }

    /**
     * Gets the payment
     * @return The payment
     */
    public double getPayment() {
        return payment;
    }
    
    /**
     * Sets the business.
     * @param business The business to set
     */
    public void setBusiness(BusinessEntity business) {
        this.business = business;
    }
    
    /**
     * Sets the cost.
     * @param cost The cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    /**
     * Sets the description.
     * @param description The description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the discount.
     * @param discount The discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    /**
     * Sets the id.
     * @param id The id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Sets the medicalCode.
     * @param medicalCode The medicalCode to set
     */
    public void setMedicalCode(MedicalCodeEntity medicalCode) {
        this.medicalCode = medicalCode;
    }
    
    /**
     * Sets the notes.
     * @param notes The notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    /**
     * Sets the patient.
     * @param patient The patient to set
     */
    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }
    
    /**
     * Sets the payment.
     * @param payment The payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }

}
