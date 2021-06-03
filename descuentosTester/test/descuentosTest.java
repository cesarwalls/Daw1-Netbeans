/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class descuentosTest {
    
    public descuentosTest() {
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

    /**
     * Test of veinticinco method, of class descuentos.
     */
    @Test
    public void testVeinticinco() {
        System.out.println("veinticinco");
        double precio = 50.0;
        double expResult = 37.5;
        double result = descuentos.veinticinco(precio);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of trespordos method, of class descuentos.
     */
    @Test
    public void testTrespordos() {
        System.out.println("trespordos");
        double precio = 50.0;
        double precio1 = 40.0;
        double precio2 = 20.0;
        double expResult = 90.0;
        double result = descuentos.trespordos(precio, precio1, precio2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of diezdescuentoporpiezaigual method, of class descuentos.
     */
    @Test
    public void testDiezdescuentoporpiezaigual() {
        System.out.println("diezdescuentoporpiezaigual");
        double precio = 50.0;
        int numPiezas = 4;
        double expResult = 120.0;
        double result = descuentos.diezdescuentoporpiezaigual(precio, numPiezas);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
