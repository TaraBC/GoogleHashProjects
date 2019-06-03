import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	/*Create a BufferedReader object*/
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*CONSTRUCTOR METHOD*/
	public Reader() {
		
	}
	
	/*KEYBOARD READER*/
	public String keyboardReader(String inputText) throws IOException{
		System.out.println(inputText);
		return reader.readLine();
	}
	
	public void fileReader(String filePath) throws IOException {
		String st; 
		while ((st = this.reader.readLine()) != null) {
			System.out.println(st); 
		}
	}
}
