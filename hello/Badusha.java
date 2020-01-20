package hello;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Badusha {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Badusha window = new Badusha();
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
	public Badusha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(26, 21, 361, 47);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(194, 96, 48, 33);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(252, 96, 48, 33);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(310, 96, 50, 33);
		frame.getContentPane().add(b9);
		
		JButton button_9 = new JButton("/");
		button_9.setBounds(370, 96, 48, 33);
		frame.getContentPane().add(button_9);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(128, 96, 57, 23);
		frame.getContentPane().add(btnSin);
		
		JButton btnx = new JButton("1/X");
		btnx.setBounds(67, 96, 57, 23);
		frame.getContentPane().add(btnx);
		
		JButton button_8 = new JButton("sqrt");
		button_8.setBounds(0, 96, 57, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_2 = new JButton("%");
		button_2.setBounds(0, 142, 57, 23);
		frame.getContentPane().add(button_2);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(67, 142, 57, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setBounds(128, 142, 57, 23);
		frame.getContentPane().add(btnCos);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(194, 142, 48, 31);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(252, 142, 48, 31);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(310, 142, 48, 31);
		frame.getContentPane().add(b6);
		
		JButton button_15 = new JButton("*");
		button_15.setBounds(370, 142, 48, 31);
		frame.getContentPane().add(button_15);
		
		JButton btnXy = new JButton("x^y");
		btnXy.setBounds(0, 184, 57, 23);
		frame.getContentPane().add(btnXy);
		
		JButton btnLn = new JButton("ln");
		btnLn.setBounds(67, 184, 57, 23);
		frame.getContentPane().add(btnLn);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(128, 184, 57, 23);
		frame.getContentPane().add(btnTan);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf.setText(tf.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(194, 184, 48, 29);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(252, 184, 49, 29);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(310, 184, 48, 29);
		frame.getContentPane().add(b3);
		
		JButton button_21 = new JButton("-");
		button_21.setBounds(370, 186, 48, 27);
		frame.getContentPane().add(button_21);
		
		JButton btnX = new JButton("x^2");
		btnX.setBounds(0, 224, 57, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(67, 224, 57, 23);
		frame.getContentPane().add(btnN);
		
		JButton btnSec = new JButton("sec");
		btnSec.setBounds(128, 224, 57, 23);
		frame.getContentPane().add(btnSec);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b0.getText()));
			}
		});
		b0.setBounds(194, 224, 48, 27);
		frame.getContentPane().add(b0);
		
		JButton bp = new JButton(".");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(bp.getText()));
			}
		});
		bp.setBounds(252, 224, 48, 27);
		frame.getContentPane().add(bp);
		
		JButton be = new JButton("=");
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(be.getText()));
			}
		});
		be.setBounds(310, 224, 48, 27);
		frame.getContentPane().add(be);
		
		JButton button_27 = new JButton("+");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_27.setBounds(370, 220, 48, 31);
		frame.getContentPane().add(button_27);
		
		JLabel lblScientific = new JLabel("scientific");
		lblScientific.setBounds(10, 71, 63, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblNewLabel = new JLabel("Standard");
		lblNewLabel.setBounds(200, 71, 50, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
