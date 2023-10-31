package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej00 {

    public static void main(String[] args) {

            JFrame frame = new JFrame("Cambio de Color de Fondo");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel();
            frame.add(panel);

            JButton botonRojo = new JButton("Rojo");
            JButton botonAzul = new JButton("Azul");

            botonRojo.setBackground(Color.RED);
            botonAzul.setBackground(Color.BLUE);

        panel.add(botonRojo);
        panel.add(botonAzul);

            botonRojo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.RED);
                    botonAzul.setBackground(null);
                }
            });

            botonAzul.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.BLUE);
                    botonRojo.setBackground(null);
                }
            });

            frame.setVisible(true);
    }
}
