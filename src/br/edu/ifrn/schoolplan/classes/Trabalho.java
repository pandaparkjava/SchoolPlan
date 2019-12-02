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
import java.util.Date;
/**
 *
 * @author viviane
 */
public class Trabalho { 
    
    private MyColorChooser nivelImportancia;
    private int diasRestantes;
    private Date diaAtual;
    private Date diaEntrega;
    private String nomeTrabalho;
    private int dificuldade;
    private int day, month, year;
    private String descricao;
    private boolean prova;
   
    
    public Trabalho(Date diaEntrega, String nomeTrabalho, int dificuldade, String descricao, boolean prova) {
      
        this.diaEntrega= diaEntrega;
        this.nomeTrabalho = nomeTrabalho;
        this.dificuldade= dificuldade;
        this.descricao = descricao;
        this.prova = prova;
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

    public Date getDiaEntrega() {
        return diaEntrega;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setDiasRestantes(int diasRestantes) {
      this.diasRestantes=diasRestantes ;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isProva() {
        return prova;
    }

    public void setProva(boolean prova) {
        this.prova = prova;
    }

    @Override
    public String toString() {
        return nomeTrabalho;
    }
    }