package Swing;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

	
public class customer extends JFrame {
		JFrame f4 = new JFrame("Information Landlords");
		JLabel lbCMll = new JLabel("CMND");
		JTextField tfCMll = new JTextField(10);
		JLabel lbnamell = new JLabel("Full Name");
		JTextField tfnamell = new JTextField(10);
		JLabel lbaddressll = new JLabel("Address");
		JTextField tfaddressll = new JTextField(10);
		JLabel lbbirthdayll = new JLabel ("Birthday");
		JTextField dcbirthdayll = new JTextField();
		JButton btadd = new JButton ("Add");
		JButton btdelete = new JButton ("Delete");
		JButton btnew = new JButton ("New");
		JButton btupdate = new JButton ("Update");
		JButton btfind = new JButton ("Find");
		JButton btSee = new JButton ("See");
		public customer() {
	
		f4.setLocation(400,00);
		f4.setLayout(new GridLayout(7,2));
		Container cont4 = f4.getContentPane();
		cont4.add(lbCMll);
		cont4.add(tfCMll);
		cont4.add(lbnamell);
		cont4.add(tfnamell);
		cont4.add(lbaddressll);
		cont4.add(tfaddressll);
		cont4.add(lbbirthdayll);
		cont4.add(dcbirthdayll);
		cont4.add(btadd);
		cont4.add(btdelete);
		cont4.add(btnew);
		cont4.add(btupdate);
		cont4.add(btfind);
		cont4.add(btSee);
		f4.pack();
		f4.setSize(700,300);
		f4.setVisible(true);
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f4.dispose();
			}
		});
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new customer();
	}
	}
