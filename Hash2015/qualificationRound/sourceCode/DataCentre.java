public class DataCentre {
	
	/*Establish 2D array of slots, number of rows and number of slots per row*/
	
	private Slot[][] centre;
	private int rows;
	private int slots;
	
	/*CONSTRUCTOR METHOD*/
	/*Assigns slots to centre array depending on input upon DataCentre creation*/
	public DataCentre(int rowNumber, int slotNumber,int[][] unavailableCoords) {
		
		/*Assigns rows,slots attributes*/
		this.rows=rowNumber;
		this.slots=slotNumber;
		
		/*Assigns correct number of slots to 2D array*/
		this.centre = new Slot[rowNumber][slotNumber];
		for (int i=0; i<rowNumber; i++) {
			for (int j=0; j<slotNumber;j++) {
				this.centre[i][j] = new Slot();
		
			}
		}
		/**/
		
		/*Assigns unavailable slots*/
		for (int i=0; i<unavailableCoords.length;i++) {
			int x=unavailableCoords[i][0];
			int y=unavailableCoords[i][1];
			centre[x][y].changeAvailability(false);
		}
	}
	
	/*Return the centre attribute*/
	public Slot[][] returnCentre(){
		return this.centre;
	}
}
