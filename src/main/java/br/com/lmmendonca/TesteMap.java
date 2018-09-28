package br.com.lmmendonca;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leo");
        pessoas.put(1, "Sophie");
        pessoas.put(50, "Regina");
        pessoas.put(51, "Silvio");

        pessoas.keySet().forEach(pessoa -> System.out.println(pessoas.get(pessoa)));

    }
}
