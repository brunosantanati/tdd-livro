package me.brunosantana.tdd.numeros.romanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

    private static Map<Character, Integer> tabela =
            new HashMap<Character, Integer>() {{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }};

    public int converte(String numeroEmRomano) {
        /*
        Repare que os símbolos em um numeral romano, da direita para a esquerda, sempre crescem.
        Quando um número a esquerda é menor do que seu vizinho a direita,
        esse número deve então ser subtraído ao invés de somado no acumulador.
         */
        int acumulador = 0;
        int ultimoVizinhoDaDireita = 0;

        for (int i = numeroEmRomano.length() - 1; i >= 0; i--) {

            // pega o inteiro referente ao simbolo atual
            int atual = tabela.get(numeroEmRomano.charAt(i));

            // se o da direita for menor, o multiplicaremos
            // por -1 para torná-lo negativo
            int multiplicador = 1;
            if (atual < ultimoVizinhoDaDireita) multiplicador = -1;

            acumulador += atual * multiplicador;

            // atualiza o vizinho da direita
            ultimoVizinhoDaDireita = atual;
        }
        return acumulador;
    }

}
