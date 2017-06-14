package JUnit.second;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class myTestMethod {
	@Test
	public void myTestMethod() {
		/*
		 * Test the method - if the given list is empty or not
		 */

		Assert.assertTrue(new ArrayList().isEmpty());
	}
}
