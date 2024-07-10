/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p180524;

/**
 *
 * @author hafiz
 */
public class FPB {
    public static int FPB(int x, int y){
        while(y!=0){
            int z = y;
            y = x%y;
            x = z;
        }
        return x;
    }
    
    public static void main(String args[]){
        int x = 30;
        int y = 15;
        int fpb = FPB(x, y);
        System.out.print("FPB dari "+x+" dan " +y+ " adalah " +fpb);
    }
    
}
