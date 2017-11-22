/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20170913;

/**
 *
 * @author Tanulo
 */
public class szemszam2 {

    static String sz;
    static int db = 0;
    int k;

    public static void main(String[] args) {
        //sz=extra.Console.readLine(+személyi szám:\n");
        sz = "28006181231";

        int elso = Character.getNumericValue(sz.charAt(0));
        int utolso = Character.getNumericValue(sz.charAt(10));
        //int ellen = Character.getNumericValue(sz.charAt(i));

        System.out.println("A bekért szám: " + sz);
        System.out.println("Az első számjegy: " + elso);
        System.out.println("Az utolsó számjegy " + utolso);

        for (int i = 0; i < sz.length(); i++) {
 
            db += Character.getNumericValue(sz.charAt(i))*(i+1);
        }
        
        int a = db % 11;
        System.out.println("Ellenőrző összeg: "+a);
        
        if (a != utolso) {
            System.out.println("Rossz személyi szám: " + sz);
        } else {
            System.out.println("Jó");
        }
    }

}
