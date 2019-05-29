package JenkinsTest.DemoSeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestJenkins {
	
	public static void main(String[] args)
	{

	System.setProperty("webdriver.chrome.driver", "E:\\Browser Executables\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://mail.google.com");
	System.out.println("chrome driver launch");
}
}
