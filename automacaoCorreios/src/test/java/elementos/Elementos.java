package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By cmpBusca = By.cssSelector("#relaxation");
	private By btnBusca = By.cssSelector("#content > div.mais-acessados > div > div.card-destaque-normal.flex > div:nth-child(2) > form > div.campo > button");
	private By btnPopup = By.cssSelector("#carol-fecha");
	
	public By getCmpBusca() {
		return cmpBusca;
	}
	public By getBtnBusca() {
		return btnBusca;
	}
	public By getBtnPopup() {
		return btnPopup;
	}
	

}
