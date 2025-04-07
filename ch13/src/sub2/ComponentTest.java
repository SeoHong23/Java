package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtplus;
	private JTextField txtplus1;
	private JTextField txtminus;
	private JTextField txtminus1;
	private JTextField txtmult;
	private JTextField txtmult1;
	private JTextField txtdiv;
	private JTextField txtdiv1;
	private JTextField txtplus2;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_8;
	private JTextField txtminus2;
	private JTextField txtmult2;
	private JTextField txtdiv2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(new ActionListener() { //이벤트 핸들러
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("확인1 버튼 클릭...");								
				
			}
		});
		btn1.setBounds(22, 66, 82, 23);
		contentPane.add(btn1);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(22, 39, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 14, 76, 15);
		contentPane.add(lblNewLabel);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(116, 66, 83, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭!");
				}else {
					System.out.println("NO 클릭!");
				}
			}
		});
		btn3.setBounds(211, 66, 96, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 111, 102, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(31, 136, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(72, 132, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(271, 136, 82, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		btnUid.setBounds(188, 132, 76, 23);
		contentPane.add(btnUid);
						
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(31, 167, 57, 15);
		contentPane.add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(72, 163, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(271, 167, 82, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = txtName.getText();
				lbResultName.setText("결과 : " + Name);
			}
		});
		btnName.setBounds(188, 163, 76, 23);
		contentPane.add(btnName);
		
		
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(31, 196, 57, 15);
		contentPane.add(lblNewLabel_2_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(72, 192, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(271, 196, 82, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Hp = txtHp.getText();
				lbResultHp.setText("결과 : " + Hp);			
			}
		});
		btnHp.setBounds(188, 192, 76, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("덧셈");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(22, 243, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtplus = new JTextField();
		txtplus.setHorizontalAlignment(SwingConstants.CENTER);
		txtplus.setColumns(10);
		txtplus.setBounds(72, 240, 52, 21);
		contentPane.add(txtplus);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("+");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(136, 243, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		txtplus1 = new JTextField();
		txtplus1.setHorizontalAlignment(SwingConstants.CENTER);
		txtplus1.setColumns(10);
		txtplus1.setBounds(188, 240, 52, 21);
		contentPane.add(txtplus1);
		
		JLabel lblPlus = new JLabel("=");
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setBounds(250, 243, 57, 15);
		contentPane.add(lblPlus);
		
		JButton btnplus = new JButton("확인");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtplus.getText()); 
				int num2 = Integer.parseInt(txtplus1.getText());
				int result = num1 + num2;
				String.valueOf(result);
				txtplus2.setText(""+result);			
			}
		});
		btnplus.setBounds(376, 239, 76, 23);
		contentPane.add(btnplus);
		
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("뺄셈");
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2.setBounds(22, 272, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		txtminus = new JTextField();
		txtminus.setHorizontalAlignment(SwingConstants.CENTER);
		txtminus.setColumns(10);
		txtminus.setBounds(72, 269, 52, 21);
		contentPane.add(txtminus);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("-");
		lblNewLabel_2_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_2.setBounds(136, 272, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_2);
		
		txtminus1 = new JTextField();
		txtminus1.setHorizontalAlignment(SwingConstants.CENTER);
		txtminus1.setColumns(10);
		txtminus1.setBounds(188, 269, 52, 21);
		contentPane.add(txtminus1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_1.setBounds(250, 272, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		
		txtminus2 = new JTextField();
		txtminus2.setHorizontalAlignment(SwingConstants.CENTER);
		txtminus2.setColumns(10);
		txtminus2.setBounds(300, 269, 64, 21);
		contentPane.add(txtminus2);
		
		JButton btnminus = new JButton("확인");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = Integer.parseInt(txtminus.getText()); 
				int num4 = Integer.parseInt(txtminus1.getText());
				int num5 = num3 - num4;
				String.valueOf(num5);
				txtminus2.setText(""+ num5);
			}
		});
		btnminus.setBounds(376, 268, 76, 23);
		contentPane.add(btnminus);
		
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("곱셈");
		lblNewLabel_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2_1.setBounds(22, 303, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_2_1);
		
		txtmult = new JTextField();
		txtmult.setHorizontalAlignment(SwingConstants.CENTER);
		txtmult.setColumns(10);
		txtmult.setBounds(72, 300, 52, 21);
		contentPane.add(txtmult);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1 = new JLabel("X");
		lblNewLabel_2_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_2_1.setBounds(136, 303, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_2_1);
		
		txtmult1 = new JTextField();
		txtmult1.setHorizontalAlignment(SwingConstants.CENTER);
		txtmult1.setColumns(10);
		txtmult1.setBounds(188, 300, 52, 21);
		contentPane.add(txtmult1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(250, 303, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JButton btnmult = new JButton("확인");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num6 = Integer.parseInt(txtmult.getText()); 
				int num7 = Integer.parseInt(txtmult1.getText());
				int num8 = num6 * num7;
				String.valueOf(num8);
				txtmult2.setText(""+ num8);
			}
		});
		btnmult.setBounds(376, 299, 76, 23);
		contentPane.add(btnmult);
		
		
		
		JLabel lblNewLabel_2_1_1_1_2_1_1 = new JLabel("나눗셈");
		lblNewLabel_2_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2_1_1.setBounds(22, 336, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_2_1_1);
		
		txtdiv = new JTextField();
		txtdiv.setHorizontalAlignment(SwingConstants.CENTER);
		txtdiv.setColumns(10);
		txtdiv.setBounds(72, 333, 52, 21);
		contentPane.add(txtdiv);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1 = new JLabel("/");
		lblNewLabel_2_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_2_1_1.setBounds(136, 336, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_2_1_1);
		
		txtdiv1 = new JTextField();
		txtdiv1.setHorizontalAlignment(SwingConstants.CENTER);
		txtdiv1.setColumns(10);
		txtdiv1.setBounds(188, 333, 52, 21);
		contentPane.add(txtdiv1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(250, 336, 57, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JButton btndiv = new JButton("확인");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num10 = Integer.parseInt(txtdiv.getText()); 
				int num11 = Integer.parseInt(txtdiv1.getText());
				int num12 = num10 / num11;
				String.valueOf(num12);
				txtdiv2.setText(""+ num12);
			}
		});
		btndiv.setBounds(376, 332, 76, 23);
		contentPane.add(btndiv);
		
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 386, 57, 23);
		contentPane.add(chk1);
		
		JLabel lblNewLabel_3 = new JLabel("체크박스 실습");
		lblNewLabel_3.setBounds(31, 361, 93, 15);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(72, 386, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(198, 386, 52, 23);
		contentPane.add(chk4);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(136, 386, 52, 23);
		contentPane.add(chk3);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(250, 386, 52, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 :");
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultCheck.setText("결과 : " + cities);
				
			}
		});
		btnCheck.setBounds(320, 386, 76, 23);
		contentPane.add(btnCheck);
		
	
		lbResultCheck.setBounds(22, 415, 285, 15);
		contentPane.add(lbResultCheck);
		
		txtplus2 = new JTextField();
		txtplus2.setHorizontalAlignment(SwingConstants.CENTER);
		txtplus2.setColumns(10);
		txtplus2.setBounds(300, 240, 64, 21);
		contentPane.add(txtplus2);
		
		JLabel lblNewLabel_4 = new JLabel("테이블 실습");
		lblNewLabel_4.setBounds(17, 440, 87, 15);
		contentPane.add(lblNewLabel_4);
		
		table_1 = new JTable();
		table_1.setBounds(32, 460, 344, 113);
		contentPane.add(table_1);
		
		// 테이블 설정
				String[] columnNames = {"아이디", "이름", "나이", "휴대폰"};
				
				DefaultTableModel model = new DefaultTableModel(columnNames, 0);
				model.setRowCount(0);
				table_1.setModel(model);
		
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101", "김유신", 23, "010-1234-1001"));
				persons.add(new Person("a102", "김춘추", 21, "010-1234-1002"));
				persons.add(new Person("a103", "장보고", 33, "010-1234-1003"));
				persons.add(new Person("a104", "강감찬", 43, "010-1234-1004"));
				persons.add(new Person("a105", "이순신", 53, "010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(17, 583, 97, 23);
		contentPane.add(btnTable);
		
		txtmult2 = new JTextField();
		txtmult2.setHorizontalAlignment(SwingConstants.CENTER);
		txtmult2.setColumns(10);
		txtmult2.setBounds(300, 300, 64, 21);
		contentPane.add(txtmult2);
		
		txtdiv2 = new JTextField();
		txtdiv2.setHorizontalAlignment(SwingConstants.CENTER);
		txtdiv2.setColumns(10);
		txtdiv2.setBounds(300, 333, 64, 21);
		contentPane.add(txtdiv2);										
	}
}
