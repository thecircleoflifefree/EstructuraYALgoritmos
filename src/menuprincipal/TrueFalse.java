package menuprincipal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrueFalse extends JFrame {

    public static void main(String[] args) {

        TrueFalse app = new TrueFalse();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Declaration

    JFrame f;

    JLabel preg;
    JButton botonVerdad= new JButton("Verdad");
    JButton botonFalso = new JButton("Falso");
    int counter=0;


    String [][] preguntas = {{"Era el diezmo un impuesto durante la colonia? ","true"},{"Los virreinatos abarcaban pequenas extensiones territoriales? ","false"},{"Los virreinatos estaban dirigidos por un virrey? ","true"},{"Las alcaldias eran administradas por un alcalde? ","false"},{"El gobernador es la maxima autoriad en las provincias? ","true"},{"CR politicamente dependia de la Capitania General de Mexico? ","false"},{"El mestizo es una mezcla entre blanco e indigena.","true"},{"Los indiginas son habitantes originarios de las indias","false"},{"El Zambo es hijo de un indigena y una persona negra","true"}};

    LinkedList simpleList = new LinkedList();

    //Constructor

    TrueFalse (){

        f = new JFrame();
        f.setLayout(new GridLayout(0,1));

        preg = new JLabel(preguntas[0][0]);
        System.out.println(preg);


        botonVerdad.addActionListener(new Decision());
        botonFalso.addActionListener (new Decision());
        f.add(preg);
        f.add(botonVerdad);

        f.add(botonFalso);

        f.setVisible(true);
        f.setSize(555,111);

    }

    public class Decision implements ActionListener{

        public void actionPerformed (ActionEvent e){

            if (e.getSource() == botonVerdad){

                for(int i=0; i<preguntas.length-1; i++){
                    if(preg.getText()== preguntas[i][0]){
                       if("true" != preguntas[i][1]){
                          simpleList.addNode(simpleList,preguntas[i][0]);
                          System.out.println("counter-->" + counter);
                       }
                    }                 
                }

                if(counter == preguntas.length-1){

                    f.remove(preg);
                    f.remove(botonVerdad);
                    f.remove(botonFalso);
                    simpleList.isListEmpty(simpleList,f);                   
                    System.out.println("preguntas es igual a length");
                    f.revalidate();
                    f.repaint();
                }

                else if(counter<preguntas.length-1){

                    counter++;
                    System.out.println("counter true-> " + counter);                   
                    preg.setText(preguntas[counter][0]);


                }
            }

            else if (e.getSource() == botonFalso){

                for(int i=0; i<preguntas.length-1; i++){
                    if(preg.getText()== preguntas[i][0]){
                       if("false" != preguntas[i][1]){
                          simpleList.addNode(simpleList,preguntas[i][0]);
                          System.out.println("counter-->" + counter);
                          System.out.println(simpleList);
                       }
                    }                 
                }

                if(counter == preguntas.length-1){
                    f.remove(preg);
                    f.remove(botonVerdad);
                    f.remove(botonFalso);
                    simpleList.isListEmpty(simpleList,f);                                     
                    f.revalidate();
                    f.repaint();

                }

                else if(counter<preguntas.length-1){                   
                    counter++;
                    System.out.println("counter false-> " + counter);                   
                    preg.setText(preguntas[counter][0]);     

                }

            }
        }
    }   
}
