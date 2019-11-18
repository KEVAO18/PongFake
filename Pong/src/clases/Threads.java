/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CM-DIGITAL
 */
public class Threads extends Thread{
    Tablero Panel;
    public Threads(Tablero Panel){
        this.Panel = Panel;
    }

    @Override
    public void run() {
        while (true) {    
            try {
                Thread.sleep(4);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
            }
            Panel.repaint();
        }
    }
    
}
