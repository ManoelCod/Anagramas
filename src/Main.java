import java.util.List;

import utils.Anagrama;

public class Main {
    public static void main(String[] args) {
        String entrada = "abc";
        List<String> anagramas = Anagrama.gerarAnagramas(entrada);

        System.out.println("Anagramas de '" + entrada + "':");
        for (String anagrama : anagramas) {
            System.out.println(anagrama);
        }
    }
}