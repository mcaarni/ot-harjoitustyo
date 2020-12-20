package org.openjfx.laskinfx;

/**
 * Luokka suorittaa kaikki laskutoimitukset ja tarkistaa tyhjät merkkjonot
 * @author aarni
 */
public class Laskenta {

    /**
     * Normaali tyhjä konstruktori
     */
    public Laskenta() {
    }

    /**
    * Metodi suorittaa laskutoimituksen riippuen annetusta parametrista toimitus
    * ja palauttaa vastauksen kysymälle metodille.
    *
    * @param toimitus Merkkaa halutun operaation
    * @param s1 Sisältää ensimmäisen laskettavan arvon
    * @param s2 Sisältää toisen laskettavan arvon
    * 
    * @return Laskutoimituksen vastaus
    */
    public double lasku(int toimitus, double s1, double s2) {
        double vastaus = 0;

        switch (toimitus) {

            case 1:
                vastaus = s1 + s2;
                break;

            case 2:
                vastaus = s1 - s2;
                break;

            case 3:
                vastaus = s1 * s2;
                break;

            case 4:
                vastaus = s1 / s2;
                break;

            case 5:
                vastaus = Math.pow(s1, s2);
                break;

            case 6:
                if(s2 < 0){
                    return -1;
                }
                double d1 = Math.random() % 10;
                double pienin = 0.001;
                double isoin = 2147483647;
                double v = 0.0;
                while (isoin > pienin) {
                    v = ((s2 - 1.0) * d1
                            + (double) s1 / Math.pow(d1, s2 - 1)) / (double) s2;
                    isoin = Math.abs(v - d1);
                    d1 = v;
                }
                vastaus = v;
                break;
        }
        return vastaus;
    }
    
    /**
     * Selvittää onko String tyhjä tai null
     * 
     * @param s Tarkistettava merkkijono
     * @return Onko merkkijono tyhjä vai ei
     */
    public boolean onkoSisaltoa(String s){
        if(s != null && s.length() > 0){
            return true;
        }
        return false;
    }

}
