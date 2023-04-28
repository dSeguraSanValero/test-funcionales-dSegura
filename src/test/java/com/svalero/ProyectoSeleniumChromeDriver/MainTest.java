package com.svalero.ProyectoSeleniumChromeDriver;

import com.svalero.ProyectoSeleniumChromeDriver.tests.BarraNavegacion;
import com.svalero.ProyectoSeleniumChromeDriver.tests.CargarProductos;
import com.svalero.ProyectoSeleniumChromeDriver.tests.CarritoCompra;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void verificarTest1() {
        assertEquals("Test superado: El número de productos cargados coincide", CargarProductos.cargarProductosLidl());
    }

    @Test
    public void verificarTest2() {
        assertEquals("Resultado de búsqueda | Lidl", BarraNavegacion.utilizarBarraNavegacion());
    }

    @Test
    public void verificarTest3() {
        assertEquals("¡Test superado! El carrito de compra funciona.", CarritoCompra.utilizarCarrito());
    }
}








