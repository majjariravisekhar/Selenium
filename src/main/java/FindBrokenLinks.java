import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class FindBrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\selenium-3.141.59\\\\ChromeDriver 78.0.3904.105\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		String home_page = "https://www.facebook.com/";
		String URL = "";
		int responce_code;
		driver.get(home_page);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {
			URL = itr.next().getAttribute("href");
			if (URL == null || URL.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if (!URL.startsWith(home_page)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(URL).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				responce_code = connection.getResponseCode();

				if (responce_code >= 400) {
					System.out.println(URL + " is Broken!!!");
				} else {
					System.out.println(URL + " is Perfectly Working!!!");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
