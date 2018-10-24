package Reto3.StepDefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import Reto3.Model.Opciones;
import Reto3.Questions.Imprimir;
import Reto3.Questions.LaRespuesta;
import Reto3.Questions.Modalidad;
import Reto3.Tasks.Abrir;
import Reto3.Tasks.Seleccionar;
import Reto3.Tasks.SeleccionarMal;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SimularLeasing {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}

	@Dado("^que david necesita ingresar a la pagina de simulacion para simular un leasing$")
	public void queDavidNecesitaIngresarALaPaginaDeSimulacionParaSimularUnLeasing() {
		david.wasAbleTo(Abrir.lapaginaweb());
	}

	@Cuando("^el realiza el registro del mismo en el aplicativo$")
	public void elRealizaElRegistroDelMismoEnElAplicativo(List<Opciones> opciones) {
		david.attemptsTo(Seleccionar.simulacion(opciones));
	}

	@Cuando("^el realiza el registro del mismo en el aplicativo pero le falta un dato$")
	public void elRealizaElRegistroDelMismoEnElAplicativoPeroLeFaltaUnDato(List<Opciones> opciones) {
		david.attemptsTo(SeleccionarMal.simulacionmal(opciones));
	}
	
	@Entonces("^valida la modalidad$")
	public void validaLaModalidad(List<Opciones> modalidad) {
		david.should(GivenWhenThen.seeThat(Modalidad.esla(modalidad), Matchers.equalTo(true)));
		david.should(GivenWhenThen.seeThat(Imprimir.total(), Matchers.equalTo(true)));
	}
		
	@Entonces("^valida que salgan mensajes de error$")
	public void validaQueSalganMensajesDeError() {
		david.should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo(true)));
	}
}
