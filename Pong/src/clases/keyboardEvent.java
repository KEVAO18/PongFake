/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author CM-DIGITAL
 */
public class keyboardEvent extends KeyAdapter{
    static boolean w, s, a, d, up, down, left, rigth;
    
    @Override
    
    public void keyPressed(KeyEvent e){
        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = true;
        }
        
        if (id == KeyEvent.VK_S) {
            s = true;
        }
        if (id == KeyEvent.VK_A) {
            a = true;
        }
        if (id == KeyEvent.VK_D) {
            d = true;
        }
        if (id == KeyEvent.VK_UP) {
            up = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (id == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (id == KeyEvent.VK_RIGHT) {
            rigth = true;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_A) {
            a = false;
        }
        if (id == KeyEvent.VK_D) {
            d = false;
        }
        if (id == KeyEvent.VK_UP) {
            up = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = false;
        }
        if (id == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (id == KeyEvent.VK_RIGHT) {
            rigth = false;
        }
    }
}
