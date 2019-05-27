public class main {

	public static void main(String[] args) {
		Server[] thing = {new Server(true),new Server(false),new Server(true)};
		Pool pool1 = new Pool(thing);
		System.out.println(pool1.returnCapacity());

	}

}
