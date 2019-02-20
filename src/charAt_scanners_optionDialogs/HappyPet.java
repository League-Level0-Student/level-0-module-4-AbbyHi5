package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;
public class HappyPet {

	static int happinessLevel = 0;
	static int timeplay = 1;
	static int timefeed = 1;
	static int timefromfeed = 0;
	static String pet = JOptionPane.showInputDialog(null, "Welcome to the Tarrasque pet store! What type of pet would you like to buy?");
	
	

	public static void main(String[] args) {

		for (;happinessLevel < 50;) {
			
			
			if(pet.equals ("half-elf")) {
		
				JOptionPane.showMessageDialog(null,"SHAME ON YOU!");
				pet = "slave";
			}
			if(pet.equals ("tarrasque")) {
				
				JOptionPane.showMessageDialog(null,"...Wow, such an ORIGINAL idea...");
				pet = "ORIGINAL PET";
			}
			if(happinessLevel < 0) {
				
				JOptionPane.showMessageDialog(null, "Oh nose! your " + pet + " ran away!");
				break;
			}

			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + pet + "? Your "+ pet + "'s happiness = "+ happinessLevel, "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Stop Game", "Sleep till 'morrow", "Feed", "Pet", "Play" }, null);

			if(task == 4) {
				
				play();
				timefromfeed++;
			}
			else if(task == 3) {
				
				pet();
				timefromfeed++;
			}
			else if(task == 2) {
				
				feed();
				timefromfeed = 0;
			}
			else if(task == 1) {
				
				sleep();
				timefromfeed++;
				timefromfeed++;
			}
			else if(task == 0) {
				
				break;
				
			}
			
			if(timefromfeed >= 7) {
				
				JOptionPane.showMessageDialog(null, "Your " + pet + " starved and kicked the bucket. Dont buy from us again, MONSTER!");
				break;
				}
			}
		
		System.out.println(happinessLevel);
		
	
	
	if(happinessLevel >= 50) {
		
		JOptionPane.showMessageDialog(null, "Your " + pet + " is now so happy, it will be loyal for ever! YOU WON!");
		
		}
	}
	
	static void play() {

		if(timeplay == 1) {
			JOptionPane.showMessageDialog(null,"You play with your " + pet + ".");
			happinessLevel = happinessLevel + 5 ;
			
			}
		
		if(timeplay == 2) {
			JOptionPane.showMessageDialog(null,"You play with your " + pet + ".");
			happinessLevel = happinessLevel + 5 ;
		
			}
		
		if(timeplay >= 3) {
			JOptionPane.showMessageDialog(null,"Your " + pet + " is now tired. Maybe tomorrow!");
			happinessLevel = happinessLevel - 5 ;
			}
			timeplay++;

	}
	
	
	static void pet() {
		
		JOptionPane.showMessageDialog(null, "You pet your " + pet + ".");
		
		happinessLevel++;
	}
	
	static void feed() {
		
		if(timefeed == 1) {
		JOptionPane.showMessageDialog(null, "You feed your " + pet + " some grub.");
		
		happinessLevel = happinessLevel + 5;
		}
		
		if(timefeed >= 2) {
			
			JOptionPane.showMessageDialog(null, "Your " + pet + " is stuffed! Maybe tommorow!");
			happinessLevel = happinessLevel - 5;
		}
		timefeed++;
	}

	static void sleep() {
		
		timeplay = 0;
		timefeed = 0;
		JOptionPane.showMessageDialog(null, "You sleep till tommorow. Your " + pet + " is refreshed!");
		
	}
}