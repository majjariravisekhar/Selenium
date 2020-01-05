import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Tag_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-3.141.59\\ChromeDriver 78.0.3904.105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String base_URL = "http://www.popuptest.com/popuptest2.html";
		driver.get(base_URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		;
	}

}
