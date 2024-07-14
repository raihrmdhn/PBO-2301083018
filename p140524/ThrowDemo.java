/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p140524;


public class ThrowDemo {
    public static void main(String[] args){
        String input = "Invalid input";
        try{
            if(input.equals("Invalid input")){
                throw new MyException("input");
            }else{
                System.out.println(input);
            }
                
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
