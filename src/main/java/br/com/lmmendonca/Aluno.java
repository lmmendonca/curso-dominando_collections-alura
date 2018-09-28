package br.com.lmmendonca;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Aluno {

    private String     nome;
    private Integer    matricula;
    private List<Aula> aulas  = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();


    public Aluno(String nome, Integer matricula) {
        if (nome == null) throw new NullPointerException();
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}
