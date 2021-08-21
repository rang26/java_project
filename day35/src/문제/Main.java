package 문제;

public class Main {

	public static void main(String[] args) {
		Manager man = new Manager();
		man.name = "lee";
		man.address = "마포구";
		man.rrn = 1000;
		man.salary = 800;
		man.bonus = 500;
		
		man.test();
		System.out.println(man);
	}

}
