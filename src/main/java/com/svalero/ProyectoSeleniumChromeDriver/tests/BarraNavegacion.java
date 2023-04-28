package com.svalero.ProyectoSeleniumChromeDriver.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class BarraNavegacion {
    public static String utilizarBarraNavegacion() {

        // Ruta de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Abrimos la página principal de Lidl España
        driver.get("https://www.lidl.es/");

        // Aceptamos el botónde las cookies
        WebElement acceptButton = driver.findElement(By.className("cookie-alert-extended-button"));
        acceptButton.click();

        // Encontramos el campo de búsqueda y lo rellenamos con "zapatillas"
        WebElement searchField = driver.findElement(By.id("mainsearch-input"));
        searchField.sendKeys("zapatillas");

        // Enviamos el formulario de búsqueda
        searchField.submit();

        // Obtenemos el título de la página de resultados
        String pageTitle = driver.getTitle();

        // Comprobamos que el título contenga el siguiente texto:
        if (pageTitle.contains("Resultado de búsqueda | Lidl")) {
            System.out.println("Test superado: La búsqueda se realizó correctamente");
        } else {
            System.out.println("¡Error! Test no superado: La búsqueda no se realizó correctamente");
        }

        // Cerrar el navegador, imprimir por consola el resultado y devolverlo mediante "return"
        driver.quit();
        return pageTitle;
    }
}


