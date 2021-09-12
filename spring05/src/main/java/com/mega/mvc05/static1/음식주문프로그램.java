package com.mega.mvc05.static1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum;
	final static int price = 5000; // 상수 변경 불가능
	
	public static void main(String[] args) {
		// main이 static인 이유
		// 객체생성하지 않아도 main부터 시작하기때문
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setBounds(300, 28, 33, 30);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		count.setBounds(345, 30, 130, 26);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("/Users/rang/Desktop/짬.png"));
		img.setBounds(95, 122, 350, 229);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setBounds(36, 381, 56, 54);
		f.getContentPane().add(result);
		
		
		JLabel l1 = new JLabel("");
		l1.setForeground(Color.RED);
		l1.setBounds(103, 381, 209, 54);
		f.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				l1.setText((sum*price) + "원");
			}
		});
		
		btnNewButton.setBounds(18, 30, 74, 26);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("우.png");
				img.setIcon(icon);
				l1.setText((sum*price) + "원");
			}
		});
		btnNewButton_1.setBounds(100, 30, 74, 26);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("짜.png");
				img.setIcon(icon);
				l1.setText((sum*price) + "원");
			}
		});
		btnNewButton_2.setBounds(186, 30, 74, 26);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
