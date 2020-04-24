/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Tests the address entity.
 */
public class AddressEntityTest {

    /**
     * Test the get/set methods.
     */
    @Test
    public void test() {
        final AddressEntity address = new AddressEntity();
        
        assertEquals(-1, address.getId());
        assertNull(address.getStreet1());
        assertNull(address.getStreet2());
        assertNull(address.getCity());
        assertNull(address.getState());
        assertNull(address.getPostalCode());
        
        address.setId(10);
        assertEquals(10, address.getId());

        address.setStreet1("201 Mullica Hill Rd");
        assertEquals("201 Mullica Hill Rd", address.getStreet1());

        address.setStreet2("Bunce 123");
        assertEquals("Bunce 123", address.getStreet2());
        
        address.setCity("Glassboro");
        assertEquals("Glassboro", address.getCity());
        
        address.setState("NJ");
        assertEquals("NJ", address.getState());
        
        address.setPostalCode("08028");
        assertEquals("08028", address.getPostalCode());
    }

}
