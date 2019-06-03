import java.io.IOException;

public class main {
	private Server[] servers;
	public static void main(String[] args) throws IOException {
		Reader IO = new Reader();
		String path = IO.keyboardReader("Please enter filepath to txt file with data centre details");
		IO.fileReader(path);
	}

}
