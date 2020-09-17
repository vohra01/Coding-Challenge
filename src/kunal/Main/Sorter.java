package kunal.Main;

public class Sorter {


//    input - { 1, 3, 2, 1, 2, 1, 3}
//    Output -  { 1, 1, 1, 3, 3, 2, 2 }



    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 2, 1, 3};

    }

    static void sortData(int[] arr){

        int size = arr.length;
        int low = 0;
        int high = size-1;
        int mid = 0;
        int temp = 0;


        while (mid <=high){
            switch (arr[mid]){
                case 1:{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++; mid++;
                    break;
                }
                case 2:{
                    mid++;
                    break;

                }
                case 3:{

                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;

                }
            }
        }

    }

}
