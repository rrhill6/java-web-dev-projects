package org.launchcode;
import java.util.Scanner;
public class areaofacircle {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + input + "is:" + area);
    }
}