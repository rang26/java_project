package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {
//		사각형의 넓이를 구하자
//		가로크기 : 33.3
//		세로크기 : 22.2
//		사각형의 넓이는 ****입니다.

		String width = JOptionPane.showInputDialog("사각형의 가로 길이를 알려주세요.");
		String height = JOptionPane.showInputDialog("사각형의 세로 길이를 알려주세요.");

		double width2 = Double.parseDouble(width);
		double height2 = Double.parseDouble(height);
		double area = width2 * height2;

		JOptionPane.showMessageDialog(null, "사각형의 넓이는 " + area + "입니다.");
	}

}
