package br.com.lmmendonca;

public class TesteAlunoComCurso {

    public static void main(String[] args) {
        Curso curso = new Curso("JAVA", "LEONARDO");
        curso.adiciona(new Aula("Lista de Objetos", 15));
        curso.adiciona(new Aula("ArrayList", 21));

        Aluno aluno1 = new Aluno("Leonardo", 123456);
        Aluno aluno2 = new Aluno("Marcelo", 123457);
        Aluno aluno3 = new Aluno("Gabriel", 123458);
        Aluno aluno4 = new Aluno("Leonardo", 123456);


        curso.matricula(aluno1);
        curso.matricula(aluno2);
        curso.matricula(aluno3);

        curso.getAlunos().forEach(System.out::println);

        System.out.println(curso.estaMatriculado(aluno1));


        System.out.println(aluno1.equals(aluno4));

    }
}
