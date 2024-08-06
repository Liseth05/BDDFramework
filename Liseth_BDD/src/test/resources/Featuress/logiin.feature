Feature: Automatizacion de la pagina de inicio de sesion de la aplicacion Saucedemo
Scenario: Verificar que el inicio de sesion se haya realizado correctamente con credenciales validas 
Given El usuario esta en la pagina de inicio de sesion
When El usuario ingresa un nombre de usuario valido y un password
And Hace clic en el boton de inicio de sesion
Then El usuario es llevado a la pagina de inicio
And cierra el navegador
