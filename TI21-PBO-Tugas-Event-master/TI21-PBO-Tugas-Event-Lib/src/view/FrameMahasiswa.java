/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


/**
 *
 * @author Abdul Aziz Al Basyir
 * 
 * For access this class, your 
 */
public class FrameMahasiswa extends JFrame implements ActionListener{
    private String user;
    
    private JTextField fieldNama = new JTextField();
    private JComboBox fieldJurusan = new JComboBox();
    private JRadioButton radioPria = new JRadioButton("Pria");
    private JRadioButton radioWanita = new JRadioButton("Wanita");
    
    
    public FrameMahasiswa(String token){
        System.out.println("Access FrameMahasiswa with "+token+" account");
        this.user = token;
        
        // Panel setting
        JPanel div = new JPanel();
        GridBagConstraints Grid = new GridBagConstraints();
        Grid.fill=GridBagConstraints.HORIZONTAL;
        div.setLayout(new GridBagLayout());
        Grid.insets = new Insets(10,10,10,10);
        
        Grid.gridx=0;   
        Grid.gridy=0; 
        JLabel labelUser = new JLabel("Nama");
        div.add(labelUser, Grid);
        
        Grid.gridx=1;   
        Grid.gridy=0; 
        
        fieldNama.setPreferredSize(new Dimension(200, 25));
        div.add(fieldNama, Grid);
        
        Grid.gridx=0;   
        Grid.gridy=1; 
        JLabel labelJurusan = new JLabel("Jurusan");
        div.add(labelJurusan, Grid);
        
        Grid.gridx=1;   
        Grid.gridy=1; 
        fieldJurusan.setEditable(true);
        fieldJurusan.addItem("Teknik Informatika");
        fieldJurusan.addItem("Sistem Informasi");
        div.add(fieldJurusan, Grid);
        
        
        Grid.gridx=0;   
        Grid.gridy=2; 
        div.add(new JLabel("Gender"), Grid);
        
        JPanel divGender = new JPanel();
        ButtonGroup genderGroup = new ButtonGroup();    
        genderGroup.add(radioPria);
        genderGroup.add(radioWanita);
        
        divGender.add(radioPria);
        divGender.add(radioWanita);
        
        Grid.gridx=1;   
        Grid.gridy=2; 
        div.add(divGender, Grid);
        
        Grid.gridx=1;   
        Grid.gridy=3;
        JButton btnLogin = new JButton("Hi");
        div.add(btnLogin, Grid);
        btnLogin.addActionListener(this);
        
        
        add(div);
        // Window setting 
        setTitle("Frame Mahasiswa");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250); 
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String gender = 
                radioPria.isSelected() ? "Laki-laki" 
                :
                (radioWanita.isSelected() ? "Wanita" : "");
        
        String jurusan = (String) fieldJurusan.getSelectedItem();
        
        System.out.println(fieldJurusan.getSelectedItem());
        
        JOptionPane
                .showMessageDialog(
                    null, 
                    "Nama Anda "+fieldNama.getText()+", Jurusan "+(jurusan)+", dengan Gender "+gender, 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE
                );
    }
    
}
