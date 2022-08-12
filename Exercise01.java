package com.collection.demo;

import java.util.ArrayList;

public class Exercise01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);		
		numbers.add(7);
		numbers.add(4);
		numbers.add(18);
		numbers.add(20);
		numbers.add(17);
		numbers.add(21);
		numbers.add(15);
		

			
	int evenSum = findSum(numbers);
			
	System.out.println("Even Sum = " + evenSum);
		
	}
	
	public static int findSum(ArrayList<Integer>numbers) {
		
		int evenSum=0;
		
		for(int i=0; i<numbers.size(); i++) {
			
			int n = numbers.get(i);
			
			if(n%2==0)
				evenSum = evenSum +n;
			
		}
	
		return evenSum;
	}
	
}
