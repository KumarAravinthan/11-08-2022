package com.collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
     List<String> words = new ArrayList<String>();
		
        
        words.add("Eagle");  
		words.add("Owl");  
		words.add("Crane");  
		words.add("Robin");
		words.add("Turkey");
		words.add("Bat");
		words.add("Parrot");
		words.add("Ostrich");
		words.add("Crow");
	
	
		
		printWord(words);

	}

	public static void printWord(List<String> words)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word length");
		
		int length=sc.nextInt();
		
		
		for (int i=0;i<words.size();i++) {
			
		String n=words.get(i);
		
		if(n.length()==length)
			{
				System.out.println(n);
			}
		}
	}
}
