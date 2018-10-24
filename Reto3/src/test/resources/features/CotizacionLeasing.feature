#language:es
#Author: your.email@your.domain.com

@tag
Característica: Verificar el funcionamiento de la pantalla de la simulacion de creditos expuesta por el grupo Bancolombia 
								Como usuario
								Quiero ingresar los datos al formulario
								Para validar mi Valor de Cuota 

	@tag1
  Esquema del escenario: Simulacion de Cuota
  		Dado que david necesita ingresar a la pagina de simulacion para simular un leasing
  		Cuando el realiza el registro del mismo en el aplicativo
  		| valorActivo		 | plazo 	| porcentaje		| tipo	 | modalidad   |
  		| <valorActivo> | <plazo> | <porcentaje>	| <tipo> | <modalidad> |
  		Entonces valida la modalidad
  		| modalidad   |
  		| <modalidad> | 
  		Ejemplos:
  		| valorActivo | plazo | porcentaje	| tipo | modalidad |
  		| 10000000		| 48		| 1						| DTF  | Vencida 	 |
  		
	@tag2
  Esquema del escenario: Simulacion de Cuota Errada
  		Dado que david necesita ingresar a la pagina de simulacion para simular un leasing
  		Cuando el realiza el registro del mismo en el aplicativo pero le falta un dato
  		| valorActivo		 | plazo 	| porcentaje		| tipo	 | modalidad   |
  		| <valorActivo> | <plazo> | <porcentaje>	| <tipo> | <modalidad> |
  		Entonces valida que salgan mensajes de error
  		Ejemplos:
  		| valorActivo | plazo | porcentaje	| tipo | modalidad |
  		| 10000000		| 48		| 						| DTF  | Vencida 	 |	
