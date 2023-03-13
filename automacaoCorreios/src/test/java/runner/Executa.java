package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", glue = "steps", tags = "@teste", dryRun =false, monochrome = true,
		plugin = {"pretty", "html:target/report-cucumber.html"}, snippets = SnippetType.CAMELCASE
		)

public class Executa extends DriversFactory {
	
	public static void abrirNavegador() {
		String url = "https://www.correios.com.br";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	

}
