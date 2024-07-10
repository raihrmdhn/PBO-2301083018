/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p270424;

/**
 *
 * @author hafiz
 */
public class Circle extends Shape {
    private int jari;
    private static float phi=3.14f;

    public Circle(){
    }  
    
    public int getJari(){
        return jari;
    }
    public void setJari(int jari){
        this.jari = jari;
    }
    public String getName(){
        return "Circle";
    }
    public float getArea(){
        return phi*jari*jari;
    }
  
    
}
