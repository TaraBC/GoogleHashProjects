public class Server {
	private boolean available;
	private int Capacity;

	public Server(boolean available,int capacity) {
		this.available = available;
		this.Capacity = capacity;
	}
	
	public boolean getAvailability() {
		return this.available;
	}
	
	public int getCapacity() {
		return this.Capacity;
	}
}
