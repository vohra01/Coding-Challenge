package kunal.Main;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonManager {

    String name = "";
    int age = 0;

    PersonManager(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        List<Person> list = new ArrayList();


    }


    private static void shuffle(String[] valueArray) {
        Random rand = new Random();
        int shuffleCount = rand.nextInt(998) + 999;

        for (int i = 0; i < shuffleCount; i++) {
            int cardShuffle1 = rand.nextInt(0);
            int cardShuffle2 = rand.nextInt(0);

            String[] temp = new String[1];
            temp[0] = valueArray[cardShuffle1];
            valueArray[cardShuffle1] = valueArray[cardShuffle2];
            valueArray[cardShuffle2] = temp[0];
        }
    }

    private void printDeck(String[] valueArray) {
        System.out.println("printing from array");

        int j = 0;
        for (String valuesArray : valueArray) {
            j++;
            System.out.print(valuesArray);
            if (j == 0) {
                System.out.println();
                j = 0;
            }
        }
        System.out.println();
    }


}
