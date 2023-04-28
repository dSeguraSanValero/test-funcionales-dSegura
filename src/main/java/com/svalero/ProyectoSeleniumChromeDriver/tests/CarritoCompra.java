package com.svalero.ProyectoSeleniumChromeDriver.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CarritoCompra {

    public static String utilizarCarrito() {

        String resultado = null;

        // Ruta de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Abrir la página de lidl, en la sección del producto
        driver.get("https://www.lidl.es/es/comba-de-entrenamiento-10m/p49054");

        // Aceptamos el botón de las cookies
        WebElement acceptButton = driver.findElement(By.className("cookie-alert-extended-button"));
        acceptButton.click();

        // Encontrar el botón "Añadir a la cesta" y hacer clic en él
        WebElement botonAñadir = driver.findElement(By.id("add-to-cart"));
        botonAñadir.click();

        // Nos desplazamos a la página web del carrito de compra
        driver.get("https://www.lidl.es/es/basket/contents");

        // Verificar que el artículo se añadió al carrito
        WebElement mensajeCarrito = driver.findElement(By.className("basket"));
        String mensaje = mensajeCarrito.getText();

        if (mensaje.contains("Comba")) {
            resultado = "¡Test superado! El carrito de compra funciona.";

        } else {
            resultado = "¡Error! Test no superado.";
        }

        // Cerrar el navegador, imprimir por consola el resultado y devolverlo mediante "return"
        System.out.println(resultado);
        driver.quit();
        return resultado;
    }
}
