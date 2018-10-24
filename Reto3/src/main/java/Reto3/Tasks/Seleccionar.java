package Reto3.Tasks;

import java.util.List;

import Reto3.Model.Opciones;
import Reto3.UserInterface.IngresarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Seleccionar implements Task {

	List<Opciones> opciones;
	
 	public Seleccionar(List<Opciones> opciones) {
		super();
		this.opciones = opciones;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IngresarDatos.MENU_PRODUCTOS_SERVICIOS));
		actor.attemptsTo(Click.on(IngresarDatos.SELECCIONAR_LEASING));
		actor.attemptsTo(Click.on(IngresarDatos.SELECCIONAR_LEASING_HABITACIONAL));
		actor.attemptsTo(Click.on(IngresarDatos.SELECCIONAR_CANON_CONSTANTE));
		actor.attemptsTo(Enter.theValue(opciones.get(0).getValorActivo()).into(IngresarDatos.VALOR_ACTIVO));
		actor.attemptsTo(Enter.theValue(opciones.get(0).getPlazo()).into(IngresarDatos.DURACION));
		actor.attemptsTo(Enter.theValue(opciones.get(0).getPorcentaje()).into(IngresarDatos.PORCENTAJE));
		actor.attemptsTo(SelectFromOptions.byVisibleText(opciones.get(0).getTipo()).from(IngresarDatos.TIPO_TASA));
		actor.attemptsTo(Click.on(IngresarDatos.BOTON_SIMULAR));
		}

	public static Seleccionar simulacion(List<Opciones> opciones) {
		return Tasks.instrumented(Seleccionar.class, opciones);
	}
}
