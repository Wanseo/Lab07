package edu.handong.csee.java.lab07.prob1; // class YearToCentury_main is included in this package

//we import class that name Scanner from another developer's package that name java.util
import java.util.Scanner; 

public class YearToCentury_main { //define a class YearToCentury_main to public

	public static void main(String[] args) { //start the class declare

		int yr =0; // year variable declare

		//Scanner is the class name keyboard is a mean for input, define new Scanner class and call object(Data.Action)
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Input year: "); // print the line
		yr = keyboard.nextInt();// assign integer input from keyboard to yr

		YearToCentury year = new YearToCentury(yr); // need to declare the class
		System.out.println(yr + " is " + year.calc_century() + "th century.");
	}

}
