/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPertama;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author Rusdi
 */
public class FrameMilikku extends Frame{

    /**
     * @param args the command line arguments
     */
    private FrameMilikku(String ini_Frame_baru){
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrameMilikku fm = new FrameMilikku("ini frame baru");
    
        fm.setSize(1200,800);
        fm.setBackground(Color.blue);
        fm.setVisible(true);
    }
    
}
