package main;

import java.util.ArrayList;

public class FizzBuzz {

	public static ArrayList<String> generateStringArray(int[] testIntArray) {
		ArrayList<String> arrayListResult = new ArrayList<String>();		
		for (int i=0; i<testIntArray.length; i++) {
			if (testIntArray[i]%3==0) {
				arrayListResult.add("Fizz");
			} else if (testIntArray[i]%3==0) {
				arrayListResult.add("Buzz");
			} else if (testIntArray[i]%3==0 && testIntArray[i]%3==0) {
				arrayListResult.add("Fizz Buzz");
			} else {
				arrayListResult.add(new Integer(testIntArray[i]).toString());
			}
				
		}
		
		return arrayListResult;
	}

}
