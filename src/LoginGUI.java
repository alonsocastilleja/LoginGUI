import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class LoginGUI implements ActionListener {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();	// new instance of a JFrame, which creates the window of the application.
		JPanel panel = new JPanel();	// new instance of a JPanel, which is a container inside the JFrame window.
			
		frame.setSize(400, 400);		// width, height of the window.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Sets the function of the 'X' to close the application.
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel label = new JLabel("Username:");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		JPasswordField passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		JButton button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new LoginGUI());
		panel.add(button);
		
		JLabel success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		frame.setVisible(true);		// Makes the frame container appear on the screen when set to 'true'.
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button has been clicked");
		
	}

}
