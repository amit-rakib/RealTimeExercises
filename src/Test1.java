import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// When we make small driver that is called Limiting WebDriver Scope

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Count the total links
		int allLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(allLinks);

		// Count all the links in Footer
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int links = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(links);

		// Count all links in footer column
		WebElement columnDriver = footerDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		int linkCount = columnDriver.findElements(By.tagName("a")).size();
		System.out.println(linkCount);

		for (int i = 0; i < linkCount; i++) {

			// Chord for pressing many keys at once
			String clickNewTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickNewTab);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		
		while(it.hasNext()) {
			String childWindow = it.next();
			driver.switchTo().window(childWindow);
			
			String title =driver.getTitle();
			
			System.out.println(title);
		}
		

		driver.close();
	}

}
