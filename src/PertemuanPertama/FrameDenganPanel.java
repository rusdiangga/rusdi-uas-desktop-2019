/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPertama;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author Rusdi
 */
public class FrameDenganPanel extends Frame {
    

    /**
     * @param args the command line arguments
     */
     private FrameDenganPanel(String frame_dengan_Panel) {
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        FrameDenganPanel fp = new FrameDenganPanel("Frame dengan Panel");
        Panel pan = new Panel();
        
        fp.setSize(700, 700);
        fp.setBackground(Color.pink);
        fp.setLayout(null);
        pan.setSize(500, 500);
        pan.setBackground(Color.black);
        pan.setLocation(100, 100);
        
        fp.add(pan);
        fp.setVisible(true);
        
    }


    
}
