/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weighted.sum;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class WeightedSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Enter the number:");
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       char[] strs = str.toCharArray();
       int[] ints = new int[str.length()];
       for(int i = 0; i < ints.length; i++){
           ints[i] = Character.getNumericValue(strs[i]);
       }
       int multiplier = 1;
       int sum = 0;
       for(int i = 0; i < ints.length; i++){
           int value = ints[i];
           sum = sum + (value * multiplier);
           multiplier++;
       }
       System.out.println("weighted sum is " + sum);
    }
    
}
