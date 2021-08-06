package chapters11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Insert extends JFrame {

	private JPanel contentPane;
	private JTextField scnameField;
	private JTextField yearField;
	private JTextField groupField;
	private JTextField numField;
	private JTextField stnameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert frame = new Insert();
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
	public Insert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scnameField = new JTextField();
		scnameField.setBounds(182, 56, 116, 21);
		contentPane.add(scnameField);
		scnameField.setColumns(10);
		
		yearField = new JTextField();
		yearField.setColumns(10);
		yearField.setBounds(182, 87, 116, 21);
		contentPane.add(yearField);
		
		groupField = new JTextField();
		groupField.setColumns(10);
		groupField.setBounds(182, 118, 116, 21);
		contentPane.add(groupField);
		
		numField = new JTextField();
		numField.setColumns(10);
		numField.setBounds(182, 149, 116, 21);
		contentPane.add(numField);
		
		stnameField = new JTextField();
		stnameField.setColumns(10);
		stnameField.setBounds(182, 180, 116, 21);
		contentPane.add(stnameField);
		
		JLabel lblNewLabel = new JLabel("\uD559\uAD50\uBA85");
		lblNewLabel.setBounds(116, 59, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD559\uB144");
		lblNewLabel_1.setBounds(116, 90, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBC18");
		lblNewLabel_2.setBounds(116, 121, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uBC88\uD638");
		lblNewLabel_3.setBounds(116, 152, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC774\uB984");
		lblNewLabel_4.setBounds(116, 183, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uD559\uC0DD \uC815\uBCF4");
		lblNewLabel_5.setBounds(182, 10, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBounds(171, 228, 97, 23);
		contentPane.add(btnNewButton);
	}
}
