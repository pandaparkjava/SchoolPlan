/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.janelas;

import br.edu.ifrn.schoolplan.classes.Disciplina;
import br.edu.ifrn.schoolplan.classes.Nota;
import br.edu.ifrn.schoolplan.classes.SchoolPlan;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferna
 */
public class GereNotas extends javax.swing.JFrame {

    Disciplina dBase;
    SchoolPlan plan;
    TelaDisciplinas td;
    
    private DefaultListModel<String> model1;

    public GereNotas(Disciplina d) {
        initComponents();
        td = new TelaDisciplinas();
        disciplina.setText(d.toString());
        
        dBase = d;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        disciplina = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        n1Rotulo = new javax.swing.JLabel();
        n2Rotulo = new javax.swing.JLabel();
        n3Rotulo = new javax.swing.JLabel();
        n4Rotulo = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        mediaRotulo = new javax.swing.JLabel();
        media = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        p1Rotulo = new javax.swing.JLabel();
        p2Rotulo = new javax.swing.JLabel();
        p3Rotulo = new javax.swing.JLabel();
        p4Rotulo = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        mAritmetica = new javax.swing.JRadioButton();
        mPonderada = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        disciplina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disciplina.setText("Disciplina");

        n1Rotulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        n1Rotulo.setText("N1");

        n2Rotulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        n2Rotulo.setText("N2");

        n3Rotulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        n3Rotulo.setText("N3");

        n4Rotulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        n4Rotulo.setText("N4");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        mediaRotulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mediaRotulo.setText("Média");

        media.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        media.setText("0");

        p1Rotulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1Rotulo.setText("P1");

        p2Rotulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2Rotulo.setText("P2");

        p3Rotulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3Rotulo.setText("P3");

        p4Rotulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p4Rotulo.setText("P4");

        buttonGroup1.add(mAritmetica);
        mAritmetica.setText("Média Aritmética");
        mAritmetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAritmeticaActionPerformed(evt);
            }
        });

        buttonGroup1.add(mPonderada);
        mPonderada.setText("Média Ponderada");
        mPonderada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPonderadaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Selecione o cálculo da nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mediaRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(n4Rotulo)
                            .addComponent(p3Rotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3)
                            .addComponent(n4))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n3Rotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p2Rotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n2Rotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p1Rotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n1Rotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p4Rotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mAritmetica, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mPonderada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mAritmetica)
                    .addComponent(mPonderada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1Rotulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1Rotulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n2Rotulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2Rotulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n3Rotulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3Rotulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n4Rotulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4Rotulo)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaRotulo)
                    .addComponent(media))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(calcular))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos(){
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
    }
    
    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try{
        dBase.setN1(Double.parseDouble(n1.getText()));
        dBase.setN2(Double.parseDouble(n2.getText()));
        dBase.setN3(Double.parseDouble(n3.getText()));
        dBase.setN4(Double.parseDouble(n4.getText()));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira caracteres válidos!", "ERRO", WIDTH);
            limparCampos();
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Insira caracteres válidos!", "ERRO", WIDTH);
            limparCampos();
        }
        try{
        plan.serializar();
        }catch(NullPointerException e){
            
        }
        dispose();
        td.setVisible(true);
        td.carregarLista();
    }//GEN-LAST:event_salvarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        try{
        if (mAritmetica.isSelected()) {
            Nota ari = new Nota();
            
            media.setText(ari.calcularAritmetica(Double.parseDouble(n1.getText()),
                    Double.parseDouble(n2.getText()),
                    Double.parseDouble(n3.getText()),
                    Double.parseDouble(n4.getText())) + "");
        }
        
        else if (mPonderada.isSelected()) {
            Nota pond = new Nota();
            media.setText(pond.calcularPonderada(Double.parseDouble(n1.getText()),
                    Double.parseDouble(n2.getText()),
                    Double.parseDouble(n3.getText()),
                    Double.parseDouble(n4.getText()),
                    Integer.parseInt(p1.getText()),
                    Integer.parseInt(p2.getText()),
                    Integer.parseInt(p3.getText()),
                    Integer.parseInt(p4.getText()))
                    + " ");
                    
        }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ensira Caracteres válidos!", "ERRO", WIDTH);
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void mAritmeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAritmeticaActionPerformed
        p1.setEnabled(false);
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);
    }//GEN-LAST:event_mAritmeticaActionPerformed

    private void mPonderadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPonderadaActionPerformed
        p1.setEnabled(true);
        p2.setEnabled(true);
        p3.setEnabled(true);
        p4.setEnabled(true);
    }//GEN-LAST:event_mPonderadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel disciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton mAritmetica;
    private javax.swing.JRadioButton mPonderada;
    private javax.swing.JLabel media;
    private javax.swing.JLabel mediaRotulo;
    private javax.swing.JTextField n1;
    private javax.swing.JLabel n1Rotulo;
    private javax.swing.JTextField n2;
    private javax.swing.JLabel n2Rotulo;
    private javax.swing.JTextField n3;
    private javax.swing.JLabel n3Rotulo;
    private javax.swing.JTextField n4;
    private javax.swing.JLabel n4Rotulo;
    private javax.swing.JTextField p1;
    private javax.swing.JLabel p1Rotulo;
    private javax.swing.JTextField p2;
    private javax.swing.JLabel p2Rotulo;
    private javax.swing.JTextField p3;
    private javax.swing.JLabel p3Rotulo;
    private javax.swing.JTextField p4;
    private javax.swing.JLabel p4Rotulo;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
