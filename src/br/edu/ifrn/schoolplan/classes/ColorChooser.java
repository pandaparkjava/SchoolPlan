package br.edu.ifrn.schoolplan.classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChooser extends JFrame {
    
    private JButton mudarCor;
    private Color cor = Color.lightGray;
    private Container c;
    
    public ColorChooser(){
        super("Usando JColorChooser");
        
        c = getContentPane();
        c.setLayout(new FlowLayout());
        
        mudarCor = new JButton("Modificando a cor");
        mudarCor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cor = JColorChooser.showDialog(ColorChooser.this, "Selecione uma cor", cor);
                
                if(cor == null){
                    cor = Color.lightGray;
                    c.setBackground(cor);
                    c.repaint();
                }
            }
        });
        c.add(mudarCor);
        
        setSize(400, 130);
        show();
    }
}
