/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.laskinfx;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author aarni
 */
public class LaskentaTest {
    @BeforeClass
    public static void setUpClass() {
    }
    
    Laskenta l;
    
    @Before
    public void setUp(){
        l = new Laskenta();
    }
    
    public LaskentaTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @org.junit.jupiter.api.Test
    public void yhteenlaskuOikein(){
        assertEquals(8.000, l.lasku(1, 2, 6));
    }
    
    @org.junit.jupiter.api.Test
    public void vahennyslaskuOikein(){
        assertEquals(3.000, l.lasku(2, 5, 2));
    }
    
    @org.junit.jupiter.api.Test
    public void kertolaskuOikein(){
        assertEquals(20.000, l.lasku(3, 4, 5));
    }
    
    @org.junit.jupiter.api.Test
    public void jakolaskuOikein(){
        assertEquals(3.000, l.lasku(4, 6, 2));
    }
    
    @org.junit.jupiter.api.Test
    public void potenssilaskuOikein(){
        assertEquals(16.000, l.lasku(5, 2, 4));
    }
    
    @org.junit.jupiter.api.Test
    public void juurilaskuOikein(){
        assertEquals(20.000, l.lasku(6, 64, 3));
    }
    
    @org.junit.jupiter.api.Test
    public void varmastiEiTyhja(){
        assertEquals("testi", l.onkoSisaltoa("asdfe"));
    }

    
    /*@Test
    public void testLasku() {
        System.out.println("lasku");
        int toimitus = 1;
        double s1 = 3.0;
        double s2 = 5.0;
        Laskenta instance = new Laskenta();
        double expResult = 8.000;
        double result = instance.lasku(toimitus, s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testOnkoSisaltoa() {
        System.out.println("onkoSisaltoa");
        String s = "";
        Laskenta instance = new Laskenta();
        boolean expResult = false;
        boolean result = instance.onkoSisaltoa(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
