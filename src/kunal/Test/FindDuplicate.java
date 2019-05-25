package kunal.Test;

/**
 * Created by kv58935 on 12/8/2018.
 */
class RepeatElement
{
    public void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
                System.out.println(a[j]);
            count = 0;
        }
    }

    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        repeat.findDupicateInArray(arr);
    }
}

