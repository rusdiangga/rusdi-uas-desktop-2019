/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Rusdi
 */
public class TeksButton {
    Frame f;
    Button a, b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //buat objek dari frame dan button
        Frame f = new Frame("Testing");
        Button a = new Button("1");
        a.setSize(150,150);
        Button b = new Button("2");
        b.setSize(150,150);
        
        a.addActionListener(new ButtonHandler());
        b.addActionListener(new ButtonHandler1());
        
        f.add(a, BorderLayout.WEST);
        f.add(b, BorderLayout.EAST);
        f.setSize(300,300);
        f.setVisible(true);
    }

    private static class ButtonHandler implements ActionListener {

        public ButtonHandler() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.println("ini adalah barisan button kiri");
           System.out.println("Button yang di Klik : " + e.getActionCommand());
        }
    }
    private static class ButtonHandler1 implements ActionListener {

        public ButtonHandler1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.println("ini adalah barisan button kanan");
           System.out.println("Button yang di Klik : " + e.getActionCommand());
        }
    }
}
