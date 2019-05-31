/* IMPORTS */
import java.util.stream.IntStream;
/*         */

/*POOL CLASS*/
public class Pool {
	/*DECLARATION OF ATTRIBUTES*/
	private Server[] serverList;
	private int Capacity;
	
	/*CONSTRUCTOR METHOD*/
	public Pool(Server[] sList) {
		
		/*Sets server list to list input upon instantiation*/
		this.serverList=sList;
		
		/*Calculates Capacity value for Pool object*/
		for (int i=0; i<this.serverList.length; i++) {
			if (this.serverList[i].getAvailability()){
				this.Capacity+=this.serverList[i].getCapacity();
			}
		}
	}
	
	public int returnCapacity() {
		return this.Capacity;
	}
}