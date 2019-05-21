/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKeempat;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Rusdi
 */
public class Swing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          LatihanSwing grid = new LatihanSwing();
        JFrame swingFrame = new JFrame();
        swingFrame.setLayout(new GridLayout(2,2));
        
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        
        Border borderGaris = BorderFactory.createLineBorder(Color.white, 8);
        Border borderGaris1 = BorderFactory.createEtchedBorder(Color.white, Color.green);
        Border borderGaris2 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        
        button1.setBorder(borderGaris);
        button1.setBackground(Color.pink);
        button2.setBorder(borderGaris1);
        button2.setBackground(Color.red);
        button3.setBorder(borderGaris2);
        button3.setBackground(Color.yellow);
        
        swingFrame.add(button1);
        swingFrame.add(button2);
        swingFrame.add(button3);
        swingFrame.setSize(200, 200);
        swingFrame.setVisible(true);  
    }
    
}
