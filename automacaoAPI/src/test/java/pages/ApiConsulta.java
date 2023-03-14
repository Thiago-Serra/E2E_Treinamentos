package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiConsulta {
	Response response;

	public Response acessarApi(String uri) {

		response = RestAssured.get(uri);

		return response;
	}

	public void statusCode(int status) {

		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
	}

	@SuppressWarnings("deprecation")
	public void validarBody(String texto) {
		String bodyResponse = response.asString();
		assertThat(bodyResponse, StringContains.containsString(texto));
	}

}
