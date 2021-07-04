package com.studyjava.first;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.joran.conditional.ElseAction;

@SpringBootApplication
public class FirstApplication {
	
	public static void main(String[] args) {

		//combination of while loop and if else statement
		Scanner input = new Scanner(System.in);
		System.out.println("Why did you learn JAVA?");
		
		boolean Answer = true;

		while(Answer){
			System.out.println("A. Just For Fun");
			System.out.println("B. I Got A Job Interview");
			System.out.println("C. Im Just Curious!");
			String userInput = input.next();
			
			

			if(userInput.equals("B") || userInput.equals("b") )
			{	
				Answer = false;
				System.out.println("Congratulation!");
			}
			else
			{
				System.out.println(" Try Again!");
			}
			
			
		}
		
		input.close();

		//while loop condition.
		/*Scanner input = new Scanner(System.in);
		boolean isOnRepeat = true;
		while(isOnRepeat){
			System.out.println("Playing current song");
			System.out.println("Would you like to take this song off of repeat? if so, answer yes");
			String userInput = input.next();

			if(userInput.equals("yes"))
			{
				isOnRepeat = false;
			}
			
		}
		System.out.println("Playing next song");*/



		//if else statement condition.
		/*System.out.println("Pick a number between 1 and 10");
		Scanner scanner = new Scanner(System.in);

		int inputtedNum = scanner.nextInt();
		String favoriteFood = "pizza";
		System.out.println(favoriteFood);
		if(inputtedNum < 5){
			favoriteFood = "chicken tacos";
			System.out.println(favoriteFood);
		
		}else
		{
			favoriteFood = "steak";
			System.out.println(favoriteFood);
			
		}*/
		
		//SpringApplication.run(FirstApplication.class, args);

		//first three chapters.
		/*
		System.out.println("Hello World From VS Code from affzkwn!");
		int studentAge = 15;
		double studentGPA = 3.45;
	
		boolean hasPerfectAttendance = true;
		String studentFirstName = "Kayla";
		String studentLastName = "Hammond";
		char studentFirstInitial = studentFirstName.charAt(0);
		char studentLastInitial = studentLastName.charAt(0);

		System.out.println(studentAge);
		System.out.println(studentGPA);
		System.out.println(hasPerfectAttendance);
		System.out.println(studentFirstName);
		System.out.println(studentLastName);
		System.out.println(studentFirstInitial);
		System.out.println(studentLastInitial);

		System.out.println(studentFirstName+ " " + studentLastName+ "has a GPA of "+ studentGPA);
		System.out.println("what do you want to update it to?");

		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();

		System.out.println(studentFirstName+ " " + studentLastName+ "has a GPA of "+ studentGPA);*/
		


		return;
	}
	

}
