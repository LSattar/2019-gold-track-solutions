/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class SubtractLeadingDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the starting number:");
        Scanner s = new Scanner(System.in);
        int startnum = s.nextInt();
        s.nextLine();
        System.out.println("Enter the ending number:");
        int endnum = s.nextInt();
        int firstdigit = 10;
        int value = startnum;
        int count= 0;
        s.nextLine();
        while(value > endnum){
            int newvalue = value;
            while(firstdigit >= 10){
            if(newvalue < 10){
                firstdigit = newvalue;
            }
            else{
            int div = newvalue%10;
                if(div == 0)
                    firstdigit = newvalue/10;
                else
                    firstdigit = (newvalue-div)/10;
            }
            newvalue = firstdigit;
            }
            value = value - firstdigit;
            firstdigit = 10;
            count++;     
        }
        System.out.println(count + " numbers in sequence");
    }
    
}
