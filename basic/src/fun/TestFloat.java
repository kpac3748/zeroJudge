package fun;

public class TestFloat {

	public static void main(String[] args) {
		String xxx = "0";
		String yyy = "0.5";
		float fxxx = Float.parseFloat("0");
        float fyyy = Float.parseFloat(yyy);
        
        float diff1 = fxxx - fyyy;
        float diff2 = fyyy - fxxx;
        boolean b = fxxx > 0;
        
        System.out.println("fxxx = " + fxxx);
        System.out.println("fyyy = " + fyyy);
        System.out.println("fyyy2 = " + Math.round(fyyy));
        
        System.out.println("diff1 = " + diff1);
        System.out.println("diff2 = " + diff2);
        
        System.out.println("b = " + b);
	}

}
