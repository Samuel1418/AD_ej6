/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author oracle
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           DataInputStream leer =new DataInputStream(new BufferedInputStream(new FileInputStream("/home/oracle/Desktop/ProbaExer4/texto6.txt")));
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            DataOutputStream escribir =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/oracle/Desktop/ProbaExer4/texto6.txt")));
            //Ver si hay algo con el metodo available
            int c;
            //Hay que escribir primero para luego leer. No es como en los ficheros de los ej. anteriores
            escribir.writeUTF("Está en casa");
            escribir.writeChars("Está en casa");
            escribir.writeUTF("Está en casa");
            escribir.close();
            String a="Está en casa";
            
            
            System.out.println("writeUTF escribiu: "+leer.readUTF());
String cadea="";

            //Mientras no lleguemos al limite de la cadena no para de leer
            System.out.println("writeChars escribiu: ");
            for  (c =1 ; c<=a.length();c++) {
               //Que lea todo lo que acabamos de añadir
               cadea = cadea + leer.readChar();     
                
            }  
            System.out.println(cadea);
            System.out.println("writeUTF escribiu: "+leer.readUTF());
            
            leer.close();
            
        } catch (Exception e) {
        }
    }
    
}
