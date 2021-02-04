/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import java.util.Scanner;
/**
 *
 * @author indi
 */
public class Pohon {
    
    
    private String nama;
    private int tinggi;
    
    public void setNama(String newNama){
        nama = newNama;
    }
    
    public void setTinggi(int newTinggi){
        tinggi = newTinggi;
    }
    
    public String getNama(){
      return nama;
    }
    
    public int getTinggi(){
        return tinggi;
    }
}
