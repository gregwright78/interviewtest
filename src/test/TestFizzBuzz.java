package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.FizzBuzz;

public class TestFizzBuzz {

	@Test
	public void testFizzBuzz() {
		int[] testIntArray = {3,5,6};
		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("Fizz");
		expectedResult.add("Buzz");
		expectedResult.add("Fizz");
		assertEquals(FizzBuzz.generateStringArray(testIntArray).get(0), expectedResult.get(0));
	}

}
