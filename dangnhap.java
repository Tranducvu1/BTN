package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class dangnhap extends JFrame{
	JFrame f = new JFrame("Account");
	JLabel lbforgotpass = new JLabel("Account");
	JLabel lb1 = new JLabel();
	JLabel lbName = new JLabel("UserName");
	JTextField tfName = new JTextField(10);
	//Nhap username
	JLabel lbPass = new JLabel("Tai khoan");
	JTextField tfPass = new JTextField(10);
	JButton btforgot = new JButton("Forgot Pass");
	JButton btLogin = new JButton("Login Admin");
	JButton btLogin1 = new JButton("Login Customers");
	JButton btLogin2 = new JButton("Login inforhouse");
	JButton btnewcreate = new JButton("Login Newcreate");
	JButton btcan = new JButton("Cancel");
	public dangnhap() {
		f.setLocation(200,500);
		f.setLayout(new GridLayout(4,2));
		Container cont =  f.getContentPane();
		f.setLocation(250,250);
		f.setLayout(new GridLayout(6,2));
		Container con = f.getContentPane();
		con.add(lbforgotpass);
		con.add(lb1);
		con.add(lbName);
		con.add(tfName);
		con.add(lbPass);
		con.add(tfPass);
		
		con.add(btcan);
		//b1.setIconImage((Image) ic1); 
		con.add(btLogin1);
		con.add(btLogin2);
		con.add(btforgot);
		con.add(btLogin);
		con.add(btnewcreate);
		btLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				 f.dispose();
					 new Admin();
			}
			
		
		});
		btLogin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				new customer();
				 f.dispose();
			}
	});
		btforgot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
			//	new Admin();
				new forgot();
				 f.dispose();
			}
	});
		btcan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 f.dispose();
			}
			
		
			});
		btLogin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				new inforhouse();
				 f.dispose();
			}
	});
		btnewcreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				new Newcreate();
				 f.dispose();
			}
	});
		f.pack();
		f.setSize(500,200);
		f.setVisible(true);
	}	
	public static void main(String agrs[])  {
	
		new dangnhap();
		
	}
}
