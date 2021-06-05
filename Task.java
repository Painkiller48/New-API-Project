import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		try {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish S\\eclipse-workspace\\Congizant\\Driver\\New Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Actual Title: "+ title );
		if(title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Actual title and Expected title are equal");
		}
		else {
			System.out.println("Actual title and Expected title are not equal");
		}
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));	
		search.sendKeys("Laptop",Keys.ENTER);	
		WebElement link = driver.findElement(By.xpath("(//span[contains(text(),\"Aspire 5\")])[2]"));
		link.click();
		String product= driver.findElement(By.xpath("(//span[contains(text(),'Acer Aspire')])[1]")).getText();
		System.out.println("Product: " + product);
		
		String price = driver.findElement(By.id("priceblock_ourprice")).getText();
		System.out.println("Product Price: " + price);
	}
	
	catch(Exception e) {
		e.printStackTrace();
		
	}
	}

}
