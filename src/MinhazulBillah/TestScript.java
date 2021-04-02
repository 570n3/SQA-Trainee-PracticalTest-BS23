package MinhazulBillah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//Step01
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		//Step02
		
		/*Website was Taking too much time to load
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign in')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		*/
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		//driver.close();
		
		//Step03
		driver.findElement(By.id("email_create")).sendKeys("mnhazulbillah@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		//driver.close();
		
		//Step04
		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Minhazul");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Billah");
		Thread.sleep(1000);
		
		/*Auto Filled
		driver.findElement(By.xpath("//input[@value=\'minhazulbillah@gmail.com\')]")).click();
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.id("passwd")).sendKeys("12345");
		Thread.sleep(1000);
		
		Select dropdown1 = new Select(driver.findElement(By.id("days")));
		dropdown1.selectByValue("10");
		Thread.sleep(1000);
		
		Select dropdown2 = new Select(driver.findElement(By.id("months")));
		dropdown2.selectByValue("8");
		Thread.sleep(1000);
		
		Select dropdown3 = new Select(driver.findElement(By.id("years")));
		dropdown3.selectByValue("1985");
		Thread.sleep(1000);
		
		driver.findElement(By.id("newsletter")).click();
		Thread.sleep(1000);
		
		/*Auto Filled
		driver.findElement(By.id("firstname")).sendKeys("Minhazul");
		Thread.sleep(3000);
		driver.findElement(By.id("lastname")).sendKeys("Billah");
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.id("company")).sendKeys("TBA");
		Thread.sleep(1000);
		
		driver.findElement(By.id("address1")).sendKeys("Dhaka");
		Thread.sleep(1000);
		
		driver.findElement(By.id("address2")).sendKeys("Dhaka, Bangladesh");
		Thread.sleep(1000);
		
		driver.findElement(By.id("city")).sendKeys("Dhaka");
		Thread.sleep(1000);
		
		Select dropdown4 = new Select(driver.findElement(By.id("id_state")));
		dropdown4.selectByValue("3");
		Thread.sleep(1000);
		
		driver.findElement(By.id("postcode")).sendKeys("12121");
		Thread.sleep(1000);
		
		driver.findElement(By.id("other")).sendKeys("TBA");
		Thread.sleep(1000);
		
		driver.findElement(By.id("phone")).sendKeys("0178606702");
		Thread.sleep(1000);
		
		driver.findElement(By.id("phone_mobile")).sendKeys("0178606042");
		Thread.sleep(1000);
		
		/*Auto Filled
		driver.findElement(By.id("alias")).sendKeys("TBA");
		Thread.sleep(3000);
		driver.close(); 
		*/
		
		//Step05
		driver.findElement(By.id("submitAccount")).click();
		//driver.close();
		
		//Step06
		String VerfiedUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
		
		if(VerfiedUser.contains("Minhazul Billah"))
			System.out.println("Verified! User Created");
		else
			System.out.println("Failure! User not created");	
		
		driver.close();
		
	}
}
