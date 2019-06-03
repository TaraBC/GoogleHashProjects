public class DataCentre {
	
	/*Establish 2D array of slots, number of rows and number of slots per row*/
	
	private Slot[][] centre;
	private int rows;
	private int slots;
	
	/*CONSTRUCTOR METHOD*/
	/*Assigns slots to centre array depending on input upon DataCentre creation*/
	public DataCentre(int rowNumber, int slotNumber) {
		this.rows=rowNumber;
		this.slots=slotNumber;
		this.centre = new Slot[rowNumber][slotNumber];
		for (int i=0; i<rowNumber; i++) {
			for (int j=0; j<slotNumber;j++) {
				this.centre[i][j] = new Slot();
			}
		}
	}
	
	/*Return the centre attribute*/
	public Slot[][] returnCentre(){
		return this.centre;
	}
}
