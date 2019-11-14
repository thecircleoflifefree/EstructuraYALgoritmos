/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import javax.swing.*;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class JuegoDdados extends JFrame{
    public JPanel panelprincipal;
public JuegoDdados(){
        
    super("Juego de dados");
   
    setSize(525,500);
     iniciarcomponentes();
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false); // no permite que la ventana cambie su tamaño
    //setMinimumSize(new Dimension(500,200));//declarar un minimo de tamaño de la ventana
  
}
private void iniciarcomponentes(){
   colocarPaneles();
   colocarBotones();
    colocarLabels();
   }
private void colocarPaneles(){
       panelprincipal = new JPanel();
    panelprincipal.setBackground(Color.WHITE);
    panelprincipal.setLayout(null);
    this.getContentPane().add(panelprincipal);
    
  
 
    
    
    
   }
private void colocarLabels(){
    
  JLabel labeltitulo = new JLabel("Juego de dados", SwingConstants.CENTER);
  labeltitulo.setFont(new Font("cooper black",0, 60));
    labeltitulo.setBounds(10, 20, 500,85);
    labeltitulo.setForeground(Color.BLACK);
 // labeltitulo.setBackground(Color.BLACK); //permite ver tamaño exacto de la etiqueta
  //labeltitulo.setOpaque(true); //permite ver tamaño exacto de la etiqueta
   // llamada de labels al panel
    panelprincipal.add(labeltitulo);
}
public void colocarBotones(){
    //boton lanzar dados
    JButton lanzardados = new JButton();
    lanzardados.setBounds(20,400,200,50);
    lanzardados.setText("Lanzar dados");
    lanzardados.setEnabled(true);
    lanzardados.setFont(new Font("cooper black", Font.BOLD,20));
    panelprincipal.add(lanzardados);
   
    //boton preguntas
    JButton lanzarpreguntas = new JButton();
      lanzarpreguntas.setBounds(300,400,200,50);
    lanzarpreguntas.setText("Preguntas");
    lanzarpreguntas.setEnabled(true);
    lanzarpreguntas.setFont(new Font("cooper black", Font.BOLD,20));
    panelprincipal.add(lanzarpreguntas);

    
   
     JLabel labelimagen1 = new JLabel ();
  ImageIcon imagendado1 = new ImageIcon("dado1.png");
  labelimagen1.setBounds(10 ,100,213,270);
   labelimagen1.setIcon(new ImageIcon(imagendado1.getImage().getScaledInstance(labelimagen1.getWidth(), labelimagen1.getHeight(), Image.SCALE_SMOOTH)));
panelprincipal.add(labelimagen1);//agrego al panel

JLabel labelimagen2 = new JLabel ();
  ImageIcon imagendado2 = new ImageIcon("dado2.png");
  labelimagen2.setBounds(275,100,228,267);
  labelimagen2.setIcon(new ImageIcon(imagendado2.getImage().getScaledInstance(labelimagen2.getWidth(), labelimagen2.getHeight(), Image.SCALE_SMOOTH)));
panelprincipal.add(labelimagen2);  //agrego imagen al panel

        ActionListener preguntar = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Preguntas preg = new Preguntas () ;
            }
        };
        

        ActionListener lanzamiento = new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
          //randomizador de numeros del 1 al 6
                Random generar = new Random();
                int dado1 =  0;
                dado1 = ((int)(generar.nextDouble()*6));
                int dado2 =  0;
                dado2 = ((int)(generar.nextDouble()*6));
            //PROCESO QUE CAMBIA LAS IMAGENES ALEATOREAS EN EL LABEL
             //PROCESO PARA EL PRIMER DADO
            switch (dado1) {
       case 0:
        dado1 = 0;
             labelimagen1.setIcon(new ImageIcon("dado1.png"));
                            break;
                   
                    case 1:
                        dado1 = 1;
                    labelimagen1.setIcon(new ImageIcon("dado2.png"));
                     break;
                     
                    case 2:
                        dado1 = 2;
               labelimagen1.setIcon(new ImageIcon("dado3.png"));
                break;
                
                    case 3:
                        dado1 = 3;
                  labelimagen1.setIcon(new ImageIcon("dado4.png"));
                    break;
                  
                    case 4:
                        dado1 = 4;
                      labelimagen1.setIcon(new ImageIcon("dado5.png"));
                      break;
                  
                    case 5:
                        dado1 = 5;
                labelimagen1.setIcon(new ImageIcon("dado6.png"));
                     break;
               }
                //PROCESO PARA EL SEGUNDO DADO
                 switch (dado2) {
                case 0:
               dado2 = 0;
    labelimagen2.setIcon(new ImageIcon("dado1.png"));
         break;
                    case 1:
                       dado2 =1;
                    labelimagen2.setIcon(new ImageIcon("dado2.png"));
                      break;
                   
                    case 2:
                       dado2 = 2;
                 labelimagen2.setIcon(new ImageIcon("dado3.png"));
                     break;
                
                    case 3:
                       dado2 = 3;
                       labelimagen2.setIcon(new ImageIcon("dado5.png"));
                      break;
                
                    case 4:
                       dado2 = 4;
                             labelimagen2.setIcon(new ImageIcon("dado5.png"));
                      break;
                
                    case 5:
                   dado2 = 5;
                          labelimagen2.setIcon(new ImageIcon("dado4.png"));
                       break;
           
                 }
            }
           
        };
            lanzardados.addActionListener(lanzamiento);
            lanzarpreguntas.addActionListener(preguntar);
           
                
            }



   
}
