/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseaccuracy;


import javax.swing.JFrame;

/**
 *
 * @author 802811
 */
public class MouseAccuracy extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame j = new MouseAccuracy();
        World c = new World();
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(800, 600);
        j.setVisible(true);
        j.setLocationRelativeTo(null);

    }
    }
    
