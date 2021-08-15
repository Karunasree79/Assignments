package week2.day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.findElement(By.name("UserFirstName")).sendKeys("Karuna");
driver.findElement(By.name("UserLastName")).sendKeys("Sree");
driver.findElement(By.name("UserEmail")).sendKeys("pskaruna95@gmail.com");
WebElement drop1=driver.findElement(By.name("UserTitle"));
Select jobTitle=new Select(drop1);
jobTitle.selectByValue("Marketing_PR_Manager_AP");
driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
WebElement drop2=driver.findElement(By.name("CompanyEmployees"));
Select employees=new Select(drop2);
employees.selectByVisibleText("501 - 1500 employees");
driver.findElement(By.name("UserPhone")).sendKeys("9840176105");
WebElement drop3=driver.findElement(By.name("CompanyCountry"));
Select country=new Select(drop3);
country.selectByIndex(4);
driver.findElement(By.className("checkbox-ui")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.close();
		
	}

}
