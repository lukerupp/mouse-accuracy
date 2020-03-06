    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseaccuracy;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author 802811
 */
public class Sprite {
    private int x, y, vx, vy, height, width, speed; 
    private Rectangle bounds; 
    private Color color; 
    private boolean alive = true; 
    public Sprite(int x, int y, int width, int height, int speed, Color color){
        this.height = height;
        this.width = width;
        this.x = x; 
        this.y = y;
        this.vx = speed; 
        this.vy = speed; 
        this.bounds = new Rectangle (x, y, width, height);
        this.color = color;
    }
     public void update() {
        this.x += this.vx;
        this.y += this.vy;
        this.bounds = new Rectangle(x, y, width, height);
    }
    public void die() {
        this.alive = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
}
