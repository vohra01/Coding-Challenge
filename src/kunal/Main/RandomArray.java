package kunal.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomArray {
	
	public static void main(String[] args) {
		
		
		List<String> nameGenerator = Arrays.asList("Filip", "Mark", "John", "Phan", "Wizz", "Freddy", "Don", "Marcus", "Philip", "Pablo");
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println( nameGenerator.get(random.nextInt(nameGenerator.size())));
		}
	}

}
