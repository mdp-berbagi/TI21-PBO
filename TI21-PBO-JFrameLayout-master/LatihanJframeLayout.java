
package jframelanjutan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LatihanJframeLayout {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        JFrame win = new JFrame("Absensi Mahasiswa");
        win.setSize(1024, 768);
       
        
        win.setLayout(new GridBagLayout());
        GridBagConstraints Grid = new GridBagConstraints();
        Grid.fill = Grid.VERTICAL;
        
        JPanel header = new JPanel();
        header.setBackground(java.awt.Color.YELLOW);
        header.add(new JLabel("Header"));
        header.setPreferredSize(new Dimension(1024, 150));
        Grid.gridx = 0;
        Grid.gridy = 0;
        win.add(header, Grid);
        
        
        win.setVisible(true);
        win.setResizable(false);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
    }
}
