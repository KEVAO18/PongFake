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
public class Raqueta1 {

    private int x;
    private int y;
    private final int W = 18;
    private final int H = 80;

    public Raqueta1(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, W, H);
    }

    public void movingR1(Rectangle limits) {
        if (keyboardEvent.w && y > limits.getMinY()) {
            y--;
        }
        if (keyboardEvent.s && y < limits.getMaxY() - H) {
            y++;
        }
        /*if (keyboardEvent.a && x > 0 ) {
            x--;
        }
        if (keyboardEvent.d && x < 794/2-W) {
            x++;
        }*/
    }

    public void movingR2(Rectangle limits) {
        if (keyboardEvent.up && y > limits.getMinY()) {
            y--;
        }
        if (keyboardEvent.down && y < limits.getMaxY() - H) {
            y++;
        }
        /*if (keyboardEvent.rigth && x < 794-W ) {
            x++;
        }
        if (keyboardEvent.left && x > 794/2-W) {
            x--;
        }*/
    }
}
