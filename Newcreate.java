package Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Newcreate extends JFrame{
	JFrame f6 = new JFrame("Create account");
	JLabel lbName = new JLabel("Ten ");
	JTextField tfName = new JTextField(10);
	JLabel lbPass = new JLabel("Pass");
	JTextField tfPass = new JTextField(10);
	JLabel lbxnPass = new JLabel("Xac nhan Pass");
	JTextField tfxnPass = new JTextField(10);
	JLabel lbsdt = new JLabel("So dien thoai");
	JTextField tfsdt = new JTextField(10);
	JButton btNewcreate = new JButton("New create");
	public Newcreate() {
		f6.setLocation(400,100);
		f6.setLayout(new GridLayout(7,2));
		Container cont5 = f6.getContentPane();
		cont5.add(lbName);
		cont5.add(tfName);
		cont5.add(lbPass);
		cont5.add(tfPass);
		cont5.add(lbxnPass);
		cont5.add(tfxnPass);
		cont5.add(lbsdt);
		cont5.add(tfsdt);
		cont5.add(btNewcreate);
		btNewcreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				//new Newcreate();
				 f6.dispose();
			}
	});
		f6.pack();
		f6.setSize(700,300);
		f6.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Newcreate();
	}

}
