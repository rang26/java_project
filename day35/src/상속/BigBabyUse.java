package 상속;

import 문제.BigBaby;

public class BigBabyUse {

	public static void main(String[] args) {
		BigBaby baby = new BigBaby();
		baby.name = "주니어27세";
		baby.age = 1;
		baby.eat = true;
		baby.toy = "모빌";
		
		System.out.println(baby);
		baby.think();
		baby.tool();
		baby.see();
		baby.space();
	
	}

}
