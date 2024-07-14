/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p270424;


public class PersegiPanjang implements Relation {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(){
        
    }
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getLuas(){
        int luas = panjang*lebar;
        return luas;
    }
    
    public boolean isGreater(Object a, Object b){
        double aLuas = ((PersegiPanjang) a).getLuas();
        double bLuas = ((PersegiPanjang) b).getLuas();
        return (aLuas > bLuas);
    }
    
    public boolean isLess(Object a, Object b){
        double aLuas = ((PersegiPanjang) a).getLuas();
        double bLuas = ((PersegiPanjang) b).getLuas();
        return (aLuas < bLuas);
    }
    
    public boolean isEqual(Object a, Object b){
        double aLuas = ((PersegiPanjang) a).getLuas();
        double bLuas = ((PersegiPanjang) b).getLuas();
        return (aLuas == bLuas);
    }
    
}
