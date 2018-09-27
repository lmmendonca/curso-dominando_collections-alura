package br.com.lmmendonca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de aulas.";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        List<String> aulas = new ArrayList<String>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        Collections.shuffle(aulas);

        aulas.forEach(System.out::println);

        System.out.println("--------------------------");

        Collections.sort(aulas);

        aulas.forEach(System.out::println);


    }
}
