/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseaccuracy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author 802811
 */
public class Target extends Sprite {
    private Image img;
    private ImageIcon ii;
    private static final int SPEED = 0;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 60;
    private static final Color COLOR = Color.BLUE;
    public Target (int x, int y) {
        super (x, y, WIDTH, HEIGHT, SPEED, COLOR);
        this.ii = new ImageIcon(getClass().getResource("target.png"));
                            this.img = ii.getImage();
    }
    public void draw(Graphics g) {
        g.drawImage(img, super.getX(), super.getY(), super.getWidth(), super.getHeight(), null);
    }

    boolean contains(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
