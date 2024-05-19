package part3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUICalculator {

	private JFrame frame;
	private JTextField tfInfix;
	private JLabel lblMsg;
	private Conversion1 conversion;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICalculator window = new GUICalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUICalculator() {
		conversion = new Conversion1();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Infix");
		lblNewLabel.setBounds(50, 50, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		tfInfix = new JTextField();
		tfInfix.setBounds(200, 45, 130, 26);
		frame.getContentPane().add(tfInfix);
		tfInfix.setColumns(10);
		
		JButton btnInfixToPostfix = new JButton("Infix to Postfix");
		btnInfixToPostfix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//get infix
				String infix = tfInfix.getText();
				
				//convert infix to postfix
				String postfix = conversion.infixToPostfix(infix);
				
				//show postfix to label
				lblMsg.setText(postfix);
				
				
			}
		});
		btnInfixToPostfix.setBounds(50, 100, 151, 29);
		frame.getContentPane().add(btnInfixToPostfix);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get infix
				String infix = tfInfix.getText();
				//convert to postfix
				String postfix = conversion.infixToPostfix(infix);
				//evaluate postfix
				double result = conversion.evaluate(postfix);
				//show result to label
				lblMsg.setText(String.valueOf(result));
			}
		});
		btnCalculate.setBounds(213, 100, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
		lblMsg = new JLabel("");
		lblMsg.setBounds(50, 150, 280, 80);
		frame.getContentPane().add(lblMsg);
	}
}
