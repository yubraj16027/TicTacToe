package JComponents;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SIFlowLayout extends JFrame{
	
	public static void main(String[] args) {
		new SIFlowLayout();
	}
	
	public SIFlowLayout() {
		setTitle("Calculate simple interest");
		setSize(250,250);
		
		setLayout(new FlowLayout(1,10,15));
		add(new JLabel("Enter Principle "));
		JTextField t1 = new JTextField(12);
		add(t1);
		
		add(new JLabel("Enter Time "));
		JTextField t2 = new JTextField(12);
		add(t2);
		
		add(new JLabel("Enter Rate "));
		JTextField t3 = new JTextField(12);
		add(t3);
		
		
		JButton calculateButton = new JButton("Calculate simple interest");
		add(calculateButton);
		
		JTextField SITextField = new JTextField(20);
		SITextField.setEditable(false);
		add(SITextField);
		
		JLabel l1=new JLabel("");
		add(l1);
		
		
		calculateButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				double p= Double.parseDouble(t1.getText());
				double t= Double.parseDouble(t2.getText());
				double r= Double.parseDouble(t3.getText());
				double SI=(p*t*r)/100;
				SITextField.setText(String.valueOf(SI));	
				l1.setText(String.valueOf(SI));
			}	
		});
		
		setVisible(true);
	}
}

