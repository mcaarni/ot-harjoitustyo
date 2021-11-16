package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;
    Kassapaate kassa;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
        kassa = new Kassapaate();
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti != null);
    }

    @Test
    public void kortinArvoOikeinAlussa() {
        assertEquals("saldo: 0.10", kortti.toString());
    }

    @Test
    public void kortinArvoKasvaaOikein() {
        kortti.lataaRahaa(50);
        assertEquals("saldo: 0.60", kortti.toString());
    }

    @Test
    public void rahanOttaminenToimii() {
        kortti.lataaRahaa(250);
        kortti.otaRahaa(50);
        assertEquals("saldo: 2.10", kortti.toString());
    }

    @Test
    public void liikaOttaminenEiVahenna() {
        kortti.lataaRahaa(50);
        kortti.otaRahaa(100);
        assertEquals("saldo: 0.60", kortti.toString());
    }

    

}
