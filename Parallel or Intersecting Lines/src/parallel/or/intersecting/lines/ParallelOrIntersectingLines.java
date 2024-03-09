/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parallel.or.intersecting.lines;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class ParallelOrIntersectingLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter coordinates for first line(x1 y1 x2 y2");
        String fline = s.nextLine();
        System.out.println("Enter coordinates for second line(x1 y1 x2 y2");
        String sline = s.nextLine();
        String[] fvalues = fline.split(" ");
        String[] svalues = sline.split(" ");
        double fx1 = Float.parseFloat(fvalues[0]);
        double fy1 = Float.parseFloat(fvalues[1]);
        double fx2 = Float.parseFloat(fvalues[2]);
        double fy2 = Float.parseFloat(fvalues[3]);
        double sx1 = Float.parseFloat(svalues[0]);
        double sy1 = Float.parseFloat(svalues[1]);
        double sx2 = Float.parseFloat(svalues[2]);
        double sy2 = Float.parseFloat(svalues[3]);
        
        double flineslope = (fy2 - fy1)/(fx2 - fx1);
        double slineslope = (sy2 - sy1)/(sx2 - sx1);
        
        boolean fvert = false;
        boolean svert = false;
        
        if(Double.isInfinite(flineslope))
            fvert = true;
        if(Double.isInfinite(slineslope))
            svert = true;
        
        if(flineslope == slineslope && svert == true){
            System.out.println("parallel - both vertical");
        }
        else if(flineslope == slineslope){
            System.out.println("parallel");
        }
        else if(fvert == true || svert == true){
            System.out.println("intersecting - one vertical");
        }
        else{
            System.out.println("intersecting");
        }     
    }
    
}
