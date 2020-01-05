import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrouseDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-3.141.59\\ChromeDriver 78.0.3904.105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).sendKeys("C:\\Users\\Ravi Sekhar\\Downloads\\Rama Chandraiah Sand.pdf");
		;

	}

}
