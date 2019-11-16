package br.edu.ifrn.schoolplan.classes;

import java.awt.List;
import java.util.ArrayList;

public class SchoolPlan {
    
    private ArrayList<Disciplina> disciplinas;
    
    public SchoolPlan(){
        disciplinas = new ArrayList<>();
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
    
    
}
