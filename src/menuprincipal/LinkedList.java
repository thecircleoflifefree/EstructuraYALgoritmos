package menuprincipal;

import javax.swing.*;

  public class LinkedList extends JFrame{

    Node head= null; // head of list
    int length = 0;

    public class Node {

        String data;
        Node next;

        // Constructor
        Node(String s)
        {
            data = s;
            next = null;
        }
    }
    
    public void isListEmpty(LinkedList list, JFrame frame){
    
        if (list.head != null){
            JLabel allCorrect = new JLabel("The following questions are incorrect:");
            frame.add(allCorrect);
            printList(list, frame);
        }
        else{ 
            JLabel allCorrect = new JLabel("All answers given were correct!");
            frame.add(allCorrect);
        }
    }
    
    // Method to insert a new node
    public LinkedList addNode(LinkedList list, String data){

        // Create node
        Node new_node = new Node(data);
        new_node.next = null;

        // head becomes node if list is emty
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // traverse and insert at end of list
            Node current_node = list.head;
            while (current_node.next != null) {
                current_node = current_node.next;
            }

            // Insert the new_node at last node
            current_node.next = new_node;
        }

        length++;
        return list;
    }

    // Print method
    public static void printList(LinkedList list, JFrame frame) {

        Node currNode = list.head;
        JPanel panelPreguntas = new JPanel();

        while (currNode != null) {
        
            JLabel preguntaMala = new JLabel(currNode.data);
            panelPreguntas.add(preguntaMala);
            currNode = currNode.next;
        }
        frame.add(panelPreguntas);
    }
}