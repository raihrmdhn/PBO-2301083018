/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p270424;


public class Persegi implements Relation {
    private int sisi;
    
    public Persegi(){
        
    }
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    
    public int getLuas(){
        int luas = sisi *sisi;
        return luas;
    }
    
    public boolean isGreater(Object a, Object b){
        double aLuas = ((Persegi) a).getLuas();
        double bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
    public boolean isLess(Object a, Object b){
        double aLuas = ((Persegi) a).getLuas();
        double bLuas = ((Persegi) b).getLuas();
        return (aLuas < bLuas);
    }
    
    public boolean isEqual(Object a, Object b){
        double aLuas = ((Persegi) a).getLuas();
        double bLuas = ((Persegi) b).getLuas();
        return (aLuas == bLuas);
    }
   
    
}
