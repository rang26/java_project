package interfaceTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트 처리 화면");
		f. setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("나를 눌러요");
		f.add(b1);
		
		f.setVisible(true);

	}

}
