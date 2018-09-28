package br.com.lmmendonca.sets;

import java.util.Collection;
import java.util.HashSet;

public class TesteAluno {

    public static void main(String[] args) {

//        Set => Conjunto;
//        Não permite que objetos sejam adicionados repetidamente;

        Collection<String> alunos = new HashSet<>();

        alunos.add("Luiz");
        alunos.add("Luiz");
        alunos.add("Luiz");
        alunos.add("Alberto Souza");
        alunos.add("Sophie");

        System.out.println(alunos);

        alunos.forEach(System.out::println);

        System.out.println(alunos.contains("Luiz"));
    }
}
