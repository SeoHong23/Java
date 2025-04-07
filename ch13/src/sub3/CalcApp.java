package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(22, 79, 58, 58);
		btnNewButton.setBackground(new Color(240, 240, 240));
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setFont(new Font("한컴 고딕", Font.PLAIN, 30));
		textField.setEditable(false);
		textField.setBounds(22, 11, 268, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setBounds(92, 79, 58, 58);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2.setBounds(162, 79, 58, 58);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3.setBounds(232, 79, 58, 58);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_4.setBounds(22, 150, 58, 58);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1.setBounds(92, 150, 58, 58);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2_1.setBounds(162, 150, 58, 58);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("x");
		btnNewButton_3_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3_1.setBounds(232, 150, 58, 58);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_5.setBounds(22, 218, 58, 58);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_2.setBounds(92, 218, 58, 58);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2_2.setBounds(162, 218, 58, 58);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("-");
		btnNewButton_3_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3_2.setBounds(232, 218, 58, 58);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnC = new JButton("c");
		btnC.setBackground(UIManager.getColor("Button.background"));
		btnC.setBounds(22, 279, 58, 58);
		contentPane.add(btnC);
		
		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_3.setBounds(92, 279, 58, 58);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("=");
		btnNewButton_2_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2_3.setBounds(162, 279, 58, 58);
		contentPane.add(btnNewButton_2_3);
		
		JButton plus = new JButton("+");
		plus.setBackground(UIManager.getColor("Button.background"));
		plus.setBounds(232, 279, 58, 58);
		contentPane.add(plus);
	}
}
