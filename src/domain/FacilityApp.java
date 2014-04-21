/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import presentation.FacilityGui;

/**
 *
 * @author Phill
 */
public class FacilityApp {
    
    public static void main(String[] args) {
        FacilityController c = new FacilityController(); 
        FacilityGui frame = new FacilityGui(c);
        frame.setVisible(true);
    }

}
