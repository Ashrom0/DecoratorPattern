import holiday_decorations.*;

public class TreeTester {
public static void main(String args[]) {
		
		HolidayItem mytree = new FraserFir(); //HolidayItem is super type for Decorator scenario
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Lights(mytree);
		System.out.print(mytree.getDescription());

		System.out.println(" costs $" + mytree.price());
	
		HolidayItem mytree2 = new ColoradoBlueSpruce();
		mytree2 = new Ruffles(mytree2);
		mytree2 = new BallsRed(mytree2);
		mytree2 = new BallsSilver(mytree2);
		mytree2 = new Ruffles(mytree2);
		mytree2 = new LEDs(mytree2);
		System.out.print(mytree2.getDescription());

		System.out.println(" costs $" + mytree2.price());
		
		HolidayItem mytree3 = new BalsamFir();
		mytree3 = new Ribbons(mytree3);
		mytree3 = new Star(mytree3);
		mytree3 = new BallsBlue(mytree3);
		mytree3 = new Ruffles(mytree3);
		mytree3 = new LEDs(mytree3);
		System.out.print(mytree3.getDescription());

		System.out.println(" costs $" + mytree3.price());
		
		HolidayItem mytree4 = new DouglasFir(); 
		mytree4 = new Ruffles(mytree4);
		mytree4 = new Star(mytree4);
		mytree4 = new LEDs(mytree4); 
		mytree4 = new BallsRed(mytree4);
		System.out.print(mytree4.getDescription());

		System.out.println(" costs $" + mytree4.price());
		
		HolidayItem mytree5 = new ColoradoBlueSpruce(); 
		mytree5 = Star.getStar(mytree5);// First star goes to getStar to check if there is a star already.
		mytree5 = new Ruffles(mytree5);
		mytree5 = Star.getStar(mytree5);// Second Star goes to getStar to check if star is already there. There is a star there, so it wont count and not add it in.
		mytree5 = new Ruffles(mytree5);
		System.out.print(mytree5.getDescription());

		System.out.println(" costs $" + mytree5.price());
	}
}
