package com.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {

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
		
		for(String word:words) {
			
			if(word.length()==5)
			{
				System.out.println(word);
			}
		}
	}

	
}
