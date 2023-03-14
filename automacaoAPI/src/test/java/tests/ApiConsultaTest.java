package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiConsulta;

public class ApiConsultaTest {
	
	ApiConsulta apiCon = new ApiConsulta();
	
	@Given("que eu acesse a api get para consultar nome dos candidatos")
	public void que_eu_acesse_a_api_get_para_consultar_nome_dos_candidatos() {
		apiCon.acessarApi("https://dadosabertos.camara.leg.br/api/v2/deputados/4445");
	    
	}

	@Then("eu valido o status code {string} de retorno")
	public void eu_valido_o_status_code_de_retorno(String string) {
		apiCon.statusCode(200);
	    
	}

	@Then("eu valido a lista de nome eleitoral")
	public void eu_valido_a_lista_de_nome_eleitoral() {
		apiCon.validarBody("nomeEleitoral");
	   
	}

}
