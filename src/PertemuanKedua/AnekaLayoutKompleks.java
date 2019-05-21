/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;
import java.awt.*;

/**
 *
 * @author Rusdi
 */
public class AnekaLayoutKompleks {
    private Frame f;
    private Panel p;
    private Button bw, bc;
    private Button bFile, bHelp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnekaLayoutKompleks alk = new AnekaLayoutKompleks();
        alk.tampil();
    }
    
    public void tampil(){
        //buat objek dari frame dan button
        f = new Frame("Aneka Layout");
        bw = new Button("kiri");
        bc = new Button("area kerja");
        
        f.add(bw, BorderLayout.WEST);
        f.add(bc,BorderLayout.CENTER);
        
        //buat obek dari panel
        p = new Panel();
        p.setBackground(Color.blue);
        
        //buat objek dari button
        bFile = new Button("File");
        bHelp = new Button("Help");
        
        //masukkan button kedalam panel
        p.add(bFile);
        p.add(bHelp);
        
        //masukka panel ke dalam frame
        f.add(p, BorderLayout.NORTH);
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
