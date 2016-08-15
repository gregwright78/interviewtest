package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.FizzBuzz;

public class TestFizzBuzz {

	@Test
	public void testFizzBuzz() {
		int[] testIntArray = {3,5,6,9,15,16};
		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("Fizz");
		expectedResult.add("Buzz");
		expectedResult.add("Fizz");
		expectedResult.add("Fizz");
		expectedResult.add("FizzBuzz");
		expectedResult.add("16");
		
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(0), expectedResult.get(0));
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(1), expectedResult.get(1));
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(2), expectedResult.get(2));
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(3), expectedResult.get(3));
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(4), expectedResult.get(4));
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(5), expectedResult.get(5));
	}
	
	@Test
	public void testFizzBuzz1to20() {
		int[] testIntArray = new int[20];
		for (int i=0; i<20; i++) {
			testIntArray[i]=i+1;
		}
		
		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("1");
		expectedResult.add("2");
		expectedResult.add("Fizz");
		expectedResult.add("4");
		expectedResult.add("Buzz");
		expectedResult.add("Fizz");
		expectedResult.add("7");
		
		ArrayList<String> ResultStringArray = FizzBuzz.generateStringArray(testIntArray);
		
		assertEquals(ResultStringArray.get(0), expectedResult.get(0));
		assertEquals(ResultStringArray.get(1), expectedResult.get(1));
		assertEquals(ResultStringArray.get(2), expectedResult.get(2));
		assertEquals(ResultStringArray.get(3), expectedResult.get(3));
		assertEquals(ResultStringArray.get(4), expectedResult.get(4));
		assertEquals(ResultStringArray.get(5), expectedResult.get(5));
		assertEquals(ResultStringArray.get(6), expectedResult.get(6));
		
		for (int i=0; i<20; i++) {
			System.out.println(ResultStringArray.get(i));
		}
	}

}
