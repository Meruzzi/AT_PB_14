package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(123, "Gabriel");
        Aluno aluno2 = new Aluno(321, "Jhon");
        Aluno aluno3 = new Aluno(213, "Cenna");
        Aluno aluno4 = new Aluno(312, "Snow");
        Aluno aluno5 = new Aluno(231, "Marantz");

        Curso curso1 = new Curso(593, "Java");

        Grade grade1 = new Grade(253, "Backend");

        Disciplina disciplina1 = new Disciplina(985, "Testes em Java");
        Disciplina disciplina2 = new Disciplina(654, "C#");
        Disciplina disciplina3 = new Disciplina(134, ".NET");

        curso1.setGrade(grade1);
        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);
        curso1.addAluno(aluno3);
        curso1.addAluno(aluno4);
        curso1.addAluno(aluno5);

        aluno1.setCurso(curso1);
        aluno2.setCurso(curso1);
        aluno3.setCurso(curso1);
        aluno4.setCurso(curso1);
        aluno5.setCurso(curso1);

        grade1.setCurso(curso1);
        grade1.addDisciplina(disciplina1);
        grade1.addDisciplina(disciplina2);
        grade1.addDisciplina(disciplina3);

        disciplina1.addGrade(grade1);
        disciplina2.addGrade(grade1);
        disciplina3.addGrade(grade1);

        curso1.exibirAlunos();
        curso1.exibirGrade();

    }
}