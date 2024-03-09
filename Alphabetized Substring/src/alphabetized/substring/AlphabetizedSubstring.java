/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alphabetized.substring;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class AlphabetizedSubstring {

    //a <b <c <d
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int end = 0;
        int ansend = 0;
        int length = 0;
        int newlength = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) {
                end = i;
                newlength++;
            }
            if (str.charAt(i) > str.charAt(i + 1)||i == str.length()) {
                if(length < newlength) {
                    ansend = end + 1;
                    length = newlength;
                }
                newlength = 0;
            }
        }
        if(length < newlength){
            length = newlength;
            ansend = end + 1;
        }
        int ansstart = Math.max(0, ansend - length);
        System.out.println(str.substring(ansstart, ansend + 1));
    }
}
