package selpackage;
//invoke a chrome program
import org.openqa.selenium.webdriver;
import org.openqa.selenium.chrome.chromeDriver;


public class Selclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","path of the exe file\\chromedriver.exe");
		//initalize browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.mavericsystems.com");

	}

}
