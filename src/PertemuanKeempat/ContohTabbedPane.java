/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKeempat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Rusdi
 */
public class ContohTabbedPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat frame
        JFrame f = new JFrame("Menggunaka tabbed pane");
        
        //membuat tabbed pane
        JPanel panel1 = new JPanel();
        JTabbedPane tabPane = new JTabbedPane();
        
        //parameter1 adlah title
        //parameter ke2 adalah icon
        //parameter ke 3 component
        //parameter ke 4 adalah tip
        tabPane.addTab("First", null, panel1, "official info");
        
        //menambahkan button ke tab pada tabbed pane
        JButton button1 = new JButton("Panel pertama");
        panel1.add(button1);
        
        JPanel panel2 = new JPanel();
        tabPane.addTab("Second", null, panel2, "Seconddary info");
         
         //menambahkan button2 ke tab pada tabbed pane
        JButton button2 = new JButton("Panel Kedua");
        panel2.add(button2);
        
        
        f.getContentPane().add(tabPane);
        f.show();
        f.setSize(200, 200);
        
    }
    
}
