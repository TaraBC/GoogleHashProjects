public class Slot {
	/*occupied attribute to see if slot is currently occupied by server etc.*/
	private boolean occupied=false;
	private boolean available;
	
	/*Return methods*/
	public boolean returnOccupied() {
		return this.occupied;
	}
	
	/*Change attributes methods*/
	public void changeAvailability(boolean availability) {
		this.available = availability;
	}
	public void changeOccupied(boolean occupied) {
		this.occupied=occupied;
	}
}
