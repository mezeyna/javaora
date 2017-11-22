/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171108;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Dénes Melinsa
 */

class Tanulo implements Serializable{
    String nev;
    Integer kor;
}
public class serialization {
    public static void make() throws IOException{
      Tanulo sanyi = new Tanulo();
      sanyi.nev = "Rózsa Sándor";
      sanyi.kor = 160;
      
      Tanulo mari = new Tanulo();
      mari.nev = "Kiss Mária";
      mari.kor = 16;
      
      Tanulo meli = new Tanulo();
      mari.nev = "Dénes Melinda";
      mari.kor = 24;
      
      FileOutputStream fos = new FileOutputStream("adat.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(sanyi);
      oos.writeObject(mari);
      oos.writeObject(meli);
      oos.close();
    }
    private static void load() throws IOException, ClassNotFoundException{
        Tanulo egy = new Tanulo();
        Tanulo ketto = new Tanulo();
        FileInputStream fis = new FileInputStream("adat.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        egy = (Tanulo) ois.readObject();
        ketto = (Tanulo) ois.readObject();
        ois.close();
        
        System.out.println("adat1/1: " + egy.nev);
        System.out.println("adat1/2: " + egy.kor);
        
        System.out.println("adat2/1: " + ketto.nev);
        System.out.println("adat2/2: " + ketto.kor);
        
        
        
	
    }
    private static void load2() throws IOException, ClassNotFoundException{
        try{
            FileInputStream fis = new FileInputStream("adat.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                Tanulo student = (Tanulo) ois.readObject();
                System.out.println(student.nev);
                System.out.println(student.kor);
            }
        }catch (EOFException eof){
            System.out.println("Vége a fájlnak");   
            
        }
        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
 
    }
    public static void main(String[] args ) throws IOException, ClassNotFoundException{
        make();
        //load();
        load2();
        
        
    }
    
}
