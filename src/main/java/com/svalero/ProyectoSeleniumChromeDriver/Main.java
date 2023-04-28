package com.svalero.ProyectoSeleniumChromeDriver;

import java.util.Scanner;

import static com.svalero.ProyectoSeleniumChromeDriver.tests.BarraNavegacion.utilizarBarraNavegacion;
import static com.svalero.ProyectoSeleniumChromeDriver.tests.CargarProductos.cargarProductosLidl;
import static com.svalero.ProyectoSeleniumChromeDriver.tests.CarritoCompra.utilizarCarrito;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de automatización de Test, con Selenium y ChromeDriver");
        System.out.println();
        System.out.println("1: Comprueba que la sección, Artículos de playa, de la página web de Lidl carga 6 productos.");
        System.out.println("2: Comprueba que la barra de navegación funciona, introduciendo la palabra zapatillas.");
        System.out.println("3: Comprueba que el carrito de compra funciona");
        System.out.println();
        System.out.println();
        System.out.print("Por favor, introduce el número del test que quieres realizar: ");

        int numeroTest = teclado.nextInt();

        switch (numeroTest) {

            case 1:
                cargarProductosLidl();
                break;

            case 2:
                utilizarBarraNavegacion();
                break;

            case 3:
                utilizarCarrito();
                break;

            default:
                System.out.println("Error, introduce un número del 1 al 3 por favor.");
                break;
        }
    }
}


