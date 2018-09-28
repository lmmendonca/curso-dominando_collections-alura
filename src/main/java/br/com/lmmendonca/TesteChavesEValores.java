package br.com.lmmendonca;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteChavesEValores {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        Set<String> nomes = nomesParaIdade.keySet();

        nomes.forEach(System.out::println);

        Collection<Integer> idades = nomesParaIdade.values();

        idades.forEach(System.out::println);

        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();

        associacoes.forEach(row -> System.out.println(row.getKey() + " - " + row.getValue()));

    }
}
