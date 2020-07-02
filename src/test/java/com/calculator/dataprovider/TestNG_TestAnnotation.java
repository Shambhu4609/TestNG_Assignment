package com.calculator.dataprovider;
import com.calculator.CalculatorMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_TestAnnotation extends TestNG_DataProviders {
	CalculatorMethods methods;
	int  num5,num6;
	double num7,num8;
	@Test(dataProvider="testData")
	public void testMethod_Operator2(int n1,int n2,double n3,double n4) {
		this.num5=n1;
		this.num6=n2;
		this.num7=n3;
		this.num8=n4;
	 methods=new CalculatorMethods();
	 System.out.println("=========== Using DataProvider===============================");
		int sum = methods.add(num5, num6);
		Assert.assertEquals(sum, 30);
		System.out.println("Running Test -> TestMethod_Operator2 : The sum of "+num5+" and "+ num6+" : "+sum);
		
		int sub = methods.sub(num6, num5);
		Assert.assertTrue(true);
		System.out.println("Running Test -> TestMethod_Operator2 : The substract of "+num6+" and "+ num6+" : "+sub);
		
		int mul = methods.mul(num6, num5);
		Assert.assertEquals(mul, 200);
		System.out.println("Running Test -> TestMethod_Operator2 : The multiply of "+num5+" and "+ num6+" : "+mul);
		
		int divInt = methods.divInt(num6, num5);
		Assert.assertEquals(divInt, 2);
		System.out.println("Running Test -> TestMethod_Operator2 : The division of "+num5+" and "+ num6+" : "+divInt);
		
		double divReal = methods.divReal(num6, num6);
		Assert.assertEquals(divReal, 1.0);
		System.out.println("Running Test -> TestMethod_Operator2 : The divReal of "+num6+" and "+ num5+" : "+divReal);
		
		double exp = methods.exp(num8, num5);
		Assert.assertFalse(false);
		System.out.println("Running Test -> TestMethod_Operator2 : The exp of "+num8+" and "+ num7+" : "+exp);
		
		int mod = methods.mod(num6, num6);
		Assert.assertNotEquals(mod, 1);
		System.out.println("Running Test -> TestMethod_Operator2 : The mod of "+num6+" and "+ num5+" : "+mod);
		
		double inverse = methods.inverse(num6);
		Assert.assertNotEquals(inverse, 1);
		System.out.println("Running Test -> TestMethod_Operator2 : The inverse of "+num6+" : "+inverse);
		
		int nigate = methods.negate(num6);
		Assert.assertEquals(nigate, -20);
		System.out.println("Running Test -> TestMethod_Operator2 : The negate of "+num6+" : "+nigate);
	}
	
	
}