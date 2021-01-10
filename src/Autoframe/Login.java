package Autoframe;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\h\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  
		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  driver.findElement(By.id("email")).sendKeys("testauto789@test.com");
		  driver.findElement(By.id("passwd")).sendKeys("Pass@1234");
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span")).click();
		  driver.findElement(By.id("address1")).sendKeys("3456, Kellm US");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
		  
		  // Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("4");

		  driver.findElement(By.name("postcode")).sendKeys("51997");
		  
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  
		  //Enter Home Phone
		  driver.findElement(By.id("phone")).sendKeys("0786545567");
		  //Enter Mobile Number
		  driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Newadd");
		  driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span")).click();

		  
	}
}