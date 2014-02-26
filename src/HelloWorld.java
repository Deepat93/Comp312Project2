import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] places = {"world", "Tucson", "little blue bird", "Wednesday", "sarcastic frog", "fellow"};
		int i = rand.nextInt(places.length);
		System.out.printf("Hello %s!\n", places[i]);
	}

}
