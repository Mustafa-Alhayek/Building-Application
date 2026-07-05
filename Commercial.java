package midterm;


public class Commercial extends Building {
	
	private int numberOfRooms = 3;
	private double sizeOfRoomOne;
	private double sizeOfRoomTwo;
	private double sizeOfRoomThree;
	
	
	public void setSizeOfRoomOne(double sizeOfRoomOne) {
		if(sizeOfRoomOne < 0) {
			this.sizeOfRoomOne = 0;
		}else {
			this.sizeOfRoomOne = sizeOfRoomOne;
		}
	}
	
	public double getSizeOfRoomOne() {
		return sizeOfRoomOne;
	}
	
	public void setSizeOfRoomTwo(double sizeOfRoomTwo) {
		if(sizeOfRoomTwo < 0) {
			this.sizeOfRoomTwo = 0;
		}else {
		this.sizeOfRoomTwo = sizeOfRoomTwo;
		}
	}
	
	public double getSizeOfRoomTwo() {
		return sizeOfRoomTwo;
	}
	
	public void setSizeOfRoomThree(double sizeOfRoomThree) {
		if(sizeOfRoomThree < 0 ) {
			this.sizeOfRoomThree = 0;
		}else{
		this.sizeOfRoomThree = sizeOfRoomThree;
		}
	}
	
	public double getSizeOfRoomThree() {
		return sizeOfRoomThree;
	}
	
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public double totalSquarefeet() {
		double totalSquarefeet = sizeOfRoomOne + sizeOfRoomTwo + sizeOfRoomThree;
		return totalSquarefeet;
	}
	
}
