package vananhcute;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class JFrame_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_1 frame = new JFrame_1();
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
	public JFrame_1() {
		setTitle("C\u00F4ng ti b\u1EA3o hi\u1EC3m");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ch\u1ECDn lo\u1EA1i b\u1EA3o hi\u1EC3m :");
		lblNewLabel.setBounds(32, 326, 101, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD v\u00E0 t\u00EAn :");
		lblNewLabel_1.setBounds(32, 62, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tu\u1ED5i :");
		lblNewLabel_2.setBounds(32, 88, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0110\u1ECBa ch\u1EC9 :");
		lblNewLabel_3.setBounds(32, 146, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Thu nh\u1EADp hi\u1EC7n t\u1EA1i :");
		lblNewLabel_4.setBounds(32, 290, 108, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(95, 59, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 85, 56, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i :");
		lblNewLabel_5.setBounds(32, 245, 85, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gi\u1EDBi t\u00EDnh :");
		lblNewLabel_6.setBounds(32, 121, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setBounds(97, 113, 54, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("N\u1EEF");
		rdbtnNewRadioButton_1.setBounds(171, 113, 52, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 242, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "B\u1EA3o hi\u1EC3m nh\u00E0", "B\u1EA3o hi\u1EC3m \u00F4 t\u00F4", "B\u1EA3o hi\u1EC3m thu nh\u1EADp"}));
		comboBox.setToolTipText("");
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(143, 332, 154, 22);
		contentPane.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(142, 287, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Next ->");
		btnNewButton.setBounds(420, 373, 85, 23);
		contentPane.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(267, 348, 1, 1);
		contentPane.add(list);
		
		textField_4 = new JTextField();
		textField_4.setBounds(98, 146, 156, 70);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
	}
}
