/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
    
    @Override
    public ArrayList<Integer> getIncompatibleTennisTimes(Calendar cal)
    {
//        Calendar cal2 = Calendar.getInstance();
//        cal2.set(1989, 03, 06, 19, 49);
//        Date testdate = cal2.getTime();
//        
//        ArrayList<Date> ragglefraggle = new ArrayList<>();
//        
//        ragglefraggle.add(testdate);
//        
//        
        
        return DBFacade.getInstance().getIncompatibleTennisTimes(cal.getTime());
    }
    
    @Override
    public int bookTennis(Date date)
    {
        return DBFacade.getInstance().bookTennis(currentguest, date);
    }
    
}
