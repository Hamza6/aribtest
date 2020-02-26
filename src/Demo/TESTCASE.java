package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TESTCASE {
	@Test
	public static void main() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
		            "D:\\chrometest\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(1000);
			
		//This is an login Case
			
			driver.get("http://192.168.0.100:8012/Login");
		
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			Thread.sleep(2000);
			
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(1000);
			
		//This is an Add Client Case
				
			driver.get("http://192.168.0.100:8012/AddClient");
			
			driver.findElement(By.id("txtFirstName")).sendKeys("ASIF");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtLastName")).sendKeys("QUERSHI");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtMobile")).sendKeys("03155645759");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtPhone")).sendKeys("03155645759");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtEmail")).sendKeys("hamza.subhani@binaro.io");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtAddress")).sendKeys("Test Test Test Test Test Test Test Test Test Test Test Test ");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtOccupation")).sendKeys("FRONTENDDEVELOPHER");
			Thread.sleep(2000);
			
			driver.findElement(By.id("ddlCountry")).sendKeys("Pakistan");
			Thread.sleep(2000);
			
			driver.findElement(By.id("ddlState")).sendKeys("Sind");
			Thread.sleep(2000);
			
			driver.findElement(By.id("ddlCity")).sendKeys("Karachi");
			Thread.sleep(2000);
			
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(3000);
	
		//ADD Project case
				
			driver.get("http://192.168.0.100:8012/AddProject");
			Thread.sleep(2000);

			driver.findElement(By.id("txtProjectTitle")).sendKeys("BINARO");
			Thread.sleep(2000);
				
			driver.findElement(By.id("ddlClient")).sendKeys("Hazel Clary");
			Thread.sleep(2000);
				
			driver.findElement(By.id("txtTimeline")).sendKeys("30");
			Thread.sleep(2000);
				
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(2000);
				
		//ADD REGISTER CUSTOMER CASE
	
			driver.get("http://192.168.0.100:8012/Register");
					
			driver.findElement(By.id("txtFirstName")).sendKeys("SYED");
			Thread.sleep(2000);
					
			driver.findElement(By.id("txtLastName")).sendKeys("SAMAD");
			Thread.sleep(2000);
					
			driver.findElement(By.id("txtUserName")).sendKeys("PM");
			Thread.sleep(2000);
					
			driver.findElement(By.id("txtPassword")).sendKeys("admin@123");
			Thread.sleep(2000);
					
			driver.findElement(By.id("ddlUserRole")).sendKeys("ResearchAgencyAdmin");
			Thread.sleep(2000);
					
			driver.findElement(By.id("btnRegister")).click();
			Thread.sleep(2000);
										
				if((driver.getCurrentUrl().equals("http://192.168.0.100:8012/Login")) && (driver.getCurrentUrl().equals("http://192.168.0.100:8012/AddClient"))
								&& (driver.getCurrentUrl().equals("http://192.168.0.100:8012/AddProject")) && (driver.getCurrentUrl().equals("http://192.168.0.100:8012/Register")))    
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
