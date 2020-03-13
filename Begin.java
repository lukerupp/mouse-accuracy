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
public class Begin extends Sprite {
 private Image img;
    private ImageIcon ii;
    private static final int SPEED = 0;
    private static final int WIDTH = 200;
    private static final int HEIGHT = 150;
    private static final Color COLOR = Color.BLUE;
    public Begin (int x, int y) {
        super (x, y, WIDTH, HEIGHT, SPEED, COLOR);
        this.ii = new ImageIcon(getClass().getResource("New Piskel.png"));
                            this.img = ii.getImage();
    }
    public void draw(Graphics g) {
        g.drawImage(img, super.getX(), super.getY(), super.getWidth(), super.getHeight(), null);
    }

  
    }
