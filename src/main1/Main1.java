/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author indi
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pohon io = new Pohon();
        
        io.setNama("Cemara");
        io.setTinggi(5);
                
        System.out.println("Nama Pohon "+io.getNama());
        System.out.println("Tinggi Pohon "+io.getTinggi()+" Meter");
        
        io.setNama("Kelapa");
        io.setTinggi(7);
        
        System.out.println("Nama Pohon "+io.getNama());
        System.out.println("Tinggi Pohon "+io.getTinggi()+" Meter");
    }
    
}
