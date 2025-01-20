import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Count the total links
		int allLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(allLinks);

		// Count all the links in Footer
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int links = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}

}
