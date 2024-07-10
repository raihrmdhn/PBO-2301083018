/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p020424;

import java.util.Scanner;

/**
 *
 * @author hafiz
 */
public class BalokExample {
    public static void main(String[] args){
        int p,l,t,la;
        Scanner in = new Scanner(System.in);
        
        //Balok 1
        System.out.println("====Balok 1====");
        Balok b1 = new Balok();
        System.out.print("Panjang = ");
        p = in.nextInt();
        b1.setPanjang(p);
        System.out.print("Lebar = ");
        l = in.nextInt();
        b1.setLebar(l);
        System.out.print("Tinggi = ");
        t = in.nextInt();
        b1.setTinggi(t);
        la = b1.luasAlas();
        b1.printBalok(la, b1.luasPermukaan() , b1.volume());
        
        //Balok 2
        System.out.println("\n====Balok 2====");
        Balok b2 = new Balok(10);
        b2.setLebar(4);
        b2.setTinggi(5);
        b2.printBalok();
        b2.printBalok(b2.luasAlas(), b2.luasPermukaan(), b2.volume(b2.luasAlas()));
        
        //Balok 3
        System.out.println("\n====Balok 3====");
        System.out.print("Panjang = "); 
        p = in.nextInt();
        System.out.print("Lebar = "); 
        l = in.nextInt();
        System.out.print("Tinggi = "); 
        t = in.nextInt();
        Balok b3 = new Balok(p,l,t);
        la = b3.luasAlas();
        b3.printBalok(la, b3.luasPermukaan(), b3.volume(la));
        
    }
    
}
