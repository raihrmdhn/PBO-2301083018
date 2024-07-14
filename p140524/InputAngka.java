/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p140524;

import java.util.Scanner;


public class InputAngka {
    public static void main(String[] args){
        int angka;
        Scanner in = new Scanner(System.in);
        System.out.print("input angka :");
        angka = in.nextInt();
        //try{
            for(int i=0; i<angka;i++){
                if(i%2==1){
                    System.out.println(i);
                }
            }
       // }
    }
    
}
