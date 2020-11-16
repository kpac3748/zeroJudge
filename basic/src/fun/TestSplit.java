package fun;

public class TestSplit {

	public static void main(String[] args) {
		
		String xxx = "1;2;3;4;;;;;";
		String[] yyy = xxx.split(";");
		System.out.println(yyy.length);

	}

}
