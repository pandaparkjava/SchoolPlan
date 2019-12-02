/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.classes;

import com.toedter.calendar.JDateChooser;

/**
 *
 * @author ferna
 */
public class Prova extends Trabalho {
    
    public Prova(JDateChooser diaEntrega, String nomeTrabalho, int dificuldade, String descricao) {
        super(diaEntrega, nomeTrabalho, dificuldade, descricao);
    }
    
}
