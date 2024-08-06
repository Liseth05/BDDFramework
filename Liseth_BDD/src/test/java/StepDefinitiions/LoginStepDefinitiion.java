package StepDefinitiions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitiion {
	static WebDriver driver;
	@Given("El usuario esta en la pagina de inicio de sesion")
	public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.saucedemo.com/");
	   
	}

	@When("El usuario ingresa un nombre de usuario valido y un password")
	public void el_usuario_ingresa_un_nombre_de_usuario_valido_y_un_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("Hace clic en el boton de inicio de sesion")
	public void hace_clic_en_el_boton_de_inicio_de_sesion() {
		 driver.findElement(By.id("login-button")).click();
	}

	@Then("El usuario es llevado a la pagina de inicio")
	public void el_usuario_es_llevado_a_la_pagina_de_inicio() {
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"vser is navigated to Home Page");
	}

	@And("cierra el navegador")
	public void cierra_el_navegador() {
		driver.close();
	}

}
