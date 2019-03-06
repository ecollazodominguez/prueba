/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFrame;

/**
 *
 * @author Mirroriced
 */
public class main extends JFrame {
    File fich=null;
    PrintWriter f= null;
    public static String test;
    public String dni= "adasd";

    public static void main(String args[]) throws IOException {
         main m = new main();
        String date = "hola";
        NewJFrame_1 test1 = new NewJFrame_1();
        test1.setVisible(true);
        while (test1.isVisible()) {
            System.out.println("hola");
        }

        System.out.println(main.test);
        m.engadir("prueba",m);
    }

    public String getTest() {
        return test;
    }
    
        public void engadir(String nomeFich,main a) throws IOException{
        f= new PrintWriter (new FileWriter(nomeFich+".txt",true)); //Si true, engade no ficheiro, non sobreescribe
            f.println(a);
            f.close();  
    }

    @Override
    public String toString() {
        return test + " " + dni;
    }
        
}
