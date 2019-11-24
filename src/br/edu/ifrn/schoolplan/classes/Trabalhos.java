/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.classes;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.Date;

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
    private JDateChooser today;

    public Trabalhos(JDateChooser diaEntrega, String nomeTrabalho, int dificuldade) {

        this.diaEntrega = diaEntrega;
        this.nomeTrabalho = nomeTrabalho;
        this.dificuldade = dificuldade;
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

    public void setDiasRestantes(JDateChooser diaEntrega, JDateChooser today) {
        this.diaEntrega = diaEntrega;
        this.today = today;
        Date startDate = today.getDate();
        Date endDate = diaEntrega.getDate();

        long difference = endDate.getTime() - startDate.getTime();

        diasRestantes = (int) (difference / 1000 / 24);

    }

    public void setNivelImportancia(MyColorChooser nivelImportancia) {
        this.nivelImportancia = nivelImportancia;
        if (diasRestantes > 10) {
            nivelImportancia.setBackground(Color.GREEN);
        } else if (diasRestantes < 10 && diasRestantes > 6) {
            if (dificuldade >= 5) {
                nivelImportancia.setBackground(Color.YELLOW);
            } else {
                nivelImportancia.setBackground(Color.GREEN);
            }
        } else if (diasRestantes <= 2) {
            nivelImportancia.setBackground(Color.RED);
        }

    }
}
