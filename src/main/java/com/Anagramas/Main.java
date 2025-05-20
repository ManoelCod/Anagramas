package com.Anagramas;

import java.util.List;
import java.util.Scanner;

import com.Anagramas.utils.Anagrama;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        while (true) {
            System.out.print("Digite um texto (somente letras, sem números): ");
            entrada = scanner.nextLine();

            if (entrada.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Entrada inválida! Digite apenas letras, sem números ou espaços.");
            }
        }

        List<String> anagramas = Anagrama.gerarAnagramas(entrada);

        System.out.println("Anagramas de '" + entrada + "':");
        for (String anagrama : anagramas) {
            System.out.println(anagrama);
        }
        scanner.close();
    }
}