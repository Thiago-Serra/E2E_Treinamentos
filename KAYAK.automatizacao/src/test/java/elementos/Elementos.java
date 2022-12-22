package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	 
	public By getBarraOrigem() {
		return barraOrigem;
	}
	

	public By getBarraDest() {
		return barraDest;
	}


	public By getBtnPesq() {
		return btnPesq;
	}


	


	public By getBtnMenu() {
		return btnMenu;
	}





	private By barraOrigem = By.xpath("//input[@aria-label='Campo de origem']");
	private By barraDest = By.xpath("//*[@placeholder='Destino']");
	private By btnPesq = By.xpath("//*[@aria-label='Buscar']");
	private By btnMenu = By.id("//li [@id = 'nomad']");
	
}
   