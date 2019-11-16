package br.edu.ifrn.schoolplan.classes;

import java.awt.Color;

public class Disciplina {
    private String nome;
    private Color cor;
    private String professor;
    
    
    public Disciplina(String nome, String professor, Color cor) {
        this.nome = nome;
        this.professor = professor;        
        this.cor = cor;
    }
    
    
    /*public void sincronizarSuap(){
    
        }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}
