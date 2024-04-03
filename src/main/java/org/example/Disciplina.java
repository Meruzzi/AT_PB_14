package org.example;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int Codigo;
    private String Nome;
    private List<Grade> Grades = new ArrayList<>();

    public Disciplina(int codigo, String nome) {
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

    public List<Grade> getGrades() {
        return Grades;
    }

    public void addGrade(Grade grade) {
        Grades.add(grade);
    }
}
