package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class ExecutaCT2 {

	Elementos el = new Elementos();
	
	Metodos metodos = new Metodos();
	
	@Given("eu esteja na pagina de pesquisa do site")
	public void eu_esteja_na_pagina_de_pesquisa_do_site() {
		metodos.abrirNavegador("https://www.kayak.com.br");
	    
	}

	@When("eu clickar no menu de ida de volta")
	public void eu_clickar_no_menu_de_ida_de_volta() {
		metodos.pausa(300);
		metodos.clickar(el.getBtnMenu());
	   
	}

	@When("clickar no botao trip builder")
	public void clickar_no_botao_trip_builder() {
	   
	}

	@Then("ser redirecionado para nova pagina de busca")
	public void ser_redirecionado_para_nova_pagina_de_busca() {
	    
	}

}
