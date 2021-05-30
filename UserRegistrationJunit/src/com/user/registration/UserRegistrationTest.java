package com.user.registration;

import org.junit.Assert;
import org.junit.Test;

class UserRegistrationTest1 {
	boolean check = true;
	//FirstName
	/**
	 * @Method testValidFirstName tests Happy case for firstName
	 * @Test takes a correct input where firstName has at least 3 characters and first letter starts with cap 
	 * @return true
	 **/
	
	@Test
	void testValidFirstName() {
		 UserRegistration user = new UserRegistration();
		 boolean result = user.validFirstName("Rahul");
		 Assert.assertEquals(check, result);
	}
	
	//FirstName
	/**
	* @Method testInvalidFirstName tests Sad case for firstName
	* @Test takes a correct input where firstName has at least 3 characters and first letter starts with cap 
	* @return false
	 **/
	
	@Test
	void testInvalidFirstName() {
		UserRegistration user = new UserRegistration();
		 boolean result = user.validFirstName("raullll");
		 Assert.assertEquals(check, result);
	}
	
	//LastName
	/**
	* @Method testValidLastName test Happy case for LastName
	* @Test takes a correct input where lastName has at least 3 characters and first letter starts with cap 
	* @return true
	**/
	
	@Test
	void testValidLastName() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validLastName("Shinde");
		Assert.assertEquals(check, result);
	}
	
	//LastName
	/**
	* @Method testInvalidLastName test Sad case for LastName
	* @Test takes a correct input where lastName has at least 3 characters and first letter starts with cap 
	* @return false
	**/
	
	@Test
	void testInValidLastName() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validLastName("shinde");
		Assert.assertEquals(check, result);
	}
	
	@Test
	void testValidEmail() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validEmail("rahulsinde22@gmail.com");
		Assert.assertEquals(check, result);
	}
	
	@Test
	void testInValidEmail() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validEmail("//aaa.co.in");
		Assert.assertEquals(check, result);
	}
	
	//PhoneNumber
	/**
	* @Method testValidPhoneNumber test happy case for PhoneNumber
	* @Test takes a correct input where PhoneNumber has 10 numbers and country code should start between 0-91.
	* Phone-Number should start between 7-9.
	* @return true
	**/
	
	@Test
	void testValidPhoneNumber() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validPhoneNumber("8951627807");
		Assert.assertEquals(check, result);
	}
	
	//PhoneNumber
	/**
	* @Method testInValidPhoneNumber test sad case for PhoneNumber
	* @Test takes a correct input where PhoneNumber has 10 numbers and country code should start between 0-91.
	* Phone-Number should start between 7-9.
	* @return false
	**/
	
	@Test
	void testInValidPhoneNumber() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validPhoneNumber("9380474806");
		Assert.assertEquals(check, result);
	}
	
	//Password
	/**
	* @Method testValidPassword test Happy case for password
	* @Test follows 4 rules
	* Rule 1- Password has at least 8 characters.
	* Rule 2- Password has at least 1 Upper Case.
	* Rule 3- Password has at least 1 Numeric values.
	* Rule 4- Password has at least 1 Special Character.
	* @return true
	**/
	
	@Test
	void testValidatePassword() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validPassword("Nanu9P#lesL@d65ef");
		Assert.assertEquals(check, result);
	}
	
	//Password
	/**
	* @Method testValidPassword test Sad case for password
	* @Test follows 4 rules
	* Rule 1- Password has at least 8 characters.
	* Rule 2- Password has at least 1 Upper Case.
	* Rule 3- Password has at least 1 Numeric values.
	* Rule 4- Password has at least 1 Special Character.
	* @return false
	**/
	
	@Test
	void testInValidPassword() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validPassword("Nanu@123");
		Assert.assertEquals(check, result);
	}
}
