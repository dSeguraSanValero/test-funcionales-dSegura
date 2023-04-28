package com.svalero.ProyectoSeleniumChromeDriver.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CargarProductos {
    public static String cargarProductosLidl() {

        String resultado = null;

        // Ruta de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Cargamos la página web de Lidl
        driver.get("https://www.lidl.es/es/accesorios-de-playa/c2157");

        // Obtenemos el número de productos que se cargan en la página
        int numProductosEsperado = 6;

        // Obtenemos el número de productos que se cargan en la página mediante el nombre de la clase Java
        int numProductosObtenido = driver.findElements(By.className("plp-product-grid-box-tile__wrapper")).size();

        // Comparamos si el número de productos esperado y obtenido coinciden, y devolvemos el resultado
        if (numProductosEsperado == numProductosObtenido) {
            resultado = "Test superado: El número de productos cargados coincide";
        } else {
            resultado = "¡Error! Test no superado : El número de productos cargados No coincide";
        }

        // Cerrar el navegador, imprimir por consola el resultado y devolverlo mediante "return"
        System.out.println(resultado);
        driver.quit();
        return resultado;

    }
}
