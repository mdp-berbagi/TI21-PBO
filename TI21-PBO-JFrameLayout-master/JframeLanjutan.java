/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframelanjutan;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lab-207
 */
public class JframeLanjutan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame window = new JFrame();
        
        window.setSize(250, 170);
        window.setTitle("Form login");
        
        
// =============== GRID BACK LAYOUT
        
        window.setLayout(new GridBagLayout());
        GridBagConstraints Grid = new GridBagConstraints();
        Grid.fill = Grid.HORIZONTAL;
        
        Grid.gridx = 0;
        Grid.gridy = 0;
        window.add(new JButton("1"), Grid);
        
        Grid.gridx = 1;
        Grid.gridy = 0;
        window.add(new JButton("2"), Grid);
        
        Grid.gridx = 0;
        Grid.gridy = 1;
        Grid.gridwidth = 2;
        window.add(new JButton("3"), Grid);
        
// =============== GRID BACK LAYOUT END
        
        
// =============== GRID LAYOUT
        
//        window.setLayout(new GridLayout(2, 1));
//        
//        JPanel header = new JPanel();
//        header.setLayout(new BorderLayout());
//        header.setBackground(java.awt.Color.YELLOW);
//        header.add(new JLabel("North"), BorderLayout.NORTH);
//        header.add(new JLabel("East"), BorderLayout.EAST);
//        header.add(new JLabel("South"), BorderLayout.SOUTH);
//        header.add(new JLabel("West"), BorderLayout.WEST);
//        header.add(new JLabel("Center"), BorderLayout.CENTER);
        
//        JPanel footer = new JPanel();
//        footer.setLayout(new GridLayout(1, 2));
//        footer.setBackground(java.awt.Color.red);
//        footer.add(new JLabel("Kolom 1"));
//        footer.add(new JLabel("Kolom 2"));
        
//        window.add(header);
//        window.add(footer);
        
// =============== GRID LAYOUT END
        
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }
    
}
