package bubbleSort;
import java.util.Arrays;
public class bubbleSort {
    public static void bubbleSort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            boolean swap = false;
            for (int j = 0; j <array.length-1-i ; j++) {
            if (array[j]>array[j+1]){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                swap = true;
            }
            }
            if (!swap){
                break;
            }
        }
    }
    public static  int BinarySearch(int[] array,int val){
        int begin = 0;
        int end = array.length-1;
        while (begin <= end){
            int mid = begin+((end-begin)/2);
            if (array[mid] < val) begin = mid+1;
            else if (array[mid] > val) end = mid-1;
            else return mid;
            }
                return -1;
    }
    public static void main(String[] args) {
        int[] array = {15,55,95,4,5,2,2,1,555,5,23};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
       int a =  BinarySearch(array,55);
        System.out.println(a);
        }
    }

