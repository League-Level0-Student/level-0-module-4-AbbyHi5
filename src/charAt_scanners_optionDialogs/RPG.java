package charAt_scanners_optionDialogs;

import java.util.Random;

import javax.swing.JOptionPane;

public class RPG {
	
	public static void main(String[] args) {
	
		
		/*  
		 	JOptionPane.showOptionDialog(null,"", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {""}, null);
		*/
		int days = 0;
		int job = JOptionPane.showOptionDialog(null,"Hello and welcome to the in-browser text RPG! (Totally not based on D&D...)\nWhat class would you like to be?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Cancel","Barbarian","Fighter","Wizard","Rouge"}, null);
				
			  choice(job);
			  tavern(job);
			  
		
	}
	
	public static void tavern(int num) {
		
		if(num== 1 || num== 2) {
			
			int agroC = JOptionPane.showOptionDialog(null,"The tavern is busy at this hour. What is your choice of action?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Talk to the inkeeper","Start a bar fight","Talk to the old man is the corner"}, null);
			
		if(agroC == 0) {
			
			 JOptionPane.showOptionDialog(null,"What do you ask him about?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Jobs","A drink","Gossip","A room"}, null);
			
			}
		
		else if (agroC == 1) {
			
			combat(1, "Drunk human");{
			
			}
		}

		if(num== 3 || num== 4) {
			
			int C = JOptionPane.showOptionDialog(null,"The tavern is busy at this hour. Wha is your choice of action?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Talk to the inkeeper","Talk to the old man is the corner"}, null);
			}
		}
	}

	public static void choice(int num) {
		
		if(num==0) {
			  
			System.exit(0);
			  
		  }
		  if(num==1) {
			  
			  Stats.hp = 17;
			  Stats.drunk = 2;
		  }
		  if(num==2) {
			
			Stats.hp = 10;
			Stats.mana = 2;
			Stats.magic = true;
			
		}
		if(num==3);{
			
			Stats.hp = 7;
			Stats.mana = 5;
			Stats.magic = true;
			
		}
		if(num==4);{
			
			Stats.hp = 9;
			Stats.mana = 1;
			Stats.magic = true;
			
		}
		
	}

	public static void combat(int number, String monster) {
		
		int rollI = Stats.rollD20 - Stats.drunk;
		
		if(rollI < 0) {
			
			rollI = 1;
			
		}
		
 		JOptionPane.showMessageDialog(null,"ROLL INITIATIVE!\nYou rolled a " + rollI + "!");
		
		if(Stats.rollMi > rollI) {
		
		
		
		}
	}
}