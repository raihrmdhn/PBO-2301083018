/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p190324;

import java.util.Scanner;


public class GanjilGenap {
    public static void main(String[] args){
        int a;
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat : ");
        a = input.nextInt();
        if(a%2==0)
            System.out.println(a + " merupakan bilangan genap");
        else
            System.out.println(a + " merupakan bilangan ganjil");
    }
}
