package utils;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

    // Método principal para gerar anagramas
    public static List<String> gerarAnagramas(String entrada) {
        List<String> resultado = new ArrayList<>();

        // Validação básica
        if (entrada == null || entrada.isEmpty() || !entrada.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(
                    "Entrada inválida! Certifique-se de que a entrada contém apenas letras e não está vazia.");
        }

        gerarPermutacoes("", entrada, resultado);
        return resultado;
    }

    // Método recursivo para permutar caracteres
    private static void gerarPermutacoes(String prefixo, String restante, List<String> resultado) {
        if (restante.isEmpty()) {
            resultado.add(prefixo);
        } else {
            for (int i = 0; i < restante.length(); i++) {
                gerarPermutacoes(prefixo + restante.charAt(i), restante.substring(0, i) + restante.substring(i + 1),
                        resultado);
            }
        }
    }
}