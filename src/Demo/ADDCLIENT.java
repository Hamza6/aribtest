package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADDCLIENT {

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
				
				driver.get("http://192.168.0.100:8012");
				driver.get("http://192.168.0.100:8012/AddClient");
				
				driver.findElement(By.id("txtFirstName")).sendKeys("Arib");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtLastName")).sendKeys("Yousuf");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtMobile")).sendKeys("03155645759");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtPhone")).sendKeys("03155645759");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtEmail")).sendKeys("hamza.subhani@binaro.io");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtAddress")).sendKeys("Test Test Test Test Test Test Test Test Test Test Test Test ");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtOccupation")).sendKeys("Driver");
				Thread.sleep(2000);
				
				driver.findElement(By.id("ddlCountry")).sendKeys("Pakistan");
				Thread.sleep(2000);
				
				driver.findElement(By.id("ddlState")).sendKeys("Sind");
				Thread.sleep(2000);
				
				driver.findElement(By.id("ddlCity")).sendKeys("Karachi");
				Thread.sleep(2000);
				
				driver.findElement(By.id("btnSave")).click();
				Thread.sleep(3000);
				
				driver.close();
//				driver.findElement(By.id("btnLogout")).click();
//				Thread.sleep(2000);
				
//					if(driver.getCurrentUrl().equals("http://192.168.0.100:8012/AddClient"))    
//				      { 
//				            System.out.println("Test Pass...."); 
//				            driver.close();
//				      }
//					else 
//				      { 	  
//				    	  	System.out.println("Test Failed...."); 
//				    	  	driver.close(); 
//				      }
	}

}
