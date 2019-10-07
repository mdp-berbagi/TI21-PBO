import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Home {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		window.setSize(260, 160);
		window.setTitle("Login");

		window.setLayout(null);
		
		JLabel login_text = new JLabel();
		login_text.setText("Username");
		login_text.setBounds(10, 10, 100, 20);
		
		JTextField username_field = new JTextField();
		username_field.setBounds(80, 10, 150, 20);
		
		JLabel pass_text = new JLabel();
		pass_text.setText("Password");
		pass_text.setBounds(10, 40, 100, 20);
		
		JPasswordField pass_field = new JPasswordField();
		pass_field.setBounds(80, 40, 150, 20);
		
		JButton login_btn = new JButton();
		login_btn.setText("Login");
		login_btn.setBounds(30, 80, 80, 20);
		
		JButton pass_btn = new JButton();
		pass_btn.setText("Daftar");
		pass_btn.setBounds(120, 80, 80, 20);
		
		window.add(login_text);
		window.add(username_field);
		window.add(pass_text);
		window.add(pass_field);
		window.add(login_btn);
		window.add(pass_btn);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(3);
		
		window.setLocation(300, 300);
	}
	
}
