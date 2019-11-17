package br.edu.ifrn.schoolplan.classes;

import java.awt.List;
import java.util.ArrayList;

public class SchoolPlan {
    
    private ArrayList<Disciplina> disciplinas;
    private ArrayList< Trabalhos> trabalhos;
    public SchoolPlan(){
        disciplinas = new ArrayList<>();
        trabalhos= new ArrayList<>();
    }
    
    public void adicionarDisciplina(Disciplina d){
        if(!disciplinas.contains(d)){
            disciplinas.add(d);
        }
    }
    
    public void removerDisciplina(Disciplina d){
        if(disciplinas.contains(d)){
            disciplinas.remove(d);
        }
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
     public void adicionarTrabalho(Trabalhos t){
        if(!trabalhos.contains(t)){
            trabalhos.add(t);
        }
    }
    
    public void removerTrabalho(Trabalhos t){
        if(trabalhos.contains(t)){
            trabalhos.remove(t);
        }
    }

    public ArrayList<Trabalhos> getTrabalhos() {
        return trabalhos;
    }
}
