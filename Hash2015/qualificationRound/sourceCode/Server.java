public class Server {
	private boolean available;
	private int Capacity;

	/*CONSTRUCTOR METHOD*/
	/*Establishes attributes initial values*/
	public Server(boolean available,int capacity) {
		this.available = available;
		this.Capacity = capacity;
	}
	
	
	/*Returning attributes methods*/
	public boolean getAvailability() {
		return this.available;
	}
	
	public int getCapacity() {
		return this.Capacity;
	}
}
