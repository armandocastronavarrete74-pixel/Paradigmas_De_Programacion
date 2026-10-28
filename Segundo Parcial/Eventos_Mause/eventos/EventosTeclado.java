package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventosTeclado extends JFrame {

    public EventosTeclado() {

        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25, 10, 350, 30);

        JLabel lblInstruccion = new JLabel("Ingresa tu nombre:");
        lblInstruccion.setBounds(25, 165, 200, 30);

        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);

        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);

        // Generar el listener para detectar eventos del teclado
        KeyListener keyL = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent event) {
                System.out.println("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent event) {
                System.out.println("keyPressed");

                // Detectar cuál tecla se ha presionado
                // Consultar la documentación de la clase KeyEvent

                // Detectar combinaciones y teclas específicas
                if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Has presionado enter");
                }

                if (event.getKeyCode() == KeyEvent.VK_F1) {
                    System.out.println("Has presionado la tecla F1");
                }

                // Detectar una tecla de carácter
                if (event.getKeyCode() == KeyEvent.VK_A) {
                    System.out.println("Has presionado la tecla A");
                }
            }

            @Override
            public void keyReleased(KeyEvent event) {
                System.out.println("keyReleased");
            }
        };

        // Agregar el listener al campo de texto
        campoSaludo.addKeyListener(keyL);

        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        EventosTeclado objEventosTeclado = new EventosTeclado();
    }
}

