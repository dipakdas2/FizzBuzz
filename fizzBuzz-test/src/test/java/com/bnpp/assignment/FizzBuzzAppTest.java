package com.bnpp.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzAppTest {
	
	FizzBuzzApp fizzBuzz;

	private static String FIZZ = "fizz";
	
	@Before
	public void setUp(){
	  fizzBuzz = new FizzBuzzApp();
	}
	
	@Test
	public void readNumberTest(){
		//Read a number
		int num = 11;
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(String.valueOf(num), result);
	}

	@Test
	public void testFizz(){
		int num = 3; //Number only divisible by 3
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(FIZZ, result);
	}

}
