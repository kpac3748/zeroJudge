package fun;

public class TestThread {
	void m(TestThread obj) {
        System.out.println("method is invoked");
    }

    void p() {
    	System.out.println("this = " + this.getClass().getName());
        m(this);
    }
    
    void qoo(){
    	p();
    }

    public static void main(String args[]) {
    	TestThread s1 = new TestThread();
        s1.qoo();
    }
}
