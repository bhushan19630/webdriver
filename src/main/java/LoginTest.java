import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Samvedna_Selenium\\seleniumgrid\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("http://google.com");
    driver.manage().window().maximize();
    WebElement el=driver.findElement(By.id("name"));
    el.click();
	}

}
