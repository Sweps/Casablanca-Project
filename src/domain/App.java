/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import presentation.ChooseAction;
import presentation.Receptionist_gui;

/*----------------------------------------------------------------
 *  Author:        Phillip Smith
 *  Written:       Mar 26, 2014
 *  Last updated:  Mar 26, 2014
 *
 *----------------------------------------------------------------*/
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller(); 
//        Receptionist_gui frame = new Receptionist_gui(c);
//        frame.setVisible(true);
        
        ChooseAction frame = new ChooseAction(c);
        frame.setVisible(true);
        
    }

}
