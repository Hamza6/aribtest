package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REGISTER {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
	            "D:\\chrometest\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("http://192.168.0.100:8012/Login");
	
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		Thread.sleep(2000);
		
		//driver.findElement(By.name("getaquote")).click();
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.get("http://192.168.0.100:8012/Register");
		
		driver.findElement(By.id("txtFirstName")).sendKeys("RAJA89");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtLastName")).sendKeys("AS96F1");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUserName")).sendKeys("ha45zas");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ddlUserRole")).sendKeys("ResearchAgencyAdmin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnRegister")).click();
		Thread.sleep(2000);
		
		
			if(driver.getCurrentUrl().equals("http://192.168.0.100:8012/Register"))    
		      { 
		            System.out.println("Test Pass...."); 
		            driver.close();
		      }
			else 
		      { 	  
		    	  	System.out.println("Test Failed...."); 
		    	  	driver.close(); 
		      }
		
	}

}
