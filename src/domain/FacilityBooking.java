/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Phill
 */
public class FacilityBooking {
    
    public final long facilityBookingId;
    public final Facility facility;
    public final Guest guest;
    public final Date dateAndTime;
    
    public FacilityBooking(long facilityBookingId, Facility facility, Guest guest, Date dateAndTime) {
        this.facilityBookingId = facilityBookingId;
        this.facility = facility;
        this.guest = guest;
        this.dateAndTime = dateAndTime;
    }
   
}
