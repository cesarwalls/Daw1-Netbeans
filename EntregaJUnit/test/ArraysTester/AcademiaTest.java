/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysTester;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cesar
 */
public class AcademiaTest {

    public AcademiaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMostrarInfo() {
        Academia academia = new Academia();
        academia.mostrarInfo();
    }

    @Test
    public void testAñadirProfesorAleatorio() {
        Academia academia = new Academia();
        academia.añadirProfesorAleatorio();
    }

    @Test
    public void testEliminarMiembroAleatorio() {
        Academia academia = new Academia();
        academia.eliminarMiembroAleatorio();
    }

    @Test
    public void testCambiarCodigoAleatorio() {
        Academia academia = new Academia();
        academia.cambiarCodigoAleatorio();
       
    }

}
