/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Produk;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Abdul Aziz Al Basyir
 */
public class Home {    
    public static void main(String[] args){
        System.out.println("Program is run");
        
        Produk produk = new Produk();
        
        produk.add("1", "kulkas", "20");
        produk.add("2", "laptop", "100");
           
        DefaultTableModel table = new DefaultTableModel();
        
        for(int x = 0; x < produk.colmns.length; x++){
            table.addColumn(produk.colmns[x]);
        }
        
        produk.fetch((data) -> {
            table.addRow(data);
        });
        
        
        JTable schema = new JTable();
        schema.setModel(table);
        
        JFrame window = new JFrame();
        
        window.add(schema);
        
        window.add(new JScrollPane(schema), BorderLayout.CENTER);
        window.setTitle("Daftar Produk");
        window.setSize(500, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
