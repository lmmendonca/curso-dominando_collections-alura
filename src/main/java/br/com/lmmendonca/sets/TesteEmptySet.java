package br.com.lmmendonca.sets;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

    public static void main(String[] args) {
//        Interessante para utilizar quando se tenta cadastrar algum aluno a um curso desativado.
        Set<String> nomes = Collections.emptySet();
        nomes.add("Leonardo");

        System.out.println(nomes);
    }
}
