package 문제;

public class BigBaby extends Baby{
	
	public String toy;
	
	public void see() {
		System.out.println("모빌을 좋아해요.");
	}

	@Override
	public String toString() {
		return "BigBaby [toy=" + toy + ", eat=" + eat + ", name=" + name + ", age=" + age + "]";
	}
	

}
