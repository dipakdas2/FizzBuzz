package com.bnpp.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzAppTest {
	
	FizzBuzzApp fizzBuzz;
	
	@Before
	public void setUp(){
	  fizzBuzz = new FizzBuzzApp();
	}
	
	@Test
	public void readNumberTest(){
		//Read a number
		int num = 1;
		String result = fizzBuzz.readNumber(num);
		Assert.assertEquals(String.valueOf(num), result);
	}
	

}
