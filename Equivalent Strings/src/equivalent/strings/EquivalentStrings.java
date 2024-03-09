/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equivalent.strings;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author PP
 */
public class EquivalentStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter first string");
       char[] fstring = s.nextLine().toCharArray();
       System.out.println("Enter second string");
       char[] sstring = s.nextLine().toCharArray();
       boolean eq = true;
       if(sstring.length!=fstring.length)
           eq = false;
       else{            
       for(int i = 0; i < fstring.length; i++){
           char completter = fstring[i];
           char match = sstring[i];
           for(int p = 0; p <fstring.length; p++){
               if((fstring[p] == completter && sstring[p] != match)||(sstring[p] == match && fstring[p] != completter))
                   eq = false;
           }
       }
       }
       if(!eq)
           System.out.println("not equivalent");
       else
           System.out.println("equivalent");
           
       
               
    }
    
}
