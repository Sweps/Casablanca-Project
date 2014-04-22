/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Phill
 */
public class Facility {
    final public int facilityId;
    final public String facilityType;
    
    public Facility(int id, String type)
    {
        this.facilityId = id;
        this.facilityType = type;
    }
}
