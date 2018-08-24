package StrategyPattern;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaleTools_Up {

	private JFrame frame;
	private JTextField priceCtl;
	private JTextField countCtl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleTools_Up window = new SaleTools_Up();
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
	public SaleTools_Up() {
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
		
		priceCtl = new JTextField();
		priceCtl.setBounds(116, 10, 105, 30);
		frame.getContentPane().add(priceCtl);
		priceCtl.setColumns(10);
		
		countCtl = new JTextField();
		countCtl.setColumns(10);
		countCtl.setBounds(116, 50, 105, 30);
		frame.getContentPane().add(countCtl);
		
		JLabel lblNewLabel = new JLabel("\u5355\u4EF7\uFF1A");
		lblNewLabel.setBounds(52, 17, 54, 15);
		frame.getContentPane().add(lblNewLabel);
			
		JLabel lblNewLabel_1 = new JLabel("\u6570\u91CF\uFF1A");
		lblNewLabel_1.setBounds(52, 57, 54, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox modeCtl = new JComboBox();
		modeCtl.setModel(new DefaultComboBoxModel(new String[] {"\u6253\u6298", "\u6EE1\u51CF", "\u6B63\u5E38"}));
		modeCtl.setToolTipText("");
		modeCtl.setBounds(116, 97, 105, 23);
		frame.getContentPane().add(modeCtl);
		
		JLabel totalPriceCrl = new JLabel("0.00");
		totalPriceCrl.setHorizontalAlignment(SwingConstants.CENTER);
		totalPriceCrl.setLabelFor(frame);
		totalPriceCrl.setFont(new Font("宋体", Font.PLAIN, 26));
		totalPriceCrl.setBounds(116, 143, 167, 77);
		frame.getContentPane().add(totalPriceCrl);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		// 点击确认按钮
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 获取单价、数量、计算方式
				double price = Double.parseDouble(priceCtl.getText());
				double count = Double.parseDouble(countCtl.getText());
				String mode = String.valueOf(modeCtl.getSelectedItem());
				// 计算金额
				double totalPrice = price * count;
				// 处理后的金额 
				CashContext cashContext = new CashContext();
				cashContext.createCashMode(mode);
				double finalPrice = cashContext.getResult(totalPrice);
				String priceShow = String.valueOf(finalPrice);
				// 显示到JLable上
				totalPriceCrl.setText(priceShow);
			}
		});
		btnNewButton.setBounds(265, 13, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.setBounds(265, 53, 93, 23);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel_2 = new JLabel("\u603B\u4EF7\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(52, 144, 80, 77);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("\u8BA1\u7B97\u65B9\u5F0F\uFF1A");
		label.setBounds(52, 101, 60, 15);
		frame.getContentPane().add(label);
		
		
	}
}
