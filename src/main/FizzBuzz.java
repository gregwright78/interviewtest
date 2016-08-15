package main;

import java.util.ArrayList;
import java.util.HashMap;

public class FizzBuzz {

	public static ArrayList<String> generateStringArray(int[] testIntArray) {
		ArrayList<String> arrayListResult = new ArrayList<String>();
		for (int i = 0; i < testIntArray.length; i++) {
			if ((testIntArray[i] % 3 == 0 && testIntArray[i] / 3 == 1) || testIntArray[i] % 10 == 3) {
				arrayListResult.add("homeoffice");
			} else if (testIntArray[i] % 3 == 0 && testIntArray[i] % 5 == 0) {
				arrayListResult.add("FizzBuzz");
			} else if (testIntArray[i] % 3 == 0) {
				arrayListResult.add("Fizz");
			} else if (testIntArray[i] % 5 == 0) {
				arrayListResult.add("Buzz");
			} else {
				arrayListResult.add(new Integer(testIntArray[i]).toString());
			}

		}

		return arrayListResult;
	}

	public static HashMap<String, Integer> generateWordCount(ArrayList<String> resultStringArray) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();

		int resultHomeOffice = 0;
		int resultBuzz = 0;
		int resultFizz = 0;
		int resultFizzBuzz = 0;

		for (int i = 0; i < resultStringArray.size(); i++) {

			if (resultStringArray.get(i).equals("homeoffice")) {
				resultHomeOffice += 1;
			} else if (resultStringArray.get(i).equals("Buzz")) {
				resultBuzz += 1;
			} else if (resultStringArray.get(i).equals("Fizz")) {
				resultFizz += 1;
			} else if (resultStringArray.get(i).equals("FizzBuzz")) {
				resultFizzBuzz += 1;
			}
		}
		
		result.put("homeoffice", resultHomeOffice);
		result.put("Buzz", resultBuzz);
		result.put("Fizz", resultFizz);
		result.put("FizzBuzz", resultFizzBuzz);
		return result;
	}

}
