public class main {

	public static void main(String[] args) {
		Server[] thing = {new Server(true,1),new Server(false,3),new Server(true,4)};
		Pool pool1 = new Pool(thing);
		System.out.println(pool1.returnCapacity());

	}

}
