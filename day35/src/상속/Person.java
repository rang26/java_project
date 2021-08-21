package 상속;

public class Person {
	// 상태(속성)
	String name;
	int age;
	
	// 기본생성자는 다른 생성자 메서드가 없으면 자동 생성
	// 다른 생성자 메서드가 있으면 자동생성이 되지 않는다.
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	// 동작, 멤버메서드
	public void think() {
		System.out.println("생각하다.");
	}
	public void tool() {
		System.out.println("도구를 이용하다.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
