package Reto3.Questions;

import java.util.List;

import Reto3.Model.Opciones;
import Reto3.UserInterface.IngresarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

public class Modalidad implements Question<Boolean>{
	
	List<Opciones> opciones;
		
	public Modalidad(List<Opciones> opciones) {
		super();
		this.opciones = opciones;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		String confirmar = Value.of(IngresarDatos.MODALIDAD).viewedBy(actor).asString();
		
		String validar = opciones.get(0).getModalidad();
		System.out.println(confirmar);
		System.out.println(validar);	
		if (confirmar.equals(validar)) {
		return true;
		}else {
			return false;	
		}
	}
	
	public static Modalidad esla(List<Opciones> modalidad) {
		return new Modalidad(modalidad);
	}
}