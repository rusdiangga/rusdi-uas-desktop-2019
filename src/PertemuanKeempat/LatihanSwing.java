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
import javax.swing.border.*;

/**
 *
 * @author Rusdi
 */
public class LatihanSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LatihanSwing grid = new LatihanSwing();
        JFrame swingFrame = new JFrame();
        swingFrame.setLayout(new GridLayout(2,2));
        
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
           
        Border borderGaris = BorderFactory.createLineBorder(Color.white, 2);
        Border borderGaris2 = BorderFactory.createLineBorder(Color.black, 2);
        Border borderGaris3 = BorderFactory.createLineBorder(Color.yellow, 2);
        Border borderGaris4 = BorderFactory.createLineBorder(Color.orange, 2);
        
        button1.setBorder(borderGaris);
        button1.setBackground(Color.pink);
        button2.setBorder(borderGaris2);
        button2.setBackground(Color.pink);
        button3.setBorder(borderGaris3);
        button3.setBackground(Color.pink);
        button4.setBorder(borderGaris4);
        button4.setBackground(Color.pink);
        
        swingFrame.add(button1);
        swingFrame.add(button2);
        swingFrame.add(button3);
        swingFrame.add(button4);
        swingFrame.setSize(200, 200);
        swingFrame.setVisible(true);  
    }
    
}
