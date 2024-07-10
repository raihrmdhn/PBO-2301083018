/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p230424;

/**
 *
 * @author hafiz
 */
public class Student2 extends StudentRecord {
    public Student2(){
        super("Tono","Padang");
//        super(80,80,80);
        System.out.println("Student2 Constructor");
    }
    @Override
    public String getName(){
        System.out.println("Student2 : getName");
        return name;
    }
}
