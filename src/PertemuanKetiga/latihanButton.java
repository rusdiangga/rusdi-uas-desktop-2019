/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Rusdi
 */
public class latihanButton {
   static Button b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Frame f = new Frame("Coba komponen button");
       b.setActionCommand("Tombol telah di Click");
       b.addActionListener(new ButtonHandler());
        
        f.add(b);
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(" "+getActionCommand());
            System.out.println("tombol telah di klik");
        }

        private String getActionCommand() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
}
