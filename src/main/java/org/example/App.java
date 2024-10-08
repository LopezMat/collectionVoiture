package org.example;

import org.example.model.Voiture;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    JFrame frame = new JFrame("Voitures 3000");
    JPanel panel;
    JButton ajouter;
    JTable table;
    JScrollPane scrollPane;

    List<Voiture> voitures = new ArrayList<>();

    public static void main( String[] args )
    {

        new App().window();
    }

    private void window() {

    }
}
