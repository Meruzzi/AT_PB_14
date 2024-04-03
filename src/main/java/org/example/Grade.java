package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private int Codigo;
    private String Nome;
    private Curso curso;
    private List<Disciplina> Disciplinas = new ArrayList<>();

    public Grade(int codigo, String nome) {
        Codigo = codigo;
        Nome = nome;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return Disciplinas;
    }

    public void addDisciplina(Disciplina disciplinas) {
        Disciplinas.add(disciplinas);
    }
}
