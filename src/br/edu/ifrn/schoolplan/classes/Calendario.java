/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.classes;
 import java.util.Calendar;
/**
 *
 * @author viviane
 */
public class Calendario {
    private Calendar cal;

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal.getInstance();
    }
   
}
