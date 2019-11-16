/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.classes;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
 import java.util.Calendar;
/**
 *
 * @author viviane
 */
public class Trabalhos { 
    
    private MyColorChooser nivelImportancia;
    private int diasRestantes;
    private Calendar diaEntrega;
    private String nomeTrabalho;
    private int dificuldade;
    private int day, month, year;
   
    
    public Trabalhos(MyColorChooser nivelImportancia, Calendar diaEntrega, String nomeTrabalho, int dificuldade) {
        this.nivelImportancia = nivelImportancia;
        this.diaEntrega= diaEntrega;
        this.nomeTrabalho = nomeTrabalho;
        this.dificuldade= dificuldade;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setNomeTrabalho(String nomeTrabalho) {
        this.nomeTrabalho = nomeTrabalho;
    }
   
   
    public MyColorChooser getNivelImportancia() {
        return nivelImportancia;
    }

    public Calendar getDiaEntrega() {
        return diaEntrega;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setDiasRestantes(Calendar diaEntrega) {
        this.diaEntrega = diaEntrega;
        day= diaEntrega.get(Calendar.DAY_OF_MONTH);
        month= diaEntrega.get(Calendar.MONTH);
        year= diaEntrega.get(Calendar.YEAR);
       
        Calendar entrega = Calendar.getInstance();
        entrega.set(Calendar.DAY_OF_MONTH,day);
        entrega.set(Calendar.MONTH,month);
        entrega.set(Calendar.YEAR,year);
        for(int i=0; i<=diasRestantes;i++){
         diasRestantes= Period.between(LocalDate.of(day,month,year), LocalDate.now()).getDays();
        }
    }

    public void setNivelImportancia(MyColorChooser nivelImportancia) {
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
      
   
        
    

