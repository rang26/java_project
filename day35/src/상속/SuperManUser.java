package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.name = "클라크";
		sMan.age = 1000;
		sMan.power = 3000;
		sMan.fly = true;
		
		System.out.println(sMan);
		sMan.think();
		sMan.tool();
		sMan.run();
		sMan.space();
	}

}
