package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class BuscarCEPNgtvTest {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	

	@Given("Eu esteja no site da correios")
	public void euEstejaNoSiteDaCorreios() {
	   Executa.abrirNavegador();
	}
	@When("informar dados de CEP invalidos")
	public void informarDadosDeCEPInvalidos() throws Exception {
		metodos.pausa();
		metodos.clickar(el.getBtnPopup());
		metodos.digitarBusca(el.getCmpBusca(), "4002-8922");
	}
	    
	
	@When("clickar no botao de buscar")
	public void clickarNoBotaoDeBuscar() throws InterruptedException {
		metodos.clickar(el.getBtnBusca());
		metodos.pausa();
	    
	}
	@Then("site informa dados nao encontrados")
	public void siteInformaDadosNaoEncontrados() throws IOException {
		metodos.mudarTabs();
		metodos.scrShot("testeNgtv");
		metodos.fecharNavegador();
	   



	   




  }
}