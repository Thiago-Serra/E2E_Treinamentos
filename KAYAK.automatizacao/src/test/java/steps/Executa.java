package steps;



import java.io.IOException;


import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;


public class Executa extends Metodos{
	
	Elementos el = new Elementos();
	
	Metodos metodos = new Metodos();
	
	@Given("eu esteja no site")
	public void eu_esteja_no_site() {
	    metodos.abrirNavegador("https://www.kayak.com.br/?ispredir=true");
	    
	}

	@When("eu pesquisar origem e destino")
	public void eu_pesquisar_origem_e_destino() {
		
		metodos.escrever("São paulo", el.getBarraOrigem());
		metodos.pausa(300);
		metodos.clickar(el.getBarraDest());
		metodos.escrever("Las vegas", el.getBarraDest());
		metodos.pausa(1000);
	   
	}

	@When("clickar no botão de busca")
	public void clickar_no_botão_de_busca() {
	  metodos.clickar(el.getBtnPesq());
	}

	@Then("apresentar voos com a origem e destino selecionados")
	public void apresentar_voos_com_a_origem_e_destino_selecionados() throws IOException {
		metodos.validarBusca("Pesquise voos, hot&eacute;is e aluguel de carros | KAYAK");
	    metodos.screenShot("evidencia CT1.SUCCESS22");
	    metodos.pausa(500);
	    metodos.fecharNavegador();
	    
	   
	}

}
