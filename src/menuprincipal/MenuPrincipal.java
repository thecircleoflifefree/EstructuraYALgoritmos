package menuprincipal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class MenuPrincipal extends JFrame {
    public JPanel primerpanel;
    
    //Constructor
     
    public MenuPrincipal() {
        
        super("Aprendiendo Estudios Sociales");
        setSize(440,500);
        iniciarcomponentes();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        
    }
    
    private void iniciarcomponentes() {
        
        colocarPaneles();
        colocarLabels();
        colocarBotones();
    }
        
    private void colocarPaneles() {
        
        primerpanel= new JPanel();
        primerpanel.setBackground(Color.white);
        primerpanel.setLayout(null);
        this.getContentPane().add(primerpanel);
    }
    
    private void colocarLabels() {
        
        // Menu principal

        JLabel menuprincipalgif = new JLabel ();
        ImageIcon menuprincipal = new ImageIcon("menuprincipalgif.gif");
        menuprincipalgif.setIcon(new javax.swing.ImageIcon("menuprincipalgif.gif"));
        menuprincipalgif.setBounds(25 ,25,300,90);
        menuprincipalgif.setIcon(new ImageIcon(menuprincipal.getImage().getScaledInstance(menuprincipalgif.getWidth(), menuprincipalgif.getHeight(), Image.SCALE_DEFAULT)));
        primerpanel.add(menuprincipalgif);

        // Mundo girando

        JLabel mundogirandogif = new JLabel ();
        ImageIcon mundogirando = new ImageIcon("MundoGirandoGif.gif");
        mundogirandogif.setIcon(new javax.swing.ImageIcon("MundoGirandoGif.gif"));
        mundogirandogif.setBounds(325 ,10,110,100);
        mundogirandogif.setIcon(new ImageIcon(mundogirando.getImage().getScaledInstance(mundogirandogif.getWidth(), mundogirandogif.getHeight(), Image.SCALE_DEFAULT)));
        primerpanel.add(mundogirandogif);

        // Juego de dados

        JLabel Juegodedadosgif = new JLabel ();
        ImageIcon juegodados = new ImageIcon("DadogirandoGif.gif");
        Juegodedadosgif.setIcon(new javax.swing.ImageIcon("DadogirandoGif.gif"));
        Juegodedadosgif.setBounds(30 ,130,110,100);
        Juegodedadosgif.setIcon(new ImageIcon(juegodados.getImage().getScaledInstance(Juegodedadosgif.getWidth(), Juegodedadosgif.getHeight(), Image.SCALE_DEFAULT)));
        primerpanel.add(Juegodedadosgif);

        // Memoria

        JLabel JuegoMemoria = new JLabel ();
        ImageIcon  Memoria = new ImageIcon("cerebrogif.gif");
        JuegoMemoria.setIcon(new javax.swing.ImageIcon("cerebrogif.gif"));
        JuegoMemoria.setBounds(30 ,220,110,100);
        JuegoMemoria.setIcon(new ImageIcon(Memoria.getImage().getScaledInstance(JuegoMemoria.getWidth(), JuegoMemoria.getHeight(), Image.SCALE_DEFAULT)));
        primerpanel.add(JuegoMemoria);

        //imagen asocie

        JLabel JuegoAsocie = new JLabel ();
        ImageIcon Asocie = new ImageIcon("garfieldgif.gif");
        JuegoAsocie.setIcon(new javax.swing.ImageIcon("garfieldgif.gif"));
        JuegoAsocie.setBounds(40 ,310,110,100);
        JuegoAsocie.setIcon(new ImageIcon(Asocie.getImage().getScaledInstance(JuegoAsocie.getWidth(),JuegoAsocie.getHeight(), Image.SCALE_DEFAULT)));
        primerpanel.add(JuegoAsocie);

    }
    
    private void colocarBotones() {   
        
        // boton juego dados
            
        JButton btnjuegodados = new JButton();
        btnjuegodados.setBounds(150,150,207,50);
        btnjuegodados.setText("Dados");
        btnjuegodados.setEnabled(true);
        btnjuegodados.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        primerpanel.add(btnjuegodados);

        // boton juego memoria

        JButton btnMemoria = new JButton();
        btnMemoria.setBounds(150,245,207,50);
        btnMemoria.setText("Memoria");
        btnMemoria.setEnabled(true);
        btnMemoria.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        primerpanel.add(btnMemoria);

        // boton juego Verdadero/Falso

        JButton btnVF = new JButton();
        btnVF.setBounds(150,350,207,50);
        btnVF.setText("Verdad/Falso");

        btnVF.setEnabled(true);
        btnVF.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        primerpanel.add(btnVF);

        // boton creadores

        JButton btncreadores = new JButton();
        ImageIcon creadoresimagen = new ImageIcon("pregunta.png");
        btncreadores.setBounds(320,435,40,30);
        btncreadores.setIcon(new ImageIcon(creadoresimagen.getImage().getScaledInstance(btncreadores.getWidth(), btncreadores.getHeight(), Image.SCALE_SMOOTH)));
        btncreadores.setEnabled(true);
        btncreadores.setBorderPainted(false);
        primerpanel.add(btncreadores);

        // boton manual de usuario

        JButton btnManualUsuario = new JButton();
        ImageIcon Manualusuarioimagen = new ImageIcon("manualusuario.png");
        btnManualUsuario.setBounds(375,435,40,30);
        btnManualUsuario.setIcon(new ImageIcon(Manualusuarioimagen.getImage().getScaledInstance(btnManualUsuario.getWidth(), btnManualUsuario.getHeight(), Image.SCALE_SMOOTH)));
        btnManualUsuario.setEnabled(true);
        primerpanel.add(btnManualUsuario);
        btnManualUsuario.setBorderPainted(false);
        

        //acciones de botones de Creadores y Manual de Usuario
        
        btnManualUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JFrame FrameManualUsuario = new JFrame("Manual de Usuario");
            FrameManualUsuario.setVisible(true);
            FrameManualUsuario.setSize(500,500);
            FrameManualUsuario.setLocationRelativeTo(null);
            FrameManualUsuario.setResizable(false); 

            //creacion del panel
            
            JPanel MUpanel= new JPanel();
            MUpanel.setBackground(Color.lightGray);
            MUpanel.setLayout(null);
            FrameManualUsuario.getContentPane().add(MUpanel);

            }

        });


        // Jframe del boton de creadores del proyecto
        btncreadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame FrameCreadores = new JFrame("Información");
                FrameCreadores.setVisible(true);
                FrameCreadores.setSize(317,210);
                FrameCreadores.setLocationRelativeTo(null);
                FrameCreadores.setResizable(false); 

                //creacion del panel
                JPanel creadorespanel= new JPanel();
                creadorespanel.setBackground(Color.lightGray);
                creadorespanel.setLayout(null);
                FrameCreadores.getContentPane().add(creadorespanel);

                //creacion del texto       
                JTextArea areatxtCreador = new JTextArea();
                areatxtCreador.setBounds(20,20,300, 200);
                areatxtCreador.setFont(new Font("Comic Sans MS",3, 20));
                areatxtCreador.setText("Este programa fue creado por:");
                areatxtCreador.append("\nAdrián Solís "+ "\nDavid Rojas "+"\nJoseph Valverde "+"\nMario Sandí "+"\nWesner Perla");
                areatxtCreador.setEditable(false);
                FrameCreadores.getContentPane().add(areatxtCreador);

            }
        });

        btnjuegodados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JuegoDdados juego = new JuegoDdados ();
            }
        });
        
          btnVF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrueFalse vf = new TrueFalse ();
            }
        });
    }

    // JFrame Juego
    public static void main(String[] args) {
        MenuPrincipal interfaz = new MenuPrincipal();

    }
}
        


