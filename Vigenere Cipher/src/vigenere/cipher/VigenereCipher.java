/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vigenere.cipher;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class VigenereCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase().toCharArray();
        final ArrayList<Character> alphabet = new ArrayList();
        for (char ch : alph) {
            alphabet.add(ch);
        }
        System.out.println(alphabet);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text to encrypt");
        char[] text = s.nextLine().toCharArray();
        System.out.println("Enter the key");
        char[] key = s.nextLine().toCharArray();
        int keyindex = 0;
        int textindex = 0;
        char[] encrypt = new char[text.length];
        int encryptindex = 0;
        while (textindex < text.length) {
            char t = text[textindex];
            char k = key[keyindex];
            if (t == ' ') {
                encrypt[encryptindex] = t;
                keyindex--;
            } else {
                int alphabetindex = alphabet.indexOf(k);
                ArrayList<Character> newlist = new ArrayList(alphabet);
                for (int i = 0; i < alphabetindex; i++) {
                    Character addback = alphabet.get(i);
                    //System.out.println(addback);
                    newlist.remove(0);
                    //System.out.println(newlist);
                    newlist.add(addback);
                }
                int cipherindex = alphabet.indexOf(t);
                char addtoencrypt = newlist.get(cipherindex);
                encrypt[encryptindex] = addtoencrypt;
            }
            textindex++;
            keyindex++;
            if (keyindex == key.length) {
                keyindex = 0;
            }
            encryptindex++;
        }
        for(char c: encrypt)
            System.out.print(c);
    }

}
