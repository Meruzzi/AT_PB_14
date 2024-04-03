package org.example;

public class Aluno {
    private int Matricula;
    private String Nome;
    private Curso curso;

    public Aluno(int matricula, String nome) {
        Matricula = matricula;
        Nome = nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
