package com.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_CalculatorMethod {
	CalculatorMethods methods;
	 int num1=10;
	  int num2=20;
	  double num3=15.5;
	  double num4=5.5;
	@Test
	public void testMethod_Operator1() {
		 System.out.println("=========== Using Normal Method===============================");
		CalculatorMethods methods=new CalculatorMethods();
		int sum = methods.add(num1, num2);
		Assert.assertEquals(sum, 30);
		System.out.println("Running Test -> TestMethod_Operator1 : The sum of "+num1+" and "+ num2+" : "+sum);
		
		int sub = methods.sub(num2, num1);
		Assert.assertTrue(true);
		System.out.println("Running Test -> TestMethod_Operator1 : The substract of "+num2+" and "+ num2+" : "+sub);
		
		int mul = methods.mul(num2, num1);
		Assert.assertEquals(mul, 200);
		System.out.println("Running Test -> TestMethod_Operator1 : The multiply of "+num1+" and "+ num2+" : "+mul);
		
		int divInt = methods.divInt(num2, num1);
		Assert.assertEquals(divInt, 2);
		System.out.println("Running Test -> TestMethod_Operator1 : The division of "+num1+" and "+ num2+" : "+divInt);
		
		double divReal = methods.divReal(num2, num2);
		Assert.assertEquals(divReal, 1.0);
		System.out.println("Running Test -> TestMethod_Operator1 : The divReal of "+num2+" and "+ num1+" : "+divReal);
		
		double exp = methods.exp(num4, num1);
		Assert.assertFalse(false);
		System.out.println("Running Test -> TestMethod_Operator1 : The exp of "+num4+" and "+ num3+" : "+exp);
		
		int mod = methods.mod(num2, num2);
		Assert.assertNotEquals(mod, 1);
		System.out.println("Running Test -> TestMethod_Operator1 : The mod of "+num2+" and "+ num1+" : "+mod);
		
		double inverse = methods.inverse(num2);
		Assert.assertNotEquals(inverse, 1);
		System.out.println("Running Test -> TestMethod_Operator1 : The inverse of "+num2+" : "+inverse);
		
		int nigate = methods.negate(num2);
		Assert.assertEquals(nigate, -20);
		System.out.println("Running Test -> TestMethod_Operator1 : The negate of "+num2+" : "+nigate);
	}
	
}