package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class BuscarCEPPstvTest {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();


	@Given("Eu esteja no site do correios")
	public void euEstejaNoSiteDoCorreios() {
		Executa.abrirNavegador();
	   
	}
	@When("informar dados de CEP validos")
	public void informarDadosDeCEPValidos() throws InterruptedException {
		metodos.pausa();
		metodos.clickar(el.getBtnPopup());
	    metodos.digitarBusca(el.getCmpBusca(), "86188-782");
	    metodos.submit(el.getCmpBusca());
	    
	}
	@When("clickar no botao de busca")
	public void clickarNoBotaoDeBusca() throws InterruptedException {
		metodos.clickar(el.getBtnBusca());
		metodos.pausa();
	    
	}
	@Then("site informa endereco completo")
	public void siteInformaEnderecoCompleto() throws IOException {
		metodos.mudarTabs();
		metodos.scrShot("testePstv");
		metodos.fecharNavegador();
		
		
	   
	}



}
