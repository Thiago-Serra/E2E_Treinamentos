package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber.feature",
tags ="@Tag1",
glue = "Runner",
monochrome = true,
dryRun = false,
plugin = {"pretty"}
)

public class Metodos extends Drivers {

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(site);
	}
	
	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clickar(By elemento){
       driver.findElement(elemento).click();
	}
	
	public void screenShot(String nomescr) throws IOException {
	    
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./evidencias" + nomescr + ".PNG");
		FileUtils.copyFile(scrFile, destFile);
	}
	
	public void validarBusca(String title) {
		
		driver.getTitle();
	}
	
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	
	public void pausa(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
		}
	}
	
	
	
	 public void fecharNavegador() {
		 driver.quit();
	 }

}