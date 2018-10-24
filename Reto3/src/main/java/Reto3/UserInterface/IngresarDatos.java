package Reto3.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://www.grupobancolombia.com/wps/portal/personas")
public class IngresarDatos extends PageObject{
	
	public static final Target MENU_PRODUCTOS_SERVICIOS = Target.the("SELECCIONAR EL PRIMER MENU").located(By.xpath("//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a"));
	public static final Target SELECCIONAR_LEASING = Target.the("SELECCIONAR LEASING").located(By.xpath("//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[2]/div/a"));
	public static final Target SELECCIONAR_LEASING_HABITACIONAL = Target.the("SELECCIONAR LEASING HABITACIONAL").located(By.xpath("//*[@id=\"category-detail\"]/div/div/div[2]/div/div[2]/h2/a"));
	public static final Target SELECCIONAR_CANON_CONSTANTE = Target.the("SELECCIONAR CANON CONSTANTE").located(By.xpath("//*[@id=\"main-content\"]/div[4]/div/div/div/div/div[1]/div/div/div[1]/a"));
		
	public static final Target VALOR_ACTIVO = Target.the("INGRESA VALOR ACTIVO").located(By.xpath("//*[@id=\"sim-detail\"]/form/div[1]/input"));
	public static final Target DURACION = Target.the("INGRESA PLAZO DE CONTRATO").located(By.xpath("//*[@id=\"sim-detail\"]/form/div[2]/input"));
	public static final Target PORCENTAJE = Target.the("INGRESA EL PORCENTAJE").located(By.xpath("//*[@id=\"sim-detail\"]/form/div[3]/input"));
	public static final Target TIPO_TASA = Target.the("SELECCIONAR LA TASA").located(By.xpath("//*[@id=\"sim-detail\"]/form/div[4]/select"));
	public static final Target MODALIDAD = Target.the("VERIFICA LA MODALIDAD").located(By.xpath("//*[@class=\"form-group\"]/input[@value='Vencida']"));
	public static final Target BOTON_SIMULAR = Target.the("BOTON PARA REALIZAR EJECUCION").located(By.xpath("//*[@id=\"sim-detail\"]/form/div[6]/button"));
	
	public static final Target CANON_MENSUAL = Target.the("RESULTADO DE CANON").located(By.xpath("//*[@id=\"resultado\"]/div/table/tbody/tr[1]/td[2]"));
	public static final Target TASA_ANUAL = Target.the("RESULTADO TASA ANUAL").located(By.xpath("//*[@id=\"resultado\"]/div/table/tbody/tr[2]/td[2]"));
	public static final Target TASA_MENSUAL = Target.the("RESULTADO TASA MENSUAL").located(By.xpath("//*[@id=\"resultado\"]/div/table/tbody/tr[3]/td[2]"));
	public static final Target VALOR_COMPRA = Target.the("RESUTADO VALOR COMPRA").located(By.xpath("//*[@id=\"resultado\"]/div/table/tbody/tr[4]/td[2]"));
	public static final Target PORCENTAJE_COMPRA = Target.the("RESULTADO PORCENTAJE COMPRA").located(By.xpath("//*[@id=\"resultado\"]/div/table/tbody/tr[5]/td[2]"));
	
	public static final Target MENSAJE_ERROR = Target.the("MIRA SI TIENE ERRORES").located(By.xpath("//*[@class=\"error text-danger bg-danger\"]/div/span[@class=\"ng-binding ng-hide\"]"));
	
}
