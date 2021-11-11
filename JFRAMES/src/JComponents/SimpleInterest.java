package JComponents;

import java.awt.FlowLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SimpleInterest extends JFrame{
	JLabel j1;
	JTextField t1,t2,t3;	
	JButton b1;

	SimpleInterest(){
		setTitle("Test");
		setSize(250,250);
		setResizable(false);
		setLayout(new FlowLayout(1,15,10));
		
	add(new JLabel("Enter Principle"));
	t1=new JTextField(10);
	add(t1);

	add(new JLabel("Enter Time"));
	t2=new JTextField(10);
	add(t2);
	
	add(new JLabel("Enter Rate"));	
	t3=new JTextField(10);
	add(t3);
	
	b1=new JButton("Calculate");
	add(b1);
	
	j1=new JLabel("");
	add(j1);
	
	
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
	double p=Double.parseDouble(t1.getText());
	double t=Double.parseDouble(t2.getText());
	double r=Double.parseDouble(t3.getText());
	double SI=(p*t*r)/100;
	
	j1.setText(String.valueOf(SI));
	}
});

setVisible(true);
}
	
	public static void main(String[] args) {
		new SimpleInterest();
	}
}
		