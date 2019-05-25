package kunal.Main;

import java.util.*;
import java.util.Map.Entry;

public class Esko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String commaSeparated = sc.nextLine();
		List<String> items = Arrays.asList(commaSeparated.split("\\s*,\\s*"));
		int nMinus1 = items.size() - 1;
		List<String> innerItem = new ArrayList<String>();
		List<Integer> innerItemNumber = new ArrayList<Integer>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String Last = "";
		String result = "1";
		Integer tempValue = 1;

		for (int i = 0; i < nMinus1; i++) {
			innerItem.add(sc.nextLine());
			innerItemNumber.add(Integer.parseInt(innerItem.get(i).replaceAll("[\\D]", "")));
			map.put(innerItem.get(i), innerItemNumber.get(i));
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			// now work with key and value...
			tempValue = value = tempValue * value;
			result = result + getStringOnly(key) + " = " + value;
		}
		Last = innerItem.get(innerItem.size() - 1).substring(innerItem.get(innerItem.size() - 1).lastIndexOf(" ") + 1)
				.trim();
		System.out.println(result.trim() + Last);// It can be easily done by unit conversion library but hackeearth dont allow to add external jars
	}

	public static String getStringOnly(String someString) {

		someString = someString.replaceAll(" ", "");
		someString = someString.replaceAll("[^0-9a-zA-Z:,]+", "");
		String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
		
		return Arrays.asList(someString.split(regex)).get(0);
	}
}
