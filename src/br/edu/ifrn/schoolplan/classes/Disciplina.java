package br.edu.ifrn.schoolplan.classes;

import java.awt.Color;

public class Disciplina {
    private String nome;
    private Color cor;
    private String professor;
    private int n1, n2, n3, n4;
    
    public Disciplina(String nome, String professor, Color cor) {
        this.nome = nome;
        this.professor = professor;        
        this.cor = cor;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
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
