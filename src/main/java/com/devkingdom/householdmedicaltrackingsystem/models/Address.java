package com.devkingdom.householdmedicaltrackingsystem.models;
// group id
public class Address {
    private String street1;
    private String street2;
    /**
     * @return the street1
     */
    public String getStreet1() { 
        return street1;
    
    }
/**
 * @return the street2
 */
public String getStreet2() {
    return street2;
}
    private String city;
    private String state;
    private String postalCode;
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }/**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }
   /**
    * @return the state
    */
   public String getState() {
       return state;
   }

   /**
    * @param street1 the street1 to set
    */
   public void setStreet1(String street1) {
       this.street1 = street1;
   }

   /**
    * @param street2 the street2 to set
    */
   public void setStreet2(String street2) {
       this.street2 = street2;
   }

   /**
    * @param city the city to set
    */
   public void setCity(String city) {
       this.city = city;
   }

   /**
    * @param postalCode the postalCode to set
    */
   public void setPostalCode(String postalCode) {
       this.postalCode = postalCode;
   }

   /**
    * @param state the state to set
    */
   public void setState(String state) {
       this.state = state;
   }

   
    
}
