package JAT17WD;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoItDemo {

	public static Logger log =  LogManager.getLogger(AutoItDemo.class);
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		log.info("Browser launched");
		
		driver.findElement(By.id("browse")).click();
		//Thread.sleep(3000);
		//Runtime.getRuntime().exec("D:\\AutoItScript\\firstscript.exe");
		
		
	}
}
