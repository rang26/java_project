package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO;

public class 회원정보 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원가입 id 입력");
		String pw = JOptionPane.showInputDialog("회원가입 pw 입력");
		String name = JOptionPane.showInputDialog("회원가입 name 입력");
		String tel = JOptionPane.showInputDialog("회원가입 tel 입력");
		
		회원DAO dao = new 회원DAO();
		dao.create(id, pw, name, tel);
		System.out.println("회원DAO의 create()하고 연이어 실행됨");
	} // main

}
