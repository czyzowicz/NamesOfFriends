package sda.java9.wpj.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NamesOfFriends
{
	public static void main (String ... args)
	{
		Scanner input = new Scanner (System.in);
					 
		int numberOfFriends = 0;
		do 
		{
			System.out.println("How many friends do you have");
			try 
			{
			numberOfFriends = input.nextInt();
			if (numberOfFriends <= 0) 
			{
				System.err.println("Please provide valid number of friends (greater than 0)");
			}
			} 
			catch (InputMismatchException ime) 
			{
				String wrongToken = input.next();
				System.err.println("Please provide numberical value, not " + wrongToken);
			}
		} 
		while (numberOfFriends <= 0);
		
		System.out.println("Thank you. You have many friends.");
						
		String [] names = new String [numberOfFriends];
		
		for (int i = 0; i < numberOfFriends; i++)
		{
			System.out.println("\nPlease enter the name of friend"+(i+1));
			names [i] = input.next();
		}
		
		input.close();
		
		System.out.println("\nYour friends are:");
		for (int i = 0; i < numberOfFriends; i++)
		{
			System.out.println(names [i]);
		}
	}
}