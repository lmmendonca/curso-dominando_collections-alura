package br.com.lmmendonca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("ArrayList", 21);
        Aula a2 = new Aula("Lista de Objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas de objetos", 15);
        Aula a4 = new Aula("", 0);

        List<Aula> list = new ArrayList<Aula>();

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

//        Ordenação com java 8
        list.sort((Comparator.comparing(Aula::getAula)));

        list.forEach(aula -> System.out.println(aula.toString()));


    }
}
