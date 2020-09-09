// Project utilizes the following components from the Java Swing GUI library.
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class LoginGUI implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel failure;
	
	public static void main(String[] args) {
		
		// new instance of a JFrame, which creates the window of the application.
		JFrame frame = new JFrame();
		
		// new instance of a JPanel, which is a container inside the JFrame window.
		JPanel panel = new JPanel();	
			
		// Adds the container with adjusted sizing to the window of the application.
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);	
		
		// Neglects any formal layout of the container, thus enabling custom sizing.
		panel.setLayout(null);
		
		// Adds the user name label to the container, with adjusted sizing.
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(10, 20, 80, 25);                                
		panel.add(userLabel);
		
		// Adds the text field next to the user name label, with adjusted sizing.
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// Adds the password label to the container, with adjusted sizing.
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		// Adds the password text field next to the password label, with the adjusted sizing.
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		// Adds a Login button to the container, with an event listener and adjusted sizing.
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new LoginGUI());
		panel.add(button);
		
		// Adds a Success message if you entered the correct login information.
		success = new JLabel("");
		success.setBounds(10, 110, 400, 25);
		panel.add(success);
		
		// Adds a Failure message if you entered the incorrect login information.
		failure = new JLabel("");
		failure.setBounds(10, 110, 400, 25);
		failure.setBackground(Color.red);
		panel.add(failure);
		
		// Makes the frame container appear on the screen when set to 'true'.
		frame.setVisible(true);		
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if (user.equals("Alonso") && password.equals("Ilovepizza")) {
			success.setText("Login successful");
		}
		else {
			failure.setText("The Username or Password does not match our records.");
		}
	}

}
