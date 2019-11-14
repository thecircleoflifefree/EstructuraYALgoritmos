
package menuprincipal;
    
import java.awt.*; 
import java.awt.event.*; 
import java.util.Random;
import javax.swing.*;

public class Negocio {
    
    Nodo Lista = new Nodo() ;
    
    Negocio(){
        
        Lista = null;
    }
    
 
    public void insertar(String jugadores){
        Nodo nuevo = new Nodo();
        nuevo.dato = jugadores;
        nuevo.siguiente = null;
        if (Lista == null)
            Lista = nuevo;
        else {
            Nodo aux = Lista;
            int i;
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = nuevo;
        }
    }
        

    
     public void imprimir (){
        JTextArea area = new JTextArea();
        area.setEditable(false);
        
        String hilera = "";
        Nodo aux = Lista;
        if (Lista != null){
        while (aux != null)
            if (aux != null){
                hilera += (aux.dato + "\n");
                aux = aux.siguiente;
            }
            area.setText(hilera);
            JOptionPane.showMessageDialog(null, area, "Lista de ganadores", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null, "El juego aún no cuenta con ganadores", "Lista de ganadores", JOptionPane.INFORMATION_MESSAGE);
     }
     public void seleccionar(){
    String listapreguntas [][]= new String[4][2];
    listapreguntas[0][0] = "En que año se independizó Costa Rica \n1: Tiene 1821\n2: Tiene 1521\n3: Tiene 1831"; 
    listapreguntas[0][1] = "1";
    listapreguntas[1][0] = "Donde queda la UIA \n1: Cartago\n2: Limón\n3: San José"; 
    listapreguntas[1][1] = "3";
    listapreguntas[2][0] = "Que año estamos \n1: 2021\n2: 2019\n3: 2018"; 
    listapreguntas[2][1] = "2";
    listapreguntas[3][0] = "Nombre del profesor \n1: Daniel\n2: Carlos\n3: Jose"; 
    listapreguntas[3][1] = "1"; 
    String jugadores []= new String[2];
    int totales []= new int[2];
    int choice; 
    Random random = new Random();
    String selection;
    String jugador;
        for (int j = 0;j < 2; j++){
        jugadores[j] = JOptionPane.showInputDialog(null,"Ingrese el nombre del jugador ","Jugadores", JOptionPane.INFORMATION_MESSAGE  );
        if (jugadores [j] == null){
         break;
        }
        JOptionPane.showMessageDialog(null, "Es el turno del jugador: "+jugadores[j],"Aviso", JOptionPane.INFORMATION_MESSAGE);
        if (jugadores [j] == jugadores [0]){
        int correctas = 0;
        int incorrectas = 0;
        for (int i=0; i < 3; i++) {
        choice = random.nextInt(4);
        selection = JOptionPane.showInputDialog(null, listapreguntas[choice][0],"Preguntas", JOptionPane.INFORMATION_MESSAGE );
        if (selection == null){
         break;
        }
        if (selection.equals(listapreguntas[choice][1])){ 
             JOptionPane.showMessageDialog(null, "Correcto has acertado","Atención", JOptionPane.INFORMATION_MESSAGE );
             correctas += 1;
        }
         else {
             JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Atención", JOptionPane.INFORMATION_MESSAGE );
             incorrectas += 1;
         }
        }
        totales[j] = incorrectas ;
        JOptionPane.showMessageDialog(null, jugadores[j]+ " ha acertado " + correctas + " preguntas \n + 1 acierto por ganar dados","Resultado de respuestas", JOptionPane.INFORMATION_MESSAGE );
        }
        if (jugadores [j] == jugadores [1]){
        int correctas2 = 0;
        int incorrectas2 = 0;
        for (int i=0; i < 3; i++) {
        choice = random.nextInt(4);
        selection = JOptionPane.showInputDialog(null, listapreguntas[choice][0],"Preguntas", JOptionPane.INFORMATION_MESSAGE );
        if (selection == null){
         break;
        }
        if (selection.equals(listapreguntas[choice][1])){ 
             JOptionPane.showMessageDialog(null, "Correcto has acertado","Atención", JOptionPane.INFORMATION_MESSAGE );
             correctas2 += 1;
        }
         else {
             JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Atención", JOptionPane.INFORMATION_MESSAGE );
             incorrectas2 += 1;
         }
    
        }
        incorrectas2 +=1; 
        totales[j] = incorrectas2 ;
        JOptionPane.showMessageDialog(null, jugadores[j]+ " ha acertado " + correctas2 + " preguntas","Resultado de respuestas", JOptionPane.INFORMATION_MESSAGE  );        
        }
    }
        if (totales [0] == totales [1]){
            JOptionPane.showMessageDialog(null, "El juego ha quedado empatado ", "Resultado final", JOptionPane.INFORMATION_MESSAGE  );
        }
        else{
        if (totales [0] > totales [1]){
            JOptionPane.showMessageDialog(null, "Ha ganado: " + jugadores [1], "Resultado final", JOptionPane.INFORMATION_MESSAGE   );
            insertar(jugadores [1]);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ha ganado: " + jugadores [0],  "Resultado final", JOptionPane.INFORMATION_MESSAGE   );
            insertar(jugadores [0]);
        }
        }
    
    }
                
}
