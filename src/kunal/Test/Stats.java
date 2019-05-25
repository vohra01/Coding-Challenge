package kunal.Test;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Stats {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {

		double sum=0,avg=0;
	    int counter=0;
	    String finalSym = "";
	    List<String> syms = new ArrayList<>();
	    HashMap<Double,String > map = new HashMap<>(); 		
		@Override
		public void putNewPrice(String symbol, double price) {
		// YOUR CODE HERE
			
			sum = sum + price;
			syms.add(symbol);
			map.put(price, symbol);

			counter++;
			if (syms.size()>1) {
				if(syms.get(counter-2).equals(syms.get(counter-1))){
					//syms.add(symbol);
					avg = sum/price;
				}
			} 
			
			
			
			System.out.println("putNewPrice symbol="+symbol+"putNewPrice price="+price);
		}

		@Override
		public double getAveragePrice(String symbol) {
		// YOUR CODE HERE
			
			for (String string : syms) {
				if(string.equals(symbol)) {
					return avg;
				}
			}
			return 0.0;
		}

		@Override
		public int getTickCount(String symbol) {
		// YOUR CODE HERE
			for (String string : syms) {
				if(string.equals(symbol)) {
					return counter;
				}
			}
			return 0;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}