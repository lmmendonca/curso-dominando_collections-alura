package br.com.lmmendonca;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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
