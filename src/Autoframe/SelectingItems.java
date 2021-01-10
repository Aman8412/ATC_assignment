package Autoframe;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class SelectingItems {

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
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
          
		  //Select summer Dresses
	        //Instantiate Action Class        
	        Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Women' to perform mouse hover 
	     WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	     //Mouse hover menuOption 'Women'
	     actions.moveToElement(menuOption).perform();
	     System.out.println("Done Mouse hover on 'Women' from Menu");
	     
	     //Now Select 'Summer Dresses' from sub menu which has got displayed on mouse hover of 'women'
	     WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")); 
	    
	     subMenuOption.click();
	     
	     //Change the items to List View
	     driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
	
	//change quantity to 5
	     //click on More button
	     driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[2]/span")).click();
	     driver.findElement(By.className("icon-plus")).click();
	     driver.findElement(By.className("icon-plus")).click();
	     driver.findElement(By.className("icon-plus")).click();
	     driver.findElement(By.className("icon-plus")).click();
	     //select L size
	     WebElement sizedropDown=driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		  Select oSelectC=new Select(sizedropDown);
		  oSelectC.selectByVisibleText("L");
		  //select color for an item
		  driver. findElement(By.id("color_13")).click();
		  //clicking Add to Cart button
		  driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  //clicking Continue shopping
		  driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[4]")).click();
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div/div[3]/div/div[2]/a[1]/span")).click();
		  
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);//clicking Proceed to checkout
		  driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
		  driver.findElement(By.id("cgv")).click();
		  driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  //Check order History
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
		  //Capture screenshot
			TakesScreenshot scrShot =((TakesScreenshot) driver);
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(SrcFile, new File("C:/selenium/OrderHist.png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
driver.findElement(By.className("logout")).click();
driver.quit();
        
}
}