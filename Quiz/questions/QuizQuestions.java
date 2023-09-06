/*
 * Created by: Jacob Roe
 * Created On: 10/7/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/7/2022	Jacob Roe		Initial Implementation
 * 
 * Description: This program creates a quiz containing five multiple choice questions
 */
package questions;

import java.util.Scanner; //needed to use keyboard scanner

public class QuizQuestions {
	
	//Main Method
	
	public static void main(String[] args) {
		
		//Create all variables 
		char Q1;
		char Q2;
		char Q3;
		char Q4;
		char Q5;
		double correct = 0.0;
		double incorrect = 0.0;
		double total = 0.0;
		double grade;
		
		// Introduction to Quiz
		System.out.println("Welcome to the Pokemon Quiz!");
		
		//increase total question count by 1
		total = total + 1;
		
		//Question 1 with options
		System.out.println("Question 1: What type of Pokemon is Bulasaur?");
		System.out.println("A: Electric Type");
		System.out.println("B: Fire Type");
		System.out.println("C: Grass Type");
		System.out.println("D: Normal Type");
		System.out.println("E: Water Type");
		System.out.println("Enter Selection:");
		
		Q1 = inputValidator();
		
		//If then else loop to determine course of action based on the users input
		if (Q1 =='C' || Q1 =='c') {
			
			correct = correct + 1; //increase the double for correct answers by 1
			
			System.out.println("Congrats " + Q1 + " is correct!");
			
		}
		else {
			
			incorrect = incorrect + 1; //decrease the double for incorrect answers by 1
			
			System.out.println("Your answer of: " + Q1 + " is incorrect.");
			System.out.println("Bulbasaur is a Grass Type!");
		}
		
		//increase total question count by 1
		total = total + 1;
				
		//Question 2 with options
		System.out.println("Question 2: What type of Pokemon is Charmander?");
		System.out.println("A: Electric Type");
		System.out.println("B: Fire Type");
		System.out.println("C: Grass Type");
		System.out.println("D: Normal Type");
		System.out.println("E: Water Type");
		System.out.println("Enter Selection:");
				
		Q2 = inputValidator();
				
		//If then else loop to determine course of action based on the users input
		if (Q2 =='B' || Q2 =='b') {
			
			correct = correct + 1; //increase the double for correct answers by 1
			
			System.out.println("Congrats " + Q2 + " is correct!");
		}
		else {
			
			incorrect = incorrect + 1; //decrease the double for incorrect answers by 1
			
			System.out.println("Your answer of: " + Q2 + " is incorrect.");
			System.out.println("Charmander is a Fire Type!");
		}
			
		//increase total question count by 1
		total = total + 1;
				
		//Question 3 with options
		System.out.println("Question 3: What type of Pokemon is Squirtle?");
		System.out.println("A: Electric Type");
		System.out.println("B: Fire Type");
		System.out.println("C: Grass Type");
		System.out.println("D: Normal Type");
		System.out.println("E: Water Type");
		System.out.println("Enter Selection:");
				
		Q3 = inputValidator();
				
		//If then else loop to determine course of action based on the users input
		if (Q3 =='E' || Q3 =='e') {
			
			correct = correct + 1; //increase the double for correct answers by 1
			
			System.out.println("Congrats " + Q3 + " is correct!");
		}
		else {
			
			incorrect = incorrect + 1; //decrease the double for incorrect answers by 1
			
			System.out.println("Your answer of: " + Q3 + " is incorrect.");
			System.out.println("Squirtle is a Water Type!");
		}
			
		//increase total question count by 1
		total = total + 1;
		
		//Question 4 with options
		System.out.println("Question 4: What type of Pokemon is Pikachu?");
		System.out.println("A: Electric Type");
		System.out.println("B: Fire Type");
		System.out.println("C: Grass Type");
		System.out.println("D: Normal Type");
		System.out.println("E: Water Type");
		System.out.println("Enter Selection:");
				
		Q4 = inputValidator();
				
		//If then else loop to determine course of action based on the users input
		if (Q4 =='A' || Q4 =='a') {
			
			correct = correct + 1; //increase the double for correct answers by 1
			
			System.out.println("Congrats " + Q4 + " is correct!");
		}
		else {
			
			incorrect = incorrect + 1; //decrease the double for incorrect answers by 1
			
			System.out.println("Your answer of: " + Q4 + " is incorrect.");
			System.out.println("Pikachu is an Electric Type!");
		}
			
		//increase total question count by 1
		total = total + 1;
		
		//Question 5 with options
		System.out.println("Question 5: What type of Pokemon is Eevee?");
		System.out.println("A: Electric Type");
		System.out.println("B: Fire Type");
		System.out.println("C: Grass Type");
		System.out.println("D: Normal Type");
		System.out.println("E: Water Type");
		System.out.println("Enter Selection:");
				
		Q5 = inputValidator();
				
		//If then else loop to determine course of action based on the users input
		if (Q5 =='D' || Q5 =='d') {
			
			correct = correct + 1; //increase the double for correct answers by 1
			
			System.out.println("Congrats " + Q5 + " is correct!");
		}
		else {
			
			incorrect = incorrect + 1; //decrease the double for incorrect answers by 1
			
			System.out.println("Your answer of: " + Q5 + " is incorrect.");
			System.out.println("Eevee is a Normal Type!");
		}
		
		//set grade to the calculated percentage
		grade = calcs(correct, total);
		
		//Call final print method
		results(correct, incorrect, total, grade);
		
	}
	
	//Method for capturing and validating user input
	public static char inputValidator(){
		char type;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Create a keyboard variable for capturing values entered		
		type = keyboard.next().charAt(0);
		
		//While loop to validate that the user input is one of the available options
		while (type != 'A' && type != 'a' && type != 'B' && type != 'b' && type != 'C' && type != 'c' && type != 'D' && type != 'd' && type != 'E' && type != 'e')
		{
			System.out.println("invalid input, please enter an A, B, C, D, or E: ");
			type = keyboard.next().charAt(0);
		}
		
		return type;
	}
	
	//Method for calculations
	public static double calcs(double correct, double total) {
		double grade;
		grade = correct / total * 100; //calculation to determine grade
		return grade;
		
	}
	
	//Method to display final scores
	public static void results(double correct, double incorrect, double total, double grade) {
		
		
		//Print final results
		System.out.println("Here are your results: ");
		System.out.println("Correct Answers: " + correct + " out of: " + total);
		System.out.println("Incorrect Answers: " + incorrect + " out of: " + total);
		System.out.println("Percentage Grade: " + grade + "%");
	}
	
}
