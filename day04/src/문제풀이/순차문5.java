package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문5 {

	public static void main(String[] args) {

//		내가 먹고 싶은 음식은? 팥빙수
//		친구가 먹고 싶은 음식은? 팥빙수
		String me = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String friend = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");

//		아하! 나랑 친구랑 같아요!
//		크~! 나랑 친구랑 달라요!
		if (me.equals(friend)) {
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
		} else {
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");
		}

	} // main

} // class
