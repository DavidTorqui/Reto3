package Reto3.Questions;

import Reto3.UserInterface.IngresarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Imprimir implements Question<Boolean>{
	
	public static Imprimir total() {
		return new Imprimir();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
	String CanonMensual = Text.of(IngresarDatos.CANON_MENSUAL).viewedBy(actor).asString();
	String TasaAnual = Text.of(IngresarDatos.TASA_ANUAL).viewedBy(actor).asString();
	String TasaMensual = Text.of(IngresarDatos.TASA_MENSUAL).viewedBy(actor).asString();
	String ValorCompra = Text.of(IngresarDatos.VALOR_COMPRA).viewedBy(actor).asString();
	String PorcentajeCompra = Text.of(IngresarDatos.PORCENTAJE_COMPRA).viewedBy(actor).asString();
	System.out.println("----------------------------------");
	System.out.println("|     "+CanonMensual+"      |");
	System.out.println("|     "+TasaAnual+"           |");
	System.out.println("|     "+TasaMensual+"            |");
	System.out.println("|     "+ValorCompra+"      |");
	System.out.println("|     "+PorcentajeCompra+"               |");
	System.out.println("----------------------------------");
	return true;
	}
}
