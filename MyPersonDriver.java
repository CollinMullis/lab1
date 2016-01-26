package edu.saintjoe.cmullis;
/**
 * MyPersonDriver
 * January 2016
 * Collin Mullis
 *
 * Purpose:  solution to Lab 1.  Prompt the user for name and ID, store, and print.
 */


import java.util.Scanner;


public class MyPersonDriver {

	public static void main(String[] args) {
				
		Scanner keyboard = new Scanner(System.in); //read from the keyboard
		
		
		System.out.println("Enter student ID: ");
		int iD = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Enter student name: ");
		String newName = keyboard.nextLine();
		keyboard.close();
		
		Person student = new Person(iD, newName);
		
		
		
		System.out.println("Student name: " + student.getName());
		System.out.println("Student ID: " + student.getStudID());
		
	}

}
