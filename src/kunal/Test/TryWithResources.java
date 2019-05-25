package kunal.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	
	public static void main(String[] args) throws IOException {
		readFirstLineFromFile("");
		
	}
	
	static String readFirstLineFromFile(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(""))) {
	        return br.readLine();
	    }
	}
}
