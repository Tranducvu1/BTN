package Swing;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class inforhouse extends JFrame {
	JFrame f5 = new JFrame("Information House");
	JLabel lbID = new JLabel("ID House");
	JTextField tfID = new JTextField(10);
	JLabel lbaddressh = new JLabel("Address House");
	JTextField tfaddressh = new JTextField(10);
	JLabel lbarea = new JLabel("House Area");
	JTextField tfarea = new JTextField(10);
	JLabel lbdeposits = new JLabel("Deposits");
	JTextField tfdeposits = new JTextField(10);
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	public inforhouse() {
		f5.setLocation(400,100);
		f5.setLayout(new GridLayout(7,2));
		Container cont5 = f5.getContentPane();
		cont5.add(lbID);
		cont5.add(tfID);
		cont5.add(lbaddressh);
		cont5.add(tfaddressh);
		cont5.add(lbarea);
		cont5.add(tfarea);
		cont5.add(lbdeposits);
		cont5.add(tfdeposits);
		cont5.add(btadd);
		cont5.add(btdelete);
		cont5.add(btnew);
		cont5.add(btupdate);
		cont5.add(btfind);
		cont5.add(btSee);
		f5.pack();
		f5.setSize(700,300);
		f5.setVisible(true);
		btnew.addActionListener(new ActionListener(){
			
			

	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		new inforhouse();
		f5.dispose();
			}
		});
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new inforhouse();
	}

}
