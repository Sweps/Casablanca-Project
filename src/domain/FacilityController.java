/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;

/**
 *
 * @author Phill
 */
public class FacilityController implements FacilityControllerIF{
    Guest currentguest;
    @Override
    public boolean login(long ID) {
       this.currentguest = DBFacade.getInstance().findGuest(ID);
       if (currentguest == null)
       {
           return false;
       }
       else
       {
           return true;
       }
    }
    @Override
    public String getCurrentGuestName()
    {
        if (currentguest != null)
        {
         return currentguest.getFirstname() + " " + currentguest.getLastname();
        }
        return "";
    }
    public void logout()
    {
        //persistance stuff
        this.currentguest = null;
    }
    
}
