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
public class LayoutGrid {

    private Frame f;
    private Button b1, b2, b3, b4, b5, b6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LayoutGrid contohGrid = new LayoutGrid();
        contohGrid.tampil();
        
    }

    private void tampil() {
        f = new Frame("Grid Layout");
        f.setLayout(new GridLayout(3,2));
        
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.setSize(200, 200);
        f.setVisible(true);
            
    }
    
}
