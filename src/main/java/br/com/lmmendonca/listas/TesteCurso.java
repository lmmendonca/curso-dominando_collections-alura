package br.com.lmmendonca.listas;

import br.com.lmmendonca.entidades.Aula;
import br.com.lmmendonca.entidades.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso {

    public static void main(String[] args) {
        Curso curso = new Curso("JAVA", "LEONARDO");

        curso.adiciona(new Aula("Lista de Objetos", 15));

        curso.adiciona(new Aula("ArrayList", 21));

        System.out.println(curso.getAulas());

        curso.getAulas().forEach(aula -> System.out.println(aula.getTempo()));


        List<Aula> aulasImutaveis = curso.getAulas();

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulasMutaveis);

        System.out.println(aulasMutaveis);

        System.out.println(curso.getTempoTotal());

        System.out.println("---------------------------");

        System.out.println(curso.toString());
    }
}
