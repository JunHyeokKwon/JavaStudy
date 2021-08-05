package chapters11;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Emp extends JFrame {

	private JPanel mainPanel;
	private JTextField idField;
	private JPasswordField pwdField;
	private JTextField joinIdField;
	private JPasswordField joinPwdField;
	private JPasswordField joinRePwdField;
	private JTextField joinNameField;
	private JTextField joinPhoneField;
	private boolean joinIdCheckFlag = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp frame = new Emp();
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
	public Emp() {
		ArrayList<UserBean> userList = new ArrayList<UserBean>();
		String id = "junil";
		String pwd = "1234";
		
		UserBean user1 = new UserBean();
		user1.setUser_id("junil");
		user1.setUser_name("1234");
		user1.setUser_name("김준일");
		user1.setUser_phone("010-9988-1916");
		
		
		userList.add(user1);
		
		CardLayout mainCard = new CardLayout();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(mainCard);
		
		JPanel mainView = new JPanel();
		mainPanel.add(mainView, "name_1578755357200"); // name_1578755357200은 키값
		mainView.setLayout(null);
		
		JLabel mainTitleLabel = new JLabel("\uC0AC\uC6D0\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		mainTitleLabel.setFont(new Font("굴림", Font.BOLD, 30));
		mainTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainTitleLabel.setBounds(250, 150, 500, 50);
		mainView.add(mainTitleLabel);
		
		JButton mainStartButton = new JButton("\uD504\uB85C\uADF8\uB7A8 \uC2DC\uC791");
		mainStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mainStartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_1616150673700");
			}
		});
		mainStartButton.setBounds(425, 300, 150, 50);
		mainView.add(mainStartButton);
		
		JPanel loginView = new JPanel();
		mainPanel.add(loginView, "name_1616150673700");
		loginView.setLayout(null);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setBounds(300, 220, 75, 15);
		loginView.add(idLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setBounds(300, 250, 75, 15);
		loginView.add(pwdLabel);
		
		idField = new JTextField();
		idField.setBounds(375, 220, 200, 20);
		loginView.add(idField);
		idField.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(375, 250, 200, 20);
		loginView.add(pwdField);
		
		JLabel loginTitle = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		loginTitle.setFont(new Font("굴림", Font.BOLD, 30));
		loginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		loginTitle.setBounds(250, 50, 500, 50);
		loginView.add(loginTitle);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String idText = idField.getText();
				String pwdText = pwdField.getText();
				
				for(UserBean userBean : userList) {
					if(userBean.getUser_id().equals(idText) && userBean.getUser_pwd().equals(pwdText)) {
						mainCard.show(mainPanel, "name_1617231951000");
						return;
					}
				}
				if(idText.equals(id) && pwdText.equals(pwd)) {
					mainCard.show(mainPanel, "name_1617231951000");
				} else {
					JOptionPane.showMessageDialog(null, "사용자 계정 정보가 잘못되었습니다.", "경고", JOptionPane.PLAIN_MESSAGE);
				}
				idField.setText("");
				pwdField.setText("");
			}
		});
		loginButton.setBounds(600, 220, 100, 50);
		loginView.add(loginButton);
		
		JButton joinButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_1625150611500");
			}
		});
		joinButton.setBounds(440, 300, 100, 25);
		loginView.add(joinButton);
		
		JPanel homeView = new JPanel();
		mainPanel.add(homeView, "name_1617231951000");
		homeView.setLayout(null);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "로그아웃 되었습니다. 메인화면으로 돌아갑니다.", "알림", JOptionPane.PLAIN_MESSAGE);
				mainCard.show(mainPanel, "name_1578755357200");
			}
		});
		logoutButton.setBounds(865, 420, 100, 25);
		homeView.add(logoutButton);
		
		JPanel joinView = new JPanel();
		mainPanel.add(joinView, "name_1625150611500");
		joinView.setLayout(null);
		
		JLabel joinTitle = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		joinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		joinTitle.setFont(new Font("굴림", Font.BOLD, 30));
		joinTitle.setBounds(250, 50, 500, 50);
		joinView.add(joinTitle);
		
		JLabel joinIdLabel = new JLabel("\uC544\uC774\uB514");
		joinIdLabel.setBounds(328, 112, 100, 30);
		joinView.add(joinIdLabel);
		
		joinIdField = new JTextField();
		joinIdField.setColumns(10);
		joinIdField.setBounds(412, 112, 100, 30);
		joinView.add(joinIdField);
		
		JLabel joinPwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		joinPwdLabel.setBounds(328, 150, 100, 30);
		joinView.add(joinPwdLabel);
		
		joinPwdField = new JPasswordField();
		joinPwdField.setBounds(412, 150, 200, 30);
		joinView.add(joinPwdField);
		
		JLabel joinRePwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		joinRePwdLabel.setBounds(328, 190, 100, 30);
		joinView.add(joinRePwdLabel);
		
		joinRePwdField = new JPasswordField();
		joinRePwdField.setBounds(412, 190, 200, 30);
		joinView.add(joinRePwdField);
		
		JLabel joinNameLabel = new JLabel("\uC774\uB984");
		joinNameLabel.setBounds(328, 230, 100, 30);
		joinView.add(joinNameLabel);
		
		joinNameField = new JTextField();
		joinNameField.setBounds(412, 230, 200, 30);
		joinView.add(joinNameField);
		
		JLabel joinPhoneLabel = new JLabel("\uC5F0\uB77D\uCC98");
		joinPhoneLabel.setBounds(328, 270, 100, 30);
		joinView.add(joinPhoneLabel);
		
		joinPhoneField = new JTextField();
		joinPhoneField.setBounds(412, 270, 200, 30);
		joinView.add(joinPhoneField);
		
		JButton idCheckButton = new JButton("\uC911\uBCF5\uD655\uC778");
		idCheckButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				if(joinIdText.length() != 0) {
					for(UserBean userBean : userList) {
						if(userBean.getUser_id().equals(joinIdText)) {
							JOptionPane.showMessageDialog(null, "중복된 아이디입니다.", "경고", JOptionPane.WARNING_MESSAGE);
							joinIdText = "";
							return;
						}
					}
					joinIdCheckFlag = true;
					JOptionPane.showMessageDialog(null, joinIdText + "는 사용 가능한 아이디입니다.", "확인", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "공백은 입력할 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		idCheckButton.setBounds(515, 111, 100, 30);
		joinView.add(idCheckButton);
		
		JButton idCheckButton_1 = new JButton("\uAC00\uC785\uD558\uAE30");
		idCheckButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				String joinPwdText = joinPwdField.getText();
				String joinRePwdText = joinRePwdField.getText();
				String joinNameText = joinNameField.getText();
				String joinPhoneText = joinPhoneField.getText();
				
				if(joinIdCheckFlag == false) {
					JOptionPane.showMessageDialog(null, "아이디 중복확인하여 주시기 바랍니다.", "경고", JOptionPane.WARNING_MESSAGE);
					
				}else if(joinPwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하여 주시기 바랍니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinRePwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호 확인을 입력하여 주시기 바랍니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinNameText.length() == 0) {
					JOptionPane.showMessageDialog(null, "이름을 입력하여 주시기 바랍니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPhoneText.length() == 0) {
					JOptionPane.showMessageDialog(null, "연락처를 입력하여 주시기 바랍니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(!joinPwdText.equals(joinRePwdText)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치 하지 않습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else {
					UserBean userBean = new UserBean();
					userBean.setUser_id(joinIdText);
					userBean.setUser_pwd(joinPwdText);
					userBean.setUser_name(joinNameText);
					userBean.setUser_phone(joinPhoneText);
					userList.add(userBean);
					joinIdField.setText("");
					joinPwdField.setText("");
					joinRePwdField.setText("");
					joinNameField.setText("");
					joinPhoneField.setText("");
					joinIdCheckFlag = false;
					JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
					mainCard.show(mainPanel, "name_1616150673700");
				}
			}
		});
		idCheckButton_1.setBounds(327, 320, 285, 30);
		joinView.add(idCheckButton_1);
	}
}
