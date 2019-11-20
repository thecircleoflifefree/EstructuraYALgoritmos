package menuprincipal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random; 
import java.io.*;
import java.util.Scanner;

class Preguntas extends JFrame {

    
    JLabel etiqueta = new JLabel ("Bienvenido al juego de preguntas",SwingConstants.CENTER);
  
    JLabel etiquetablanco = new JLabel ("                                                                                                               ",SwingConstants.CENTER);
    JLabel etiqueta2 = new JLabel ("Inicia el jugador ganador lanzando los dados",SwingConstants.CENTER);
    JLabel etiqueta3 = new JLabel ("Click en aceptar para acceder a las pregunta ",SwingConstants.CENTER);
    JLabel etiqueta4 = new JLabel ("Click en salir para volver al menu principal",SwingConstants.CENTER);
    JLabel etiquetablanco2 = new JLabel ("                                                                                                             ",SwingConstants.CENTER);
    JButton aceptar = new JButton ("Aceptar");
    JButton print = new JButton ("Imprimir");
    JButton abandonar = new JButton ("Salir");
    String listapreguntas [][]= new String[4][2];
    String jugadores []= new String[2];
    int totales []= new int[2];
    int choice; 
    Random random = new Random();
    String selection;
    String jugador;
    Negocio Lista = new Negocio ();
    
    Preguntas (){
    
        super("Preguntas");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/2, height/2);
        setLocationRelativeTo(null);	
        
        //contenedores 
        Container contenedor = new Container ();
        contenedor = getContentPane();
 
        contenedor.setLayout(new FlowLayout());
        contenedor.add(etiqueta);
        contenedor.add(etiquetablanco);
        contenedor.add(etiqueta2);
        contenedor.add(etiqueta3);
        contenedor.add(etiqueta4);
        contenedor.add(etiquetablanco2);
        contenedor.add (aceptar);
        contenedor.add (print);
        contenedor.add (abandonar);
        //etiquetas parametros 
        etiqueta.setBounds (80,0,400,20);
        etiqueta.setFont(new Font("cooper black",0, 20));
        etiqueta2.setBounds (0,0,400,100);
        etiqueta3.setBounds (0,0,400,140);
        etiqueta4.setBounds (0,0,400,180);
        aceptar.setBounds (60,120,80,20);
        print.setBounds (250,120,80,20);
        abandonar.setBounds (160,120,80,20);
        abandonar.addActionListener(new Manejador());
        aceptar.addActionListener(new Manejador());
        print.addActionListener(new Manejador());
        setSize(390, 230);
        setVisible (true);
        setResizable(false); 
    }
    
    public static void main(String[] args) {
        Preguntas aplicacion = new Preguntas ();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }
    
    class Manejador implements ActionListener {
        public void actionPerformed(ActionEvent e) {    
        if (e.getSource()== aceptar)              
            Lista.seleccionar ();
        else   
        if (e.getSource()== print){
            Lista.imprimir();
        }
        else 
            dispose();                 
        }   
    }

}

