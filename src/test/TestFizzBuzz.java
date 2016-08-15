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

}
