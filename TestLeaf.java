package week2.day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		String Title = "Create Lead | opentaps CRM";
		String homeTitle = driver.getTitle();
		if (Title.equals(homeTitle)) {
			System.out.println("In home page");
		} else {
			System.out.println("Not in home page");
		}
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karuna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sree");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select Source = new Select(drop1);
		Source.selectByValue("LEAD_DIRECTMAIL");
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaign = new Select(drop2);
		marketingCampaign.selectByVisibleText("Car and Driver");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Karuna");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Sree");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Analyst");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Analyst");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/09/1995");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Analyst");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.name("annualRevenue")).sendKeys("2");
		WebElement drop3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currency = new Select(drop3);
		currency.selectByIndex(4);
		WebElement drop4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(drop4);
		industry.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		WebElement drop5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerShip = new Select(drop5);
		ownerShip.selectByValue("OWN_PUBLIC_CORP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("600");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$");
		driver.findElement(By.name("description")).sendKeys("Creation of Lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important note");
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("60");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840176105");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("karuna");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pskaruna@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/Karunasree79/day2");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("karuna");
		driver.findElement(By.name("generalAttnName")).sendKeys("Jayashree");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.4/13,bashyam 1st street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Otteri");
		driver.findElement(By.name("generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600012");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("5");
		WebElement drop6 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(drop6);
		state.selectByValue("IN");
		WebElement drop7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(drop7);
		country.selectByValue("IN");
		driver.findElement(By.name("submitButton")).click();

	}

}
