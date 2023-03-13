package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class Metodos extends DriversFactory{
	
	public void digitarBusca(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clickar(By elemento) {
		driver.findElement(elemento).click();
	}
	public void scrShot(String nomescr) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./src/evidencias/"+nomescr+".PNG");
		FileUtils.copyFile(srcFile, destFile);
		
	}
	public void validarSite(String titleEsperado, By elemento) {
		driver.findElement(elemento).getText();
		assertEquals(titleEsperado, elemento);
		
	}
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	
	public void pausa() throws InterruptedException {
		Thread.sleep(300);
		
	}
	public void mudarTabs() {
	    String tabAtual = driver.getWindowHandle();
	    
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(tabAtual);
	    
	    driver.switchTo().window(newTab.get(0));
	   
	}
	public void fecharNavegador() {
		driver.quit();
	}

}
