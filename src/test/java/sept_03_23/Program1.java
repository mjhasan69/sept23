package sept_03_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Ctrl+Shift+O
		driver.manage().window().maximize();
		driver.get("http://www.rediff.com");
		driver.quit();
		
		WebDriver driver2 = new EdgeDriver(); //Ctrl+Shift+O
		driver2.manage().window().maximize();
		driver2.get("http://www.rediff.com");
		driver2.quit();
		
		WebDriver driver1 = new FirefoxDriver(); //Ctrl+Shift+O
		driver1.manage().window().maximize();
		driver1.get("http://www.rediff.com");
		driver1.quit();
		

	}

}
