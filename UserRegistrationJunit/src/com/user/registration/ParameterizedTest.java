package com.user.registration;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class ParameterizedTest {
	//variables
	public String email;
	public boolean expected;
	
	//Initialize variables using Constructor approach
	public ParameterizedTest (String email, boolean expected) {
		this.email=email;
		this.expected=expected;
	}
	
	public List<ParameterizedTest> inputFirst() {
		/**
		*Create an ArrayList Object
		* Initialize EmailParameterizedTesting add to the ArrayList object using add method
		* @return  returns list
		**/
		List<ParameterizedTest>  list = new ArrayList<ParameterizedTest>();
		list.add(new ParameterizedTest("rahul@yoo.cin",true));
		list.add(new ParameterizedTest("rahul-34@google.com",true));
		list.add(new ParameterizedTest("rahul.156@yahoo.com",true));
		list.add(new ParameterizedTest("rahul.434@rrahul.com",true));
		list.add(new ParameterizedTest("rahul.@rahul.com.com",true));
		list.add(new ParameterizedTest("rahul.+@400@gmail",true));
		list.add(new ParameterizedTest("rahul",false));
		list.add(new ParameterizedTest("rahul@gmail.com.la",false));
		list.add(new ParameterizedTest("rahul@gmail.com.aa.au",false));
		return list;
	}
	
	@Test
	public void validateEmail() {
		UserRegistration userMain = new UserRegistration();	
		Assert.assertEquals(this.expected,userMain.validEmail(email));
	}
}
