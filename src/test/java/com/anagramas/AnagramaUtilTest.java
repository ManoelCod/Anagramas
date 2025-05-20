package com.anagramas;

import java.util.List;
import org.junit.jupiter.api.Test;

import com.Anagramas.utils.Anagrama;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramaUtilTest {

    @Test
    public void testAnagramaComTresLetras() {
        List<String> anagramas = Anagrama
                .gerarAnagramas("abc");
        assertEquals(6, anagramas.size());
        assertTrue(anagramas.contains("abc"));
        assertTrue(anagramas.contains("acb"));
        assertTrue(anagramas.contains("bac"));
        assertTrue(anagramas.contains("bca"));
        assertTrue(anagramas.contains("cab"));
        assertTrue(anagramas.contains("cba"));
    }

    @Test
    public void testAnagramaComUmaLetra() {
        List<String> anagramas = Anagrama.gerarAnagramas("x");
        assertEquals(1, anagramas.size());
        assertTrue(anagramas.contains("x"));
    }

    @Test
    public void testEntradaVazia() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Anagrama.gerarAnagramas("");
        });
        assertEquals("Entrada inválida! Certifique-se de que a entrada contém apenas letras e não está vazia.",
                exception.getMessage());
    }
}