package launchbrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\drpra\\December2021_Selenium\\1st_Selenium_Class\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.close();
		
		
		
		
		
		
	}
	
	
}
