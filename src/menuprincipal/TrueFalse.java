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


    String [][] preguntas = {{"Pregunta 1? ","true"},{"Pregunta 2? ","false"},{"Pregunta 3? ","true"},{"Pregunta 4? ","false"},{"Pregunta 5? ","true"},{"Pregunta 6? ","false"}};

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
