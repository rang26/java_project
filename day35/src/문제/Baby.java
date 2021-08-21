package 문제;

public class Baby extends Person{
	
	public boolean eat;
	
	public void space() {
		System.out.println("울기만 한다.");
	}

	@Override
	public String toString() {
		return "Baby [eat=" + eat + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
