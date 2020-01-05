import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc_Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-3.141.59\\ChromeDriver 78.0.3904.105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys("sadfsdf");;
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("ANDORRA");
	}

}
