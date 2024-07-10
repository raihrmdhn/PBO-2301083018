/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p140524;

/**
 *
 * @author hafiz
 */
public class DivByZero {
    public static void main(String args[]){
        try{
            //int angka = Integer.parseInt(args[0]);
            System.out.println(3 / 0);
            System.out.println("cetak");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Argument tidak ada :"+ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("bagi dengan 0 :"+ex.getMessage());
        }finally{
            System.out.println("Block finally setelah Exception");
        }
        
    }
    
}
