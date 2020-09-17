package kunal.Main;

import java.util.*;

public class Solution {
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {

        Map<Map<String, Integer>, Integer> playerStats = new HashMap<>();
        Map<String, Integer> playerStats1 = new HashMap<>();

        @Override
        public void putNewInnings(String player, int runs) {
            // YOUR CODE HERE
            playerStats1.put(player, runs);
            playerStats.put(playerStats1, 1);

            if (playerStats1.containsKey(player)) {

                Integer val = playerStats1.get(player);
                val = val + runs;
                playerStats1.put(player, val);
            } else {
                playerStats1.put(player, runs);
            }


            if (playerStats.containsValue(playerStats1.keySet().contains(player))) {
                Integer val = playerStats1.get(player);
                val = val + 1;
                playerStats.put(playerStats1, val);
            } else {
                playerStats.put(playerStats1, runs);
            }
        }

        @Override
        public double getAverageRuns(String player) {
            // YOUR CODE HERE

            if (playerStats.containsValue(playerStats.get(player))) {
                return playerStats1.get(player) / playerStats.get(playerStats.get(player));
            }

            return 0D;
        }

        @Override
        public int getInningsCount(String player) {
            // YOUR CODE HERE
            if (playerStats.containsValue(playerStats.get(player))) {
                return playerStats.get(playerStats.get(player));
            }
            return 0;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
