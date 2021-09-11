package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        final float conv =  0.09290304f; //f2 to m2 conv
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? ");
        int len = sc.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int wid = sc.nextInt();

        System.out.printf("You entered dimensions of %d by %d feet.%n", len, wid);
        System.out.printf("The area is%n");
        int  areaF2 = len * wid;
        float areaM2 = areaF2 * conv;

        System.out.printf("%d square feet%n", areaF2);
        System.out.printf("%.3f square meters%n", areaM2);


    }
}
