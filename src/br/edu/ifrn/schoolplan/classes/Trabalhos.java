/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.classes;
import java.awt.Color;
 import java.util.Calendar;
/**
 *
 * @author viviane
 */
public class Trabalhos { 
    
    private ColorChooser nivelImportancia;
    private int diasRestantes;
    private String nomeTrabalho;
    private int dificuldade;
    private Calendar cal;
    
    public Trabalhos(ColorChooser nivelImportancia, int diasRestantes, String nomeTrabalho, int dificuldade) {
        this.nivelImportancia = nivelImportancia;
        this.diasRestantes = diasRestantes;
        this.nomeTrabalho = nomeTrabalho;
        this.dificuldade= dificuldade;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setNomeTrabalho(String nomeTrabalho) {
        this.nomeTrabalho = nomeTrabalho;
    }
   
   
    public ColorChooser getNivelImportancia() {
        return nivelImportancia;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
        for(int i=0; i<=diasRestantes;i++){
            
        }
    }

    public void setNivelImportancia(ColorChooser nivelImportancia) {
        this.nivelImportancia = nivelImportancia;
        if(diasRestantes>10){
           nivelImportancia.setBackground(Color.GREEN);        
        }else if(diasRestantes<10 && diasRestantes>6){
            if(dificuldade>=5){
                nivelImportancia.setBackground(Color.YELLOW);
            }else{
                nivelImportancia.setBackground(Color.GREEN);
            }
        }else if(diasRestantes <=2){
                nivelImportancia.setBackground(Color.RED);
                }
            
        }
    }
      
   
        
    

