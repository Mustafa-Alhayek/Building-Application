package midterm;


public class House extends Building {
	
	private double sizeOfLivingRoom;
	private double sizeOfKitchen;
	private double sizeOfDining;
	private double sizeOfBedRoom;
	
	
	public void setSizeOfLivingRoom(double sizeOfLivingRoom) {
		if(sizeOfLivingRoom < 0) {
			this.sizeOfLivingRoom = 0;
		}else {
		this.sizeOfLivingRoom = sizeOfLivingRoom;
		}
	}
	public double getSizeOfLivingRoom() {
		return sizeOfLivingRoom;
	}
	
	
	public void setSizeOfKitchen(double sizeOfKitchen) {
		if(sizeOfKitchen < 0) {
			this.sizeOfKitchen = 0;
		}else {
		this.sizeOfKitchen = sizeOfKitchen;
		}
	}
	public double getSizeOfKitchen() {
		return sizeOfKitchen;
	}
	
	public void setSizeOfDining(double sizeOfDining) {
		if(sizeOfDining < 0) {
		this.sizeOfDining = 0;
		}else {
		this.sizeOfDining = sizeOfDining;
		}
	}
	public double getSizeOfDining() {
		return sizeOfDining;
	}
	
	public void setSizeOfBedRoom(double sizeOfBedRoom) {
		if(sizeOfBedRoom < 0) {
		this.sizeOfBedRoom = 0;
		}else {
		this.sizeOfBedRoom = sizeOfBedRoom;
		}
		
	}
	
	public double getSizeOfBedRoom() {
		return sizeOfBedRoom;
	}
	
	public double totalSquarefeet() {
		double totalSquarefeet = sizeOfLivingRoom + sizeOfKitchen + sizeOfDining + sizeOfBedRoom;
		return totalSquarefeet;
	}
	


}
