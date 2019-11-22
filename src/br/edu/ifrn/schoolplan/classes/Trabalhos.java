/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.classes;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
/**
 *
 * @author viviane
 */
public class Trabalhos { 
    
    private MyColorChooser nivelImportancia;
    private int diasRestantes;
    private JDateChooser diaEntrega;
    private String nomeTrabalho;
    private int dificuldade;
    private int day, month, year;
   
    
    public Trabalhos(JDateChooser diaEntrega, String nomeTrabalho, int dificuldade) {
      
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

    public JDateChooser getDiaEntrega() {
        return diaEntrega;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setDiasRestantes(JDateChooser diaEntrega) {
    
        for(int i=0; i<=diasRestantes;i++){
         diasRestantes= Period.between(LocalDate.of(JDateChooser), LocalDate.now()).getDays();
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
      
   
        
    

