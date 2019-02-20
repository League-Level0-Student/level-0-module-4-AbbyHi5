package charAt_scanners_optionDialogs;

import java.util.Random;

public class Stats {

	//character stats
	
		static int hp = 1;
		
		static int drunk = 0;
		
		static int mana = 0;
		
		static boolean magic = false;
		
	//Monster stats
		
		static int m1Hp = 1;
		
		static int m1Drunk = 0;
		
		static int m1Mana = 0;
		
		static boolean m1Magic = false;
		
	//dice stats
		
		static int rollD20 = new Random().nextInt(20) + 1;
		
		static int rollMd20 = new Random().nextInt(20) + 1;
		
		static int rollMi = rollMd20 - m1Drunk;
		
	}

}
