package br.com.lmmendonca.entidades;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String              nome;
    private String              instrutor;
    private List<Aula>          aulas;
    private Set<Aluno>          alunos             = new HashSet<>();
    //Mapa, para todo aluno deve existir um integer para representalo;
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(Integer matricula) {
        if (!matriculaParaAluno.containsKey(matricula))
            throw new NoSuchElementException("A matricula " + matricula + " não foi encontrada.");
        return matriculaParaAluno.get(matricula);
    }
}
