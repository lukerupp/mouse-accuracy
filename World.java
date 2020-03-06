/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseaccuracy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author 802811
 */
public class World extends JPanel implements MouseListener {
    Timer timer;
    Target t; 
    
    public World() {
        t = new Target (399,200);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/30);
        super.setSize(800,600);
    }
     private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
        }
    }
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.ORANGE);
        if (t.isAlive())t.draw(g);
        
     }
      @Override
    public void mouseExited(MouseEvent event) {

    }
    @Override
    public void mouseEntered(MouseEvent event) {
           //if(t.contains(event.getPoint())) {
               
           //}
               
           
    }
    @Override
    public void mousePressed(MouseEvent event) {

    }
    @Override
    public void mouseReleased(MouseEvent event) {

    }
    @Override
    public void mouseClicked(MouseEvent event) {
        if (t.getBounds().contains(event.getPoint())) {
            t.die();
            
        }
        else {
            System.out.println("Miss!");
        }
    }

}
