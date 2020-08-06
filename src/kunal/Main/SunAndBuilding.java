package kunal.Main;

public class SunAndBuilding {


    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9, 3, 15, 21, 11, 12, 13, 18};

        System.out.println(countBuildingsSeeSun(arr, arr.length));
    }

    private static int countBuildingsSeeSun(int[] arr, int length) {

        int max_value = arr[0];
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (arr[i] > max_value) {
                count++;
                max_value = arr[i];
            }
        }
        return count;
    }

}


