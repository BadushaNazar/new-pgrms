package hello;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;

public class converter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter window = new converter();
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
	public converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C++");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox.setBounds(93, 51, 147, 56);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Java");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_1.setBounds(93, 111, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBounds(105, 200, 133, 48);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxNewCheckBox.addItemListener(new ItemListener(){
		
		
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel.setText("c++ "+(e.getStateChange()==1? "checked": "unchecked"));
			}
									
		});
		
		chckbxNewCheckBox_1 .addItemListener(new ItemListener(){
			
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel.setText("java "+(e.getStateChange()==1? "checked": "unchecked"));
			}
									
		});
		
	}
}
