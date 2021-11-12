package me.brunosantana.tdd.numeros.romanos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorDeNumeroRomanoTest {

    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }

}