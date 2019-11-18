/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import clases.Ball;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CM-DIGITAL
 */
public class Tablero extends JPanel{
    Ball ball = new Ball(794/2, 200);
    Raqueta1 r1 = new Raqueta1(10, 200);
    Raqueta1 r2 = new Raqueta1(794-20-10, 200);
    
    public Tablero(){
        setBackground(new Color(0, 54, 72));
    }
    
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(162, 36, 36));
        Draw(g2);
        Update();
    }
    
    public void Draw(Graphics2D g){
        g.fill(ball.getBall());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
    }
    
    public void Update(){
        ball.Move(getBounds(),collision(r1.getRaqueta()),collision(r2.getRaqueta()));
        r1.movingR1(getBounds());
        r2.movingR2(getBounds());
    }
    
    private boolean collision(Rectangle2D r){
        return ball.getBall().intersects(r);
    }
    
    
// hilo para hacer que la pelota se mueva mas rapido o mas lento
//    public void iterateGame(){
//        while (true) {            
//            repaint();
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
}
