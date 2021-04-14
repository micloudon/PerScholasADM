package ex3;

class Monster {
	String name;
	String attack(){
		return "I don't know how to attack";
	}
}

class FireMonster extends Monster {

	
	String attack(){
		return "I attack with Fire!";
	}
}

class WaterMonster extends Monster {
	String name;
	String attack(){
		return "I attack with Water!";
	}
}

class StoneMonster extends Monster {
	String name;
	String attack(){
		return "I attack with Stones!";
	}
}




public class TestMonster {
	public static void main(String[] args) {
		Monster fm = new FireMonster();
		Monster wm = new WaterMonster();
		Monster sm = new StoneMonster();
		Monster m = new Monster();
		
		
		System.out.println(fm.attack());
		System.out.println(wm.attack());
		System.out.println(sm.attack());
		System.out.println(m.attack());
		
//		reassign FireMonster to StoneMonster
		fm = new StoneMonster();
		System.out.println(fm.attack());
	}
}







