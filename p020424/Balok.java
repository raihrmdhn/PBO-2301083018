/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p020424;

/**
 *
 * @author hafiz
 */
public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok(){
        
    }
    
    public Balok(int panjang){
        this.panjang = panjang;
    }
    
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int luasAlas(){
        int luasAlas = (2*panjang) + (2*lebar);
        return luasAlas;
    }
    
    public int luasPermukaan(){
        int luasPermukaan = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        return luasPermukaan;
    }
    
    public int volume(){
        int volume = panjang*lebar*tinggi;
        return volume;
    }
    
    public int volume(int la){
        int volume = la * tinggi;
        return volume;
    }
    
    public void printBalok(){
        System.out.println("Panjang = " +panjang);
        System.out.println("Lebar = " +lebar);
        System.out.println("Tinggi = " +tinggi);
    }
    
    public void printBalok(int la, int lp, int v){
        System.out.println("Luas Alas = "+la);
        System.out.println("Luas Permukaan = "+lp);
        System.out.println("Volume = "+v);
    }
}
