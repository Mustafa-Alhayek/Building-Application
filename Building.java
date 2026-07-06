package midterm;
import java.util.Scanner;

public class Building {
	
	private double squarefeet;
	private String siding; 
	

	public static void main(String[] args) {
		Commercial commercialSize = new Commercial();
		House houseSize = new House();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to your favorite Real Estate App.");
		System.out.println("Write Start to set the room sizes or quit to leave the app ");
	
		String word = "";
		String houseSiding = "";
		String commercialSiding = "";
		while(!word.toLowerCase().equals("quit")) {
			word = userInput.nextLine().toLowerCase();

		if(word.equals("start")) {
			System.out.println("What would you like the size of Bedroom?");
			houseSize.setSizeOfBedRoom(userInput.nextDouble());
			System.out.println("What would you like the size of Kitchen?");
			houseSize.setSizeOfKitchen(userInput.nextDouble());
			System.out.println("What would you like the size of Dining?");
			houseSize.setSizeOfDining(userInput.nextDouble());
			System.out.println("What would you like the size of the Living room?");
			houseSize.setSizeOfLivingRoom(userInput.nextDouble());
			System.out.println("What kind of siding would you like for the house?");
			userInput.nextLine();
			houseSiding = userInput.nextLine();
			
			System.out.println("What is the size of the first commercial room?");
			commercialSize.setSizeOfRoomOne(userInput.nextDouble());
			System.out.println("What is the size of the second commercial room?");
			commercialSize.setSizeOfRoomTwo(userInput.nextDouble());
			System.out.println("What is the size of the third commercial room?");
			commercialSize.setSizeOfRoomThree(userInput.nextDouble());
			System.out.println("What kind of siding would you like for the commercial building?");
			userInput.nextLine();
			commercialSiding = userInput.nextLine();
			
			houseSize.setSiding(houseSiding);
			houseSize.setSquarefeet(houseSize.totalSquarefeet());
			System.out.println("Total square feet for House: " + houseSize.getSquarefeet());
			System.out.println("Siding for the House: " + houseSize.getSiding());
			
			commercialSize.setSiding(commercialSiding);
			commercialSize.setSquarefeet(commercialSize.totalSquarefeet());
			System.out.println("Total square feet for Commercial Building: " + commercialSize.getSquarefeet());
			System.out.println("Siding for the Commercial Building: " + commercialSize.getSiding());
			break;
			
		}
			
		else if(word.equals("quit")){
			System.out.println("Thank you!");
			break;
		}else {
			System.out.println("Wrong Input");
		}
	}
	


	}
	
	
	public void setSquarefeet(double squarefeet) {
		this.squarefeet = squarefeet;
	}
	public double getSquarefeet() {
		return squarefeet;
	}
	
	public void setSiding(String siding) {
		this.siding = siding;
	}
	public String getSiding() {
		return siding;
	}
	
	public double totalSquarefeet() {
		return squarefeet;
	}

}
