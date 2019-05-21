/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Rusdi
 */
public class LatihanLabel {
    static Label l;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame f = new Frame("Latihan Label");
        f.setLayout(new GridLayout(4,2));
        Checkbox satu = new Checkbox("satu", true);
        Checkbox dua = new Checkbox("dua", true);
        Checkbox tiga = new Checkbox("tiga", true);
        
        satu.addItemListener(new latihanCheckBox.Handler());
        dua.addItemListener(new latihanCheckBox.Handler());
        tiga.addItemListener(new latihanCheckBox.Handler());
        
        l = new Label("Rusdi Angga");
        f.add(satu);
        f.add(dua);
        f.add(tiga);
        f.add(l);
        f.setSize(200, 200);
        f.setVisible(true);
    }
    static class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            String pilih = "Tidak";
            if (e.getStateChange() == ItemEvent.SELECTED){
                pilih = "Ya";
            }
            l.setText(pilih);
            System.out.println(" "+ pilih);
        }
    }
    
}
