/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p180524;


public class DecToOthersRecur {
    static void printBase(int num, int base){
        String digits = "0123456789abcedef";
        if (num >= base){
            printBase(num/base,base);
        }
        System.out.print(digits.charAt(num%base));
    }
    public static void main(String args[]){
        int num = 15;
        int base = 8;
        printBase(num, base);
    }
    
}
