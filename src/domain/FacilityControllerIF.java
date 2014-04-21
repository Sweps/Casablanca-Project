/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Phill
 */
public interface FacilityControllerIF {
    public boolean login(long ID);
    public String getCurrentGuestName();
    public void logout();
}
