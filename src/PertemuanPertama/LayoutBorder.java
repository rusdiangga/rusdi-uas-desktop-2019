/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPertama;

import java.awt.*;

/**
 *
 * @author Rusdi
 */
public class LayoutBorder {

    private Frame f;
    private Button bn, bs, bw, be, bc;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LayoutBorder contohBorder = new LayoutBorder();
        contohBorder.tampil();
        
    }

    private void tampil() {
        f = new Frame("Border Layout");
        bn = new Button("b1");
        bs = new Button("b2");
        bw = new Button("b3");
        be = new Button("b4");
        bc = new Button("b5");
        
        f.add(bn, BorderLayout.NORTH);
        f.add(bs, BorderLayout.SOUTH);
        f.add(bw, BorderLayout.WEST);
        f.add(be, BorderLayout.EAST);
        f.add(bc, BorderLayout.CENTER);
        f.setSize(200, 200);
        f.setVisible(true);
    }
    
}
