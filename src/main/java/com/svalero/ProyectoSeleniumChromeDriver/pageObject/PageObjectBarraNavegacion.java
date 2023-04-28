package com.svalero.ProyectoSeleniumChromeDriver.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class PageObjectBarraNavegacion {

    private WebDriver driver;
    private WebElement acceptButton;
    private WebElement searchField;

    public void BarraNavegacion(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.lidl.es/");
        acceptButton = driver.findElement(By.className("cookie-alert-extended-button"));
        acceptButton.click();
        searchField = driver.findElement(By.id("mainsearch-input"));
    }

    public void buscar(String terminoBusqueda) {
        searchField.sendKeys(terminoBusqueda);
        searchField.submit();
    }

    public boolean esPaginaResultados() {
        String pageTitle = driver.getTitle();
        return pageTitle.contains("Resultado de búsqueda | Lidl");
    }

    public void cerrarNavegador() {
        driver.quit();
    }
}

