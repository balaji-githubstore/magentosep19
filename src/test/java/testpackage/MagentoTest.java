package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//save
import magetnopages.HomePage;
public class MagentoTest {
	@Test
	public  void main() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		System.out.println(driver);
		
		//open magento
		HomePage home=new HomePage(driver);
		home.clickOnMyAccount();

/*		LoginPage.sendUserName(driver, "balajidinakaran1@gmail.com");
		LoginPage.sendPassword(driver, "Welcome123");
		LoginPage.clickOnLogin(driver);

		String title = MainPage.getCurrentTitle(driver, wait);
		System.out.println(title);

		MainPage.clickOnLogOut(driver);*/

	}
}
