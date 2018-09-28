package br.com.lmmendonca;

import br.com.lmmendonca.entidades.Aluno;
import br.com.lmmendonca.entidades.Aula;
import br.com.lmmendonca.entidades.Curso;

public class TesteBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso curso = new Curso("JAVA", "LEONARDO");
        curso.adiciona(new Aula("Lista de Objetos", 15));
        curso.adiciona(new Aula("ArrayList", 21));

        Aluno aluno1 = new Aluno("Leonardo", 123456);
        Aluno aluno2 = new Aluno("Marcelo", 123457);
        Aluno aluno3 = new Aluno("Gabriel", 123458);


        curso.matricula(aluno1);
        curso.matricula(aluno2);
        curso.matricula(aluno3);

        Aluno aluno = curso.buscaMatriculado(1234556);

        System.out.println(aluno);
    }
}
