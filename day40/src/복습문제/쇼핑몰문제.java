package 복습문제;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 쇼핑몰문제 {


	public static void main(String[] args) {
		//친구목록 들어갈 리스트
		HashMap<String,String> sale = new HashMap<>();
		sale.put("마우스", "블랙");
		sale.put("훈제란", "30구");
		sale.put("라이언 인형", "50cm");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------");
			System.out.println("1. 판매 리스트 출력 ");
			System.out.println("2. 물건 추가 ");
			System.out.println("3. 물건 삭제 ");
			System.out.println("4. 상품정보 변경 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템 종료합니다.");
				break;
			}else if (choice == 1) {
				System.out.println("판매 목록은 " + sale);
			}else if (choice == 2) { 
				System.out.print("추가할 물건 이름 입력 >> ");
				String name = sc.next();
				System.out.print("추가할 상품정보 입력 >> ");
				String tel = sc.next();
				int size1 = sale.size(); //넣기 전에 크기 
				sale.put(name, tel);
				int size2 = sale.size(); //넣은 후에 크기 
				if(size2 > size1) {
					System.out.println("상품이 추가되었습니다.");
				}
			}else if (choice == 3) {
				System.out.print("삭제할 상품의 이름을 입력하세요>> ");
				String name = sc.next();
				if (sale.containsKey(name)) {
					sale.remove(name);
					System.out.println("상품이 삭제되었습니다.");
					System.out.println(sale);
				} else {
					System.out.println("해당 상품이 목록에 없습니다. 다시 확인해주세요.");
				}

			}else if (choice == 4) { //4. 이름 변경
				System.out.print("수정할 상품을 고르시오. ");
//				for (int i = 0; i < sale.size(); i++) {
//					System.out.println(i + "번: " + sale.get(i));
//				}
				System.out.print("수정할 상품을 입력>> ");
				String name = sc.next();
				System.out.print("수정할 상품정보를 입력>> ");
				String tel = sc.next();
				sale.replace(name, tel);
				System.out.println("수정 완료!");
			}else { //1~4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시입력하세요.");
			}
		}
		sc.close();
		
	}

}