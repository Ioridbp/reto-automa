#Autor: Daniel Beltran Parra
#language: es

@HistoriaDeUsuario
Característica: Verificar el envio de mensaje seccion contact
  Yo como usuario quiero ingresar a la pagina xxx y enviar un mensaje en la sección contact

  @CasoMensaje
  Escenario: Verificar envio de mensaje correcto
    Dado Que el usuario ingresa a la pagina
    Cuando de click en el menú Contact y rellene el formulario
    Entonces verifica que el mensaje pueda ser enviado

