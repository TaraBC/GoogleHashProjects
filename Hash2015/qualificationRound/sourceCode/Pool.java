import java.util.stream.IntStream;
public class Pool {
	private Server[] serverList;
	private int Capacity;

	public Pool(Server[] sList) {
		this.serverList=sList;
		for (int i=0; i<this.serverList.length; i++) {
			if (this.serverList[i].available){
				this.Capacity+=1;
			}
		}
	}
	
	public int returnCapacity() {
		return this.Capacity;
	}
}