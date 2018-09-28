package br.com.lmmendonca;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String     nome;
    private String     instrutor;
    private List<Aula> aulas;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = new LinkedList<>();
    }

    public Curso(String nome, String instrutor, List<Aula> aulas) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = aulas;
    }


    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        //Não permite que a aulas seja alterada pelo metodo getAulas, imutavel.
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public Integer getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[CURSO: " + this.nome + ", TEMPO TOTAL: " + this.getTempoTotal() + ", AULAS: "
                + this.aulas + "]";

    }
}
