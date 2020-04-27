package beanTest;

public class ABean {
	BBean b;
	
	/*如果沒有建構子 BBean會是null*/
	public ABean() {
		this.b = new BBean();
	}
	
	public static void main(String[] args) {
		
		ABean a = new ABean();
		System.out.println(a.b);
		System.out.println(a.b.c);
		System.out.println(a.b.c.Qoo);
		System.out.println(a.b.c.b);
	}
	
}
