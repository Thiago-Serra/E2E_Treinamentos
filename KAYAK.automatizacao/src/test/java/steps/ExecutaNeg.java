package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class ExecutaNeg {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	@Given("eu esteja no site da kayak")
	public void eu_esteja_no_site_da_kayak() {
		 metodos.abrirNavegador("https://www.kayak.com.br");
	}

	@When("eu preencher os campos de pesquisa com informacoes invalidas")
	public void eu_preencher_os_campos_de_pesquisa_com_informacoes_invalidas() {
		metodos.escrever("NINEELEVEN", el.getBarraOrigem());
		metodos.pausa(400);
		metodos.clickar(el.getBarraDest());
		metodos.escrever("AHMUDILLA", el.getBarraDest());
		metodos.pausa(400);
	 
	}

	@When("realizar a pesquisa")
	public void realizar_a_pesquisa() {
		metodos.clickar(el.getBtnPesq());
		metodos.pausa(400);
	
	}

	@Then("site apresentar uma caixa de dialogo solicitando informacoes validas")
	public void site_apresentar_uma_caixa_de_dialogo_solicitando_informacoes_validas() throws IOException {
		metodos.screenShot("CT1 NEGATIVO");
	    metodos.fecharNavegador();
	}

	

}	
