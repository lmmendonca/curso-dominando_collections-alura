package br.com.lmmendonca;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aluno {

    private String     nome;
    private Integer    matricula;
    private List<Aula> aulas  = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();


    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[ALUNO: " + this.nome + ", MATRICLA: " + this.matricula + "]";
    }
}
