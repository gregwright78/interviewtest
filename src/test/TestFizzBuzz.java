package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import main.FizzBuzz;

public class TestFizzBuzz {

	@Test
	public void testFizzBuzz() {
		int[] testIntArray = {3,5,6,9,15,16,13};
		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("homeoffice");
		expectedResult.add("Buzz");
		expectedResult.add("Fizz");
		expectedResult.add("Fizz");
		expectedResult.add("FizzBuzz");
		expectedResult.add("16");
		expectedResult.add("homeoffice");
		
		ArrayList<String> ResultStringArray = FizzBuzz.generateStringArray(testIntArray);
		
		assertEquals(ResultStringArray.get(0), expectedResult.get(0));
		assertEquals(ResultStringArray.get(1), expectedResult.get(1));
		assertEquals(ResultStringArray.get(2), expectedResult.get(2));
		assertEquals(ResultStringArray.get(3), expectedResult.get(3));
		assertEquals(ResultStringArray.get(4), expectedResult.get(4));
		assertEquals(ResultStringArray.get(5), expectedResult.get(5));
		assertEquals(ResultStringArray.get(6), expectedResult.get(6));
	}
	
	@Test
	public void testFizzBuzz1to20() {
		int[] testIntArray = new int[20];
		for (int i=0; i<20; i++) {
			testIntArray[i]=i+1;
		}
		
		ArrayList<String> ResultStringArray = FizzBuzz.generateStringArray(testIntArray);
				
		for (int i=0; i<20; i++) {
			System.out.println(ResultStringArray.get(i));
		}
	}
	
	@Test
	public void testGenerateWordCount() {
		int[] testIntArray = new int[20];
		for (int i=0; i<20; i++) {
			testIntArray[i]=i+1;
		}
		
		ArrayList<String> ResultStringArray = FizzBuzz.generateStringArray(testIntArray);
		HashMap<String,Integer> wordCount = FizzBuzz.generateWordCount(ResultStringArray);
		
		for (int i=0; i<20; i++) {
			System.out.println(ResultStringArray.get(i));
		}
		
		HashMap<String, Integer> expectedResult = new HashMap<String, Integer>();
		expectedResult.put("homeoffice", 2);
		expectedResult.put("Buzz", 3);
		expectedResult.put("Fizz", 4);
		expectedResult.put("FizzBuzz", 1);
		
		assertEquals(wordCount.get("homeoffice"), expectedResult.get("homeoffice"));
		assertEquals(wordCount.get("Buzz"), expectedResult.get("Buzz"));
		assertEquals(wordCount.get("Fizz"), expectedResult.get("Fizz"));
		assertEquals(wordCount.get("FizzBuzz"), expectedResult.get("FizzBuzz"));
		
	}
	
	

}
