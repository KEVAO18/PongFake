/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;

/**
 *
 * @author CM-DIGITAL
 */
public class Ventana extends JFrame{
    private Tablero background;
    private final int W = 800, H = 500;
    private Threads threads;
    public Ventana(){
        setTitle("Kevao's Pong");
        setSize(W, H);
        setLocationRelativeTo(null);
        setResizable(false);
        background = new Tablero();
        add(background);
        addKeyListener(new keyboardEvent());
        Threads threads = new Threads(background);
        threads.start();
//        background.iterateGame();
    }    
}
