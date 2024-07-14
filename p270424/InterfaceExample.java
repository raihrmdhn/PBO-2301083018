/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p270424;


public class InterfaceExample {
    public static void main(String[] args){
        Relation myinteger = new MyInteger();
        System.out.println(myinteger.isEqual(5,5));
        Relation mydouble = new MyDouble();
        System.out.println(mydouble.isEqual(4.3, 4.4));
        
        Line line1 = new Line(1, 5, 2, 4);
        Line line2 = new Line(2, 4, 1, 3);
        
        Relation line = new Line();
        System.out.println(line.isGreater(line1, line2));
        System.out.println("Line 1 = " +line1.getLength());
        System.out.println("Line 2 = " +line2.getLength());
        
        Persegi p1 = new Persegi(2);
        Persegi p2 = new Persegi(4);
        
        Relation persegi = new Persegi();
        System.out.println(persegi.isGreater(p1, p2));
        System.out.println("Luas P1 = "+p1.getLuas());
        System.out.println("Luas P2 = "+p2.getLuas());
        
        PersegiPanjang pp1 = new PersegiPanjang(2,4);
        PersegiPanjang pp2 = new PersegiPanjang(4,8);
        
        Relation persegipanjang = new PersegiPanjang();
        System.out.println(persegipanjang.isGreater(pp1, pp2));
        System.out.println("Luas Persegi Panjang 1 = "+pp1.getLuas());
        System.out.println("Luas Persegi panjang 2 = "+pp2.getLuas());
    }
    
}
