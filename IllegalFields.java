package javaExamples;

import java.util.Scanner;

public class IllegalFields {
	
	public static void main(String[] args) {
	
		class Sandwich {
			  String  name;
			  String  description;
			  int    calories;
			  double     price; // was int, changed to double for decimal places
			  // int	words;	   // commented out to show different type error
			}
		
		Sandwich hamburger = new Sandwich();
		
		hamburger.name = "Hamburger ";
		hamburger.description = "Grilled beef patty on a bun.";
		hamburger.calories = 200;
		hamburger.price = 2.00;
		System.out.println(hamburger.name + System.lineSeparator() + hamburger.description + System.lineSeparator() + hamburger.calories + " calories" + System.lineSeparator() + "$ " + hamburger.price);
	} 
	

} 
