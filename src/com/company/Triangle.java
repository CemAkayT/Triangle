package com.company;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        System.out.println("let's calculate the area of a triangle");
        Scanner input = new Scanner(System.in);

        System.out.print("please input the base of the triangle here --> ");

        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("thats invalid. Input the base of the triangle");
            base = input.nextDouble();

        }
        System.out.print("Input the height of the triangle --> ");
        double height = input.nextDouble();

        while (height <= 0) {
            System.out.println(" that´s invalid. Input the height of the triangle");
            height = input.nextDouble();
        }
        double area = (base * height) / 2;
        System.out.println("the area of the triangle is = " + area);

    }
}
