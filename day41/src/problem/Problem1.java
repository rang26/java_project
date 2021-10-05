package problem;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem1 {
	
	JLabel l3;
	JLabel l4;
	
	public Problem1() {
		
		JFrame f = new JFrame("problem");
		f.setSize(200, 300);
		
		FlowLayout layout = new FlowLayout();
		f.setLayout(layout);
		
		JLabel l1 = new JLabel("어디로?");
		f.add(l1);
		JTextField t1 = new JTextField();
		t1.setColumns(10);
		f.add(t1);
		
		JLabel l2 = new JLabel("언제?");
		f.add(l2);
		JTextField t2 = new JTextField();
		t2.setColumns(10);
		f.add(t2);
		
		JButton b1 = new JButton("버튼1");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l3.setText(t1.getText() + t2.getText() + "에 떠나요.");
				
			}
		});

		f.add(b1);
		l3 = new JLabel();
		f.add(l3);
		
		JButton b2 = new JButton("버튼2");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l4.setText(new Date().toString());
				
			}
		});
		f.add(b2);
		l4 = new  JLabel();
		f.add(l4);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Problem1();
	}
	
}
