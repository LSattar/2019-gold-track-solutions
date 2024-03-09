/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overlapping.rectangles;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class OverlappingRectangles {

    public static void main(String[] args) {
        System.out.println("Enter corners of rectangle 1:");
        Scanner s = new Scanner(System.in);
        int rect1x1 = s.nextInt();
        int rect1y1 = s.nextInt();
        int rect1x2 = s.nextInt();
        int rect1y2 = s.nextInt();
        s.nextLine();
        System.out.println("Enter corners of rectangle 2:");
        int rect2x1 = s.nextInt();
        int rect2y1 = s.nextInt();
        int rect2x2 = s.nextInt();
        int rect2y2 = s.nextInt();
        s.nextLine();

        int overlapheight;
        int overlapwidth;

        int rect1area = Math.abs(rect1x1 - rect1x2) * Math.abs(rect1y1 - rect1y2);
        int rect2area = Math.abs(rect2x1 - rect2x2) * Math.abs(rect2y1 - rect2y2);

        if (Math.max(rect1x1, rect1x2) > Math.min(rect2x2, rect2x1)) {
            overlapwidth = Math.abs(Math.max(rect1x1, rect1x2) - Math.min(rect2x2, rect2x1));
            if ((Math.max(rect1y1, rect1y2) > Math.min(rect2y2, rect2y1)) && (Math.max(rect1y1, rect1y2) > Math.max(rect2y2, rect2y1))) {
                overlapheight = Math.abs(Math.min(rect1y1, rect1y2) - Math.max(rect2y2, rect2y1));
            } else {
                overlapheight = Math.abs(Math.max(rect1y1, rect1y2) - Math.min(rect2y2, rect2y1));
            }
        } else {
            overlapwidth = Math.abs(Math.min(rect1x1, rect1x2) - Math.max(rect2x2, rect2x1));
            if ((Math.max(rect1y1, rect1y2) > Math.min(rect2y2, rect2y1)) && (Math.max(rect1y1, rect1y2) > Math.max(rect2y2, rect2y1))) {
                overlapheight = Math.abs(Math.min(rect1y1, rect1y2) - Math.max(rect2y2, rect2y1));
            } else {
                overlapheight = Math.abs(Math.max(rect1y1, rect1y2) - Math.min(rect2y2, rect2y1));
            }
        }

        float overlaparea = overlapheight * overlapwidth;
        float totalarea = rect1area + rect2area - overlaparea;

        System.out.printf("Overlap area %.1f\n", overlaparea);
        System.out.printf("Total area %.1f", +totalarea);

    }

}
