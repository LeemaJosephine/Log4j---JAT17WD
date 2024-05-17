package JAT17WD;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyntraTest {

	@Test
	public void titleTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Validate the page
		
		String expected ="Online Shopping";
		String actual = driver.getTitle();
		
//		// Hard Assertion
		boolean flag = false;
//		
//		// Assert
//		Assert.assertFalse(flag);
//		Assert.assertEquals(actual, expected);
//		

		// Soft Assert
		
		SoftAssert obj = new SoftAssert();
		obj.assertTrue(flag);
		obj.assertEquals(actual, expected);
		obj.assertAll();
		
		
	}
}
