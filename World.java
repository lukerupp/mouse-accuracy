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
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author 802811
 */
public class World extends JPanel implements MouseListener {
    Timer timer;
    Begin begin;
    Target t;
    Target ta;
    int joe;
    int mama;
    int scoreTimer, tLeft;
    String toDraw1, toDraw2;
     Target[] targets = new Target[30];
     
    
    public World() {
       for (int i = 0; i < targets.length; i++) {
        int x = (int) (Math.random() * 650 + 50);
        int y = (int) (Math.random() * 400 + 50);
        Target t = new Target(x, y);
        targets[i] = t;
        
    }
        int x = (int) (Math.random() * 650 + 50);
        int y = (int) (Math.random() * 400 + 50);
        begin = new Begin (300, 200);
        this.addMouseListener(this);
        t = new Target (399,200);
        for (int i = 0; i < targets.length; i++) {
        mama = targets[i].getY() + 60;
        joe = targets[i].getX() + 60;
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/30);
        super.setSize(800,600);
        scoreTimer = 69;
        tLeft = 420;
        toDraw2 = ("Targets Left:" + tLeft);
        toDraw1 = ("Score:" + scoreTimer);
    }
     private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
            begin.update();
            for (int i = 0; i < targets.length; i++) {
                targets[i].update();
            }
            //t.update();
        }
     }
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.LIGHT_GRAY);
        //if (t.isAlive())t.draw(g);
        if (begin.isAlive()) begin.draw(g);
        if (!begin.isAlive()) {
            if(targets[0].isAlive())targets[0].draw(g);
            for (int i = 1; i < targets.length - 1; i++) {
               if (!targets[i-1].isAlive()) {
                   if (targets[i].isAlive())targets[i].draw(g);
               }
            }
        }
        g.drawString(toDraw1 , 20, 20);
                g.drawString(toDraw2, 20, 40);
       if (begin.isAlive()) g.drawString("Click all 30 targets as quickly as possible; your goal is to have as least points possible", 170, 300);
        
     }
      @Override
    public void mouseExited(MouseEvent event) {

    }
    @Override
    public void mouseEntered(MouseEvent event) {
           
               
           
    }
    @Override
    public void mousePressed(MouseEvent event) {

    }
    @Override
    public void mouseReleased(MouseEvent event) {

    }
    @Override
    public void mouseClicked(MouseEvent e) {
         if ((e.getX() > targets[0].getX() && e.getX() < targets[0].getX() + 60) && (e.getY() > targets[0].getY() && e.getY() < targets[0].getY() + 60)) targets[0].die();
        
        for (int i = 1;i < targets.length; i++) {
        if ((e.getX() > targets[i].getX() && e.getX() < joe) && (e.getY() > targets[i].getY() && e.getY() < mama)) targets[i].die();
        }
        
        if ((e.getX() > begin.getX() && e.getX() < begin.getX() + 200) && (e.getY() > begin.getY() && e.getY() < begin.getY() + 150)) {
            begin.die();
        }
      
        else {
            System.out.println("Miss!");
        }
    }

}
