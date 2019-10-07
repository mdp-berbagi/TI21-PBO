/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 202-Master
 */
public class home {
    public static void main(String[] x){
        JFrame win = new JFrame("Belajar JTable");
        win.setLayout(new GridLayout(5,1));
        win.setSize(500, 500);
        
        JPanel idFieldPanel = new JPanel();
        idFieldPanel.setLayout(new GridLayout(1,2));
        
        idFieldPanel.add(new JLabel("ID"));
        
        JTextField idField = new JTextField();
        idFieldPanel.add(idField);
        
        win.add(idFieldPanel);
        
        
        
        JPanel nameFieldPanel = new JPanel();
        nameFieldPanel.setLayout(new GridLayout(1,2));
        
        nameFieldPanel.add(new JLabel("Nama"));
        
        JTextField namaField = new JTextField();
        nameFieldPanel.add(namaField);
        
        win.add(nameFieldPanel);
        
        
        JPanel markFieldPanel = new JPanel();
        markFieldPanel.setLayout(new GridLayout(1,2));
        
        markFieldPanel.add(new JLabel("Merk"));
        
        JTextField merkField = new JTextField();
        markFieldPanel.add(merkField);
        
        win.add(markFieldPanel);
        
        
        
        
        JPanel btnFieldPanel = new JPanel();
        btnFieldPanel.setLayout(new GridLayout(1,1));
        
        JButton btnField = new JButton("Simpen");
        btnFieldPanel.add(btnField);
        
        win.add(btnFieldPanel);
        
        
        
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1,1));
        
        DefaultTableModel schema = new DefaultTableModel();
        schema.addColumn("ID");
        schema.addColumn("Nama");
        schema.addColumn("Merk");
        
        JTable table = new JTable();
        table.setModel(schema);
        
        win.add(table);
        
        
        
        btnField.addActionListener((ActionEvent e) -> {
            schema.addRow(new Object[]{
                idField.getText(),
                namaField.getText(),
                merkField.getText()
            });
        }) ;
        
        win.add(new JScrollPane(table), BorderLayout.CENTER);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
