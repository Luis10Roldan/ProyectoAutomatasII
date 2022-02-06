/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi
 * <sguergachi at gmail.com>
 */
public class EventoCheck extends JFrame {
      private JTextField txt;
      JCheckBox bold,itali;
      
      public EventoCheck(){
            
            super("Evento en JCheckBox");
            
            Container container = getContentPane();
            container.setLayout(new FlowLayout());
            
            txt = new JTextField("Observa el cambio de estilo",20);
            txt.setFont(new Font("Serif",Font.PLAIN,14));
            container.add(txt);
            bold = new JCheckBox("Bold");
            container.add(bold);
            
            itali = new JCheckBox("Italic");
            container.add(itali);
            this.setLocationRelativeTo(null);
            bold.addItemListener(new ManejaCheckBox());
            itali.addItemListener(new ManejaCheckBox());
            
            setSize(275,100);
            setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            
            
            
            
            
      }

/**
 * @param args the command line
 * arguments
 */
public static void main(String[] args) {
      
      new EventoCheck();
      
}

private class ManejaCheckBox implements ItemListener{

      private int valBold = Font.PLAIN;
      private int valItalic = Font.PLAIN;

            @Override
            public void itemStateChanged(ItemEvent ie) {
                  
                  if (ie.getSource() == bold) {
                        
                        valBold = bold.isSelected() ? Font.BOLD : Font.PLAIN;
                        
                  }
                  if (ie.getSource() == itali) {
                        
                         valItalic = bold.isSelected() ? Font.ITALIC : Font.PLAIN;
                        
                  }
                  
                  txt.setFont(new Font ("Serif", valBold+valItalic,14 ));
            }




}

}
