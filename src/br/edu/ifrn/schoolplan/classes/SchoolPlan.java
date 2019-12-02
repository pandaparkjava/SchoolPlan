package br.edu.ifrn.schoolplan.classes;

import java.awt.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SchoolPlan implements Serializable {
    
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Trabalho> trabalhos;
    
    public SchoolPlan(){
        disciplinas = new ArrayList<>();
        trabalhos = new ArrayList<>();
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
    
    public void adicionarTrabalho(Trabalho t){
        if(!trabalhos.contains(t)){
            trabalhos.add(t);
        }
    }
    
     
    
    public void removerTrabalho(Trabalho t){
        if(trabalhos.contains(t)){
            trabalhos.remove(t);
        }
    }

    public ArrayList<Trabalho> getTrabalhos() {
        return trabalhos;
    }
    
    public boolean serializar() {
        ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(
                    new FileOutputStream("schoolplan.obj"));
            output.writeObject(this);
            output.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
