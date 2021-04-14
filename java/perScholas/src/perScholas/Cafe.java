package perScholas;

public class Cafe {
	
	public static void main(String[] args) {
		
		int coffee = 4;
		int late = 5;
		int muffin = 6;
		
		
		double subtotal;
		double totalsale;
		
		double order = coffee * 3 + late * 4 + muffin * 2;
		
		subtotal = order;
		final double salestax = 1.089;
		totalsale = order * salestax;
		
		System.out.println(totalsale);
	}
}
