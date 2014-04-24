/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Phill
 */
public interface FacilityControllerIF {
    public boolean login(long ID);
    public String getCurrentGuestName();
    public void logout();

    public ArrayList<Integer> getIncompatibleTennisTimes(Calendar cal);

    public int bookTennis(Date thedate);
}
