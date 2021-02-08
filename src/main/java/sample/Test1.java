package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Test1 {

	@Story("This is a Fail Story.")
	@Description("This is a Fail Story Description.")
	@Test
	void m1() {

		System.out.println("Welcome to allure");

	}

	@Test
	@Story("This is a Fail Story.")
	@Description("This is a Fail Story Description.")
	void m11() {
		int a = 1;

		Assert.assertEquals(a, 11, "Your debug message that you want to display in case of failure");
	}

}
