package week2.day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Raj");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("rajkumar95@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rajkumar95@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Teddy");
		WebElement drop1 = driver.findElement(By.id("day"));
		Select date = new Select(drop1);
		date.selectByValue("28");
		WebElement drop2 = driver.findElement(By.id("month"));
		Select month = new Select(drop2);
		month.selectByIndex(5);
		WebElement drop3 = driver.findElement(By.name("birthday_year"));
		Select year = new Select(drop3);
		year.selectByValue("1995");
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
