import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_First_Selenium_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-3.141.59\\ChromeDriver 78.0.3904.105\\chromedriver.exe");
		String base_URL = "http://demo.guru99.com/test/newtours/";
		String expected_Title = "Welcome: Mercury Tours";
		String actual_Title = "";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_URL);
		Thread.sleep(10000);
		actual_Title = driver.getTitle();
		System.out.println("Actual Title is : " + actual_Title);
		if (expected_Title.contentEquals(actual_Title)) {
			System.out.println("Test is PASS!");
		} else {
			System.out.println("Test is FAIL!!!");
		}
		driver.close();
	}

}
