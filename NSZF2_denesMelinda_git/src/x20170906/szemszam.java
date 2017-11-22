/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20170906;

import java.util.Scanner;

/**
 *
 * @author Denes Melinda
 */
public class szemszam {
        static String l;
        static int db = 0;
        static int k;
        
     public static void main(String[] args) {
         System.out.println("Kérem a személyi számot (Kötőjel nélkül):");
         Scanner cd = new Scanner(System.in);
         l = cd.nextLine();
         if(l.length() > 11 || l.length() < 11)
         {System.out.println("Hibás sz.szám");
             
         }
         else
         {
             for (int i = 0; i <l.length(); i++)
             {
                 k = l.charAt(i);
                 db +=(i)+k;
             }
             int a = db%11;
             System.out.println(a);
             if(a != 9) System.out.println("JRossz");
             else System.out.println("Jó");
         }
    }
}
