/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p180524;


public class DecToOthers {
    public  static void main(String args[]){
        int num = 15;
        int base = 8;
        printBase(num, base);
    }
    
    static void printBase(int num, int base){
        int rem = 1;
        String digits = "0123456789abcdef";
        String result = "";
        
        while(num!=0){
            rem = num%base;
            num = num/base;
            result = result.concat(digits.charAt(rem)+"");
        }
        for(int i = result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
    }
    
}
