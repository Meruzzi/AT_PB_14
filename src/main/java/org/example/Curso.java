package org.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int Codigo;
    private String Nome;
    private List<Aluno> Alunos;
    private Grade grade;

    public Curso(int codigo, String nome) {
        Codigo = codigo;
        Nome = nome;
    }

    public Curso(int codigo, String nome, Grade grade) {
        Codigo = codigo;
        Nome = nome;
        this.grade = grade;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        Alunos = alunos;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void addAluno(Aluno aluno) {
        if(Alunos == null) {
            Alunos = new ArrayList<>();
            Alunos.add(aluno);
        } else {
            Alunos.add(aluno);
        }
    }

    public void exibirAlunos() {
        System.out.println("Nome do curso: " + this.Nome);
        System.out.println("Alunos:");
        for (Aluno aluno : Alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public void exibirGrade() {
        System.out.println(this.Nome);
        List<Disciplina> disciplinasGrade = grade.getDisciplinas();

        System.out.println("Disciplinas da grade:");
        for (Disciplina disciplina : disciplinasGrade) {
            System.out.println(disciplina.getNome());
        }
    }


}
