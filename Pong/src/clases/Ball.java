/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author CM-DIGITAL
 */
public class Ball {

    private int x;
    private int y;
    private final int W = 15;
    private final int H = 15;
    private int Dx = 1, Dy = 1;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Rectangle2D getBall() {
        return new Rectangle2D.Double(x, y, W, H);
    }

    public void Move(Rectangle Limits, boolean cR1, boolean cR2) {
        x += Dx;
        y += Dy;
        
        if (cR1) {
            Dx=-Dx;
            x = 30;
        }
        if (cR2) {
            Dx=-Dx;
            x = 741;
        }
        if (x > Limits.getMaxX()) {
            x= 794/2;
            y = 199;
            double a = Math.random();
            if (a < 0.5) {
                Dx=-Dx;
            }else{
                Dx=Dx;
            }
        }
        if (y > Limits.getMaxY()){
            Dy=-Dy;
        }
        if (x < 0){
            x= 794/2;
            y = 199;
            double a = Math.random();
            if (a < 0.5) {
                Dx=-Dx;
            }else{
                Dx=Dx;
            }
        }
        if (y < 0){
            Dy=-Dy;
        }
    }
}
