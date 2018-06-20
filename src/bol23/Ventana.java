/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol23;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author propa
 */
public class Ventana {
    
JFrame marco=new JFrame("BOLETIN 23");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JLabel etiqueta=new JLabel("Nome");
    JButton bot1=new JButton("Premer");
    JButton bot2=new JButton("Limpar");
    String[] lista= {"Elemento 1", "Elemento 2","Elemento 3"};
    JList lis=new JList(lista);
    
    
    JPasswordField pass=new JPasswordField("           ");
    JTextArea texta=new JTextArea("Area de texto");
    JButton bot3=new JButton("Botón");
    
    public void crearVent(){
      marco.setSize(600, 800);
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco.setVisible(true);
      panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
      panel1.add(panel1, BorderLayout.NORTH);
      panel1.add(panel2, BorderLayout.CENTER);
      marco.add(panel1);
    }
    public void panel1(){
      panel2.setLayout(null);
      panel2.setBackground(Color.green);
      panel2.setSize(400, 400);
      etiqueta.setBounds(100, 100, 100, 60);
      pass.setBounds(100, 150, 100, 60);
      pass.setSize(100,20);
      
      bot1.setBounds(120, 250, 100, 50);
      bot2.setBounds(300, 250, 100, 50);
      panel2.add(etiqueta);
      panel2.add(bot1);
      panel2.add(bot2);
      panel2.add(pass);
    
    }  
    public void panel2(){
      panel3.setLayout(null);
      texta.setBounds(450, 100, 100, 120); 
      bot3.setBounds(270, 200, 100, 50);
      lis.setBounds(100, 100, 100, 120);
      panel3.add(texta);
      panel3.add(bot3);
      panel3.add(lis);
      panel3.setBackground(Color.gray);  
    }
}
