package com.example.projeto;

public class Banco {

    public static String formula = "juros1 * 2 + juros2";

    public static double calcularJuros(double juros1, double juros2) {
        String expressao;
        expressao = formula.replace("juros1", Double.toString(juros1));
        expressao = expressao.replace("juros2", Double.toString(juros2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
