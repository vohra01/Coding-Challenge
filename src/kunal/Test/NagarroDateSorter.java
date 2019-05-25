package kunal.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class NagarroDateSorter {
	public static void main(String[] args) {
		// Unsorted dates which need to sort
		String[] dateToSort = { "22NOV2012", "02JAN2013", "14OCT2011", "07MAR2012" };
		// Calendar is used to give date object and set date object
		Calendar calenderSort = Calendar.getInstance();
		// Set calendar provide us ordered and unique dates object
		Set<Calendar> sortedList = new TreeSet<Calendar>();
		try {
			// We need to first format dates string into date object for sort
			// date parse() method is used to parse date
			for (String strdate : dateToSort) {
				SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyyyy");
				Date dateparse = sdf.parse(strdate);
				calenderSort = Calendar.getInstance();
				calenderSort.setTime(dateparse);
				sortedList.add(calenderSort);
				System.out.println("Unsorted Date :" + dateparse);
			}
			// We will get date in sorted form
			Iterator<Calendar> it = sortedList.iterator();
			Date sortedDate = new Date();
			while (it.hasNext()) {
				sortedDate = it.next().getTime();
				System.out.println("Sorted Date :" + sortedDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}