package org.formation.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatriceTest {

    @Test
    public void setResultat() {
        Calculatrice calculatrice = new Calculatrice();
        double testResultat = 20.0d;
        calculatrice.setResultat(testResultat);
        assertTrue("set Resulat",calculatrice.getResultat()==testResultat);
    }

    @Test
    public void addition() {
        Calculatrice calculatrice = new Calculatrice();
        char charResultat = '5';
        double testResultat = Double.parseDouble(""+charResultat);
        calculatrice.setResultat(testResultat);
        calculatrice.addition(charResultat);
        assertTrue("addition",calculatrice.getResultat()==(testResultat+testResultat));
    }

    @Test
    public void division() {
        Calculatrice calculatrice = new Calculatrice();
        char charResultat = '5';
        double testResultat = Double.parseDouble(""+charResultat);
        calculatrice.setResultat(testResultat);
        calculatrice.division(charResultat);
        assertTrue("divition",calculatrice.getResultat()==(testResultat/testResultat));
        try {
            calculatrice.division('0');
            assertFalse("divsion par 0",false);
        }catch (Exception e){
            assertTrue("division par 0",true);
        }
    }

    @Test
    public void soustraction() {
        Calculatrice calculatrice = new Calculatrice();
        char charResultat = '5';
        double testResultat = Double.parseDouble(""+charResultat);
        calculatrice.setResultat(testResultat);
        calculatrice.soustraction(charResultat);
        assertTrue("soustraction",calculatrice.getResultat()==(testResultat-testResultat));
    }

    @Test
    public void multiplication() {
        Calculatrice calculatrice = new Calculatrice();
        char charResultat = '5';
        double testResultat = Double.parseDouble(""+charResultat);
        calculatrice.setResultat(testResultat);
        calculatrice.multiplication(charResultat);
        assertTrue("multiplication",calculatrice.getResultat()==(testResultat*testResultat));
    }

    
}