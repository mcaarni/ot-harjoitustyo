/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KassapaateTest {

    Maksukortti kortti;
    Kassapaate kassa;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
        kassa = new Kassapaate();
    }

    @Test
    public void kassanArvoOikeinAlussa() {
        assertEquals(100000, kassa.kassassaRahaa());
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void edullisiaMyytyToimii() {
        kortti.lataaRahaa(500);
        kassa.syoEdullisesti(kortti);
        kassa.syoEdullisesti(kortti);
        assertEquals(2, kassa.edullisiaLounaitaMyyty());
    }

    @Test
    public void maukkaitaMyytyToimii() {
        kortti.lataaRahaa(1000);
        kassa.syoMaukkaasti(kortti);
        kassa.syoMaukkaasti(kortti);
        assertEquals(2, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void edullinenKassaltaToimii() {
        kassa.syoEdullisesti(300);
        kassa.syoEdullisesti(250);
        assertEquals(100480, kassa.kassassaRahaa());
    }

    @Test
    public void maukkaastiKassaltaToimii() {
        kassa.syoMaukkaasti(500);
        kassa.syoMaukkaasti(1000);
        assertEquals(100800, kassa.kassassaRahaa());
    }

    @Test
    public void eiKumpaakaanLiianVahallaRahalla() {
        kassa.syoEdullisesti(200);
        kassa.syoMaukkaasti(350);
        assertEquals(100000, kassa.kassassaRahaa());
    }

    @Test
    public void kassastaKortilleToimii() {
        kassa.lataaRahaaKortille(kortti, 5000);
        assertEquals(105000, kassa.kassassaRahaa());
    }

    @Test
    public void eiVaraaEdullisestiKortilla() {
        Maksukortti k2 = new Maksukortti(200);
        kassa.syoEdullisesti(k2);
        assertEquals("saldo: 2.0", k2.toString());
    }

    @Test
    public void eiVaraaMaukkaastiKortilla() {
        Maksukortti k2 = new Maksukortti(350);
        kassa.syoMaukkaasti(k2);
        assertEquals("saldo: 3.50", k2.toString());
    }

    @Test
    public void eiVoiLisataNegatiivisiaKortille() {
        kassa.lataaRahaaKortille(kortti, -500);
        assertEquals(100000, kassa.kassassaRahaa());
    }

}
