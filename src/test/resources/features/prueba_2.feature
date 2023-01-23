#Autor: Daniel Beltran Parra
#language: es

@HistoriaDeUsuario
Característica: Verificar el envio de mensaje seccion contact
  Yo como usuario quiero ingresar a la pagina xxx y enviar un mensaje en la sección contact

  @CasoLogin
  Escenario: Verificar ingreso a la página despues de loguearse
    Dado Que el usuario ingrese a la pagina
    Cuando digite el usuario y contraseña
    Entonces verificar que ingrese a la pagina Bootstrap-Admin-Template

