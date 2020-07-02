package com.calculator.parameters;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.calculator.CalculatorMethods;

public class TestNG_ParameterClass {
	CalculatorMethods methods;
	@Parameters({"Value1","Value2","Value3","Value4"})
	  @Test
	public void testMethod_Operator1(String n1,String n2,String n3,String n4) {
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		double num3 = Double.parseDouble(n3);
		double num4 = Double.parseDouble(n4);
		 System.out.println("=========== Using Parameter ===============================");
		 methods=new CalculatorMethods();
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
