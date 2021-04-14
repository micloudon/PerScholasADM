package perScholas;

import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		
		long mS = System.currentTimeMillis();
		Date date = new Date(mS);
		System.out.println(date);
	}
}