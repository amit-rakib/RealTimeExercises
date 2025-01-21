import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String year = "2027";
		String month = "6";
		int day = 27;

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[normalize-space()='" + year + "']")).click();
		driver.findElement(By.xpath("//div[@class='react-calendar__viewContainer']//button[" + month + "]")).click();
		driver.findElement(By.xpath("//div[@class='react-calendar__viewContainer']//button[" + (day + 1) + "]"))
				.click();

		// Now get Test text of calendar

		List<WebElement> ActualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0; i<ActualList.size(); i++) {
		  System.out.println(ActualList.get(i).getAttribute("value"));
		}

	}

}





























