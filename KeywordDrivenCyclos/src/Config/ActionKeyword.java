package Config;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ActionKeyword {
	public static WebDriver driver;
	 public static void openBrowser(){ 
	     System.setProperty("webdriver.chrome.driver", ".\\Softwares Required For Testing Batch\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	 }
	 
	 public static void navigate(){ 
		 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 driver.get("http://localhost:8585/do/login");
	 }
	 
	/* public static void click_MyAccount(){
	 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 }
	 */
	 public static void click_Admin(){
	 driver.findElement(By.id("cyclosUsername")).sendKeys("admin");}
	 
	 public static void click_Password(){
		 driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
		 
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click();
		 
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click();
		 
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click();
		 }
		 
		 public static void Submit(){
			 driver.findElement(By.xpath("//div[@id='virtualKeyboard']//div//input[@class='button']")).click();
		 }
		 
		 public static void waitFor() throws Exception{
		 Thread.sleep(5000);
		 }
		 
		 public static void Account(){
		 driver.findElement (By.xpath("//span[@class='menuText'][contains(text(),'Accounts')]")).click();
		 }
		 
		 public static void Member_Payment(){
			 driver.findElement (By.xpath("//span[contains(text(),'Member Payment')]")).click();
			
			 String  actualvalue=driver.findElement(By.xpath("//td[contains(text(),'Payment system to member')]")).getText();
				String expectedvalue="Payment system to member";
				Assert.assertEquals(actualvalue, expectedvalue);
				System.out.println(actualvalue);	 
		 }
		 public static void Login_Recipint(){
			 driver.findElement (By.xpath("//input[@id='memberUsername']")).sendKeys("Dhwani");
			 }
		 public static void Login_RecipintName(){
			 driver.findElement (By.xpath("//input[@id='memberName']")).sendKeys("Dhwani");
			 }
		 
		 public static void Amount(){
			 driver.findElement (By.xpath("//input[@id='amount']")).sendKeys("10000");
			 }
		 public static void Description(){
			 driver.findElement (By.xpath("//textarea[@id='description']")).sendKeys("system");
			 }
		 public static void Submit2(){
			 driver.findElement (By.xpath("//input[@id='submitButton']")).click();
			 
			 String  actualvalue1=driver.findElement(By.xpath("//td[@class='label']")).getText();
				String expectedvalue1="You are about to perform the following payment:";
				Assert.assertEquals(actualvalue1, expectedvalue1);
				System.out.println(actualvalue1);
			 }
		 public static void Submit3(){
			 driver.findElement (By.xpath("//table[@class='defaultTable']//input[@class='button']")).click();
		    
			 String  actualvalue2=driver.findElement(By.xpath("//td[contains(text(),'Cyclos')]")).getText();
				String expectedvalue2="Cyclos";
				Assert.assertEquals(actualvalue2, expectedvalue2);
				System.out.println(actualvalue2);
		 
		 }
		 
		 public static void LogOut() throws InterruptedException{
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//input[@id='btn']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
			 Thread.sleep(2000);
			 Alert alert1=driver.switchTo().alert();
				alert1.accept();
		 }
		 
		 public static void closeBrowser(){
		 driver.quit();

}
	 }
