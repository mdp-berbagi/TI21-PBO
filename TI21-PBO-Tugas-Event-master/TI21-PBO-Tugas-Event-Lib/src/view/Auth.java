package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Abdul Aziz Al Basyir
 */
public class Auth extends JFrame implements ActionListener{
    
    private final JTextField fieldUser = new JTextField("");
    private final JPasswordField fieldPass = new JPasswordField();
    public String session;
    
    /**
     * This function is sync, this will exit after user
     * cancel login / login success
     * @throws java.lang.InterruptedException
     */
    public synchronized void login() throws InterruptedException {
        
        Dimension textFieldDim = new Dimension(200, 25);
        
        JPanel div = new JPanel();
        GridBagConstraints Grid = new GridBagConstraints();
        Grid.fill=GridBagConstraints.HORIZONTAL;
        Grid.insets = new Insets(10,10,10,10);
        div.setBackground(Color.red);
        div.setLayout(new GridBagLayout());
        div.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        // Add Components
        
        
        Grid.gridx=0;   
        Grid.gridy=0; 
        JLabel labelUser = new JLabel("Username");
        div.add(labelUser, Grid);
        
        
        Grid.gridx=1;   
        Grid.gridy=0; 
        fieldUser.setPreferredSize(new Dimension(200, 25));
        div.add(fieldUser, Grid);
        
        Grid.gridx=0;   
        Grid.gridy=1;
        JLabel labelPass = new JLabel("Password");
        div.add(labelPass, Grid);
        
        Grid.gridx=1;   
        Grid.gridy=1;
        fieldPass.setPreferredSize(textFieldDim);
        div.add(fieldPass, Grid);
        
        Grid.gridx=1;   
        Grid.gridy=2;
        JButton btnLogin = new JButton("Login");
        div.add(btnLogin, Grid);
        btnLogin.addActionListener(this);
        
        
        add(div);
        
        
        // Window setting 
       
        setTitle("Frame login");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250); 
        setLocationRelativeTo(null);
        wait();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String model[] = {"mdp", "123"}; // example from models
        
        boolean check = 
                fieldUser.getText().equalsIgnoreCase(model[0]) && 
                new String(fieldPass.getPassword()).equals(model[1]);
        
        if(!check){
            JOptionPane
                .showMessageDialog(
                    null, 
                    "Username atau Password Anda Salah!", 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            return;
        }
        
        this.session = fieldUser.getText();
        System.out.println("This user login with "+this.session+" account.");
        dispose();
        
        // Break wait()
        synchronized(this){
            notify();
        }
    }
    
    
}
