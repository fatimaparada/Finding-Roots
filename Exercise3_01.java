/*
Author: Fatima Parada-Taboada
Net id: fnp170130
Program overview: This program finds the roots using the quadratic formula with values inputted by user.
*/ 

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class Exercise3_1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		double disc;

		System.out.print("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		disc = b * b - 4 * a * c;
		if (disc < 0 ) {
			System.out.printLn("The equation has no real roots");
		}
		else if (disc == 0) {
			double r1 = -b / (2 * a);
			System.out.printLn("The equation has one real root " + r1);
		}
		else {
			double r1 = (-b + Math.pow(disc, 0.5)) / (2 * a);
			double r2 = (-b + Math.pow(disc, 0.5)) / (2 * a);
			System.out.printLn("The equation has two real roots " + r1 + " and " + r2);
		}


				
	}

}