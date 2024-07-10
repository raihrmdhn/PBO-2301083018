/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083018.p210524;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hafiz
 */
public class WriteFile {
   public static void main(String[]args) throws IOException{
        System.out.println("Nama File?");
        String filename;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Tulis File " + filename +"...");
        System.out.println("Type q$ untuk berhenti");
        FileOutputStream fos = null;
      try{
            fos = new FileOutputStream(filename);
        } catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
      try{
          boolean done = false;
          int data;
          do{
              data = br.read();
              if((char)data == 'q') {
                  data = br.read();
                  if((char) data == '$'){
                      done = true;
                  }else {
                      fos.write('q');
                      if (data == ' ') {
                          fos.write('_');
                      }else{
                          fos.write(data);
                      }   
                  }
              }else {
                  if (data == ' ') {
                      fos.write('_');
                  }else{
                  fos.write(data);
              }         
              }   
          }while (!done);
      }catch(IOException ex){
          System.out.println("Problem in reading from the file");
        }
}
}
