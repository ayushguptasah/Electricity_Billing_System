package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

	String atype, meter;

	Project(String atype, String meter) {
		this.atype = atype;
		this.meter = meter;
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.png"));
		Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);

		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);

//		Master menu bar
		JMenu master = new JMenu("Master");
		master.setForeground(Color.BLUE);

//		New Customer menu item in Master Bar
		JMenuItem newcustomer = new JMenuItem("New Customer");
		newcustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
		newcustomer.setBackground(Color.WHITE);
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
		Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		newcustomer.setIcon(new ImageIcon(image1));
		newcustomer.setMnemonic('D');
		newcustomer.addActionListener(this);
		newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		master.add(newcustomer);

//		Customer Details menu item in Master Bar
		JMenuItem customerdetails = new JMenuItem("Customer Details");
		customerdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
		customerdetails.setBackground(Color.WHITE);
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
		Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		customerdetails.setIcon(new ImageIcon(image2));
		customerdetails.setMnemonic('M');
		customerdetails.addActionListener(this);
		customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		master.add(customerdetails);

//		Deposit Details menu item in Master Bar
		JMenuItem depositdetails = new JMenuItem("Deposit Details");
		depositdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
		depositdetails.setBackground(Color.WHITE);
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
		Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		depositdetails.setIcon(new ImageIcon(image3));
		depositdetails.setMnemonic('N');
		depositdetails.addActionListener(this);
		depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		master.add(depositdetails);

//		Calculate Bill menu item in Master Bar
		JMenuItem calculatebill = new JMenuItem("Calculate Bill");
		calculatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
		calculatebill.setBackground(Color.WHITE);
		ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
		Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		calculatebill.setIcon(new ImageIcon(image4));
		calculatebill.setMnemonic('B');
		calculatebill.addActionListener(this);
		calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
		master.add(calculatebill);

//		Information menu bar
		JMenu info = new JMenu("Information");
		info.setForeground(Color.RED);

//		Update Information menu item in Information Bar
		JMenuItem updateinfo = new JMenuItem("Update Information");
		updateinfo.setFont(new Font("monospaced", Font.PLAIN, 12));
		updateinfo.setBackground(Color.WHITE);
		ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
		Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		updateinfo.setIcon(new ImageIcon(image5));
		updateinfo.setMnemonic('U');
		updateinfo.addActionListener(this);
		updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
		info.add(updateinfo);

//		View Information menu item in Information Bar
		JMenuItem viewinfo = new JMenuItem("View Information");
		viewinfo.setFont(new Font("monospaced", Font.PLAIN, 12));
		viewinfo.setBackground(Color.WHITE);
		ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
		Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		viewinfo.setIcon(new ImageIcon(image6));
		viewinfo.setMnemonic('W');
		viewinfo.addActionListener(this);
		viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		info.add(viewinfo);

//		User menu bar
		JMenu user = new JMenu("User");
		user.setForeground(Color.BLUE);

//		Pay Bill menu item in User Bar
		JMenuItem paybill = new JMenuItem("Pay Bill");
		paybill.setFont(new Font("monospaced", Font.PLAIN, 12));
		paybill.setBackground(Color.WHITE);
		ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
		Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		paybill.setIcon(new ImageIcon(image7));
		paybill.setMnemonic('P');
		paybill.addActionListener(this);
		paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		user.add(paybill);

//		Bill Details menu item in User Bar
		JMenuItem billdetails = new JMenuItem("Bill Details");
		billdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
		billdetails.setBackground(Color.WHITE);
		ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
		Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		billdetails.setIcon(new ImageIcon(image8));
		billdetails.setMnemonic('G');
		billdetails.addActionListener(this);
		billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		user.add(billdetails);

//		Report menu bar
		JMenu report = new JMenu("Report");
		report.setForeground(Color.RED);

//		Generate Bill menu item in Report Bar
		JMenuItem generatebill = new JMenuItem("Generate Bill");
		generatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
		generatebill.setBackground(Color.WHITE);
		ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
		Image image9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		generatebill.setIcon(new ImageIcon(image9));
		generatebill.setMnemonic('G');
		generatebill.addActionListener(this);
		generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		report.add(generatebill);

//		Utility menu bar
		JMenu utility = new JMenu("Utility");
		utility.setForeground(Color.BLUE);

//		Note Pad menu item in Utility Bar
		JMenuItem notepad = new JMenuItem("Note Pad");
		notepad.setFont(new Font("monospaced", Font.PLAIN, 12));
		notepad.setBackground(Color.WHITE);
		ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
		Image image10 = icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		notepad.setIcon(new ImageIcon(image10));
		notepad.setMnemonic('N');
		notepad.addActionListener(this);
		notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		utility.add(notepad);

//		Calculator menu item in Utility Bar
		JMenuItem calculator = new JMenuItem("Calculator");
		calculator.setFont(new Font("monospaced", Font.PLAIN, 12));
		calculator.setBackground(Color.WHITE);
		ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
		Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		calculator.setIcon(new ImageIcon(image11));
		calculator.setMnemonic('C');
		calculator.addActionListener(this);
		calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		utility.add(calculator);

//		Exit menu bar
		JMenu mexit = new JMenu("Exit");
		mexit.setForeground(Color.RED);

//		Note Pad menu item in Exit Bar
		JMenuItem exit = new JMenuItem("Exit");
		exit.setFont(new Font("monospaced", Font.PLAIN, 12));
		exit.setBackground(Color.WHITE);
		ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
		Image image12 = icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		exit.setIcon(new ImageIcon(image12));
		exit.setMnemonic('X');
		exit.addActionListener(this);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		mexit.add(exit);

		if (atype.equals("Admin")) {
			mb.add(master);
		} else {
			mb.add(info);
			mb.add(user);
			mb.add(report);
		}

		mb.add(utility);
		mb.add(mexit);

		setLayout(new FlowLayout());

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String msg = ae.getActionCommand();
		if (msg.equals("New Customer")) {
			new NewCustomer();
		} else if (msg.equals("Customer Details")) {
			new CustomerDetails();
		} else if (msg.equals("Deposit Details")) {
			new DepositDetails();
		} else if (msg.equals("Calculate Bill")) {
			new CalculateBill();
		} else if (msg.equals("View Information")) {
			new ViewInformation(meter);
		} else if (msg.equals("Update Information")) {
			new UpdateInformation(meter);
		} else if (msg.equals("Bill Details")) {
			new BillDetails(meter);
		} else if (msg.equals("Note Pad")) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (msg.equals("Calculator")) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (msg.equals("Exit")) {
			setVisible(false);
			new Login();
		}else if (msg.equals("Pay Bill")) {
			new PayBill(meter);
		}else if (msg.equals("Generate Bill")) {
			new GenerateBill(meter);
		}
	}

	public static void main(String[] args) {
		new Project("", "");
	}

}
