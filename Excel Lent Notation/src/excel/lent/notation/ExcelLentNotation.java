/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excel.lent.notation;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class ExcelLentNotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] alph = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase().toCharArray();
        final ArrayList<Character> alphabet = new ArrayList();
        for (char ch : alph) {
            alphabet.add(ch);
        }

        System.out.println("Enter cell addresses");
        Scanner s = new Scanner(System.in);
        ArrayList<String> addresses = new ArrayList();
        ArrayList<String> ans = new ArrayList();
        String column = "";
        String row ="";
        String str ="";
        while(!str.equals("r0c0")){
            str = s.nextLine();
            addresses.add(str);
        }
        addresses.remove(addresses.size()-1);
        for(String a :addresses){
        int columnstart = a.indexOf("c");
        row = (a.substring(1, columnstart));
        int colnum = Integer.parseInt(a.substring(columnstart + 1));
        if (colnum <= 26) {
            column = alphabet.get(colnum).toString();
        } else {
            while (colnum >= 26) {
                int remainder = (colnum)% 26;
                int divisor = (int) Math.floor((colnum-1) / 26);
                String col = alphabet.get(remainder).toString();
                column = col.concat(column);
                if (divisor <= 26) {
                    col = alphabet.get(divisor).toString();
                    column = col.concat(column);
                }
                colnum = divisor;
            }
        }
        ans.add((column.concat(row)).toUpperCase());
        column = "";
        }

        for(String adds : ans){
            System.out.println(adds);
        }

        //ITS THE SAME FORMULA AS CONVERTING TO HEX BUT WITH 26 INSTEAD
    }

}
