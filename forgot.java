package Swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class forgot extends JFrame {
		
		JFrame f3 = new JFrame("Forgot pass");
		JLabel lbEnter = new JLabel("Enter code");
		JTextField tfenter = new JTextField(10);
		JButton btCancel3 = new JButton("Cancel");
		JButton btContinue3 = new JButton("Continue");
		public forgot(){
		f3.setLocation(400,400);
		f3.setLayout(new GridLayout(2,2));
		Container con3 = f3.getContentPane();
		con3.add(lbEnter);
		con3.add(tfenter);
		con3.add(btCancel3);
	     con3.add(btContinue3);
			f3.pack();
			f3.setSize(500,200);
				f3.setVisible(true);
				btContinue3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							 f3.dispose();
					};
				

			
			});
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new forgot();
	}

}
