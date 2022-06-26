package src;
import java.util.*;
public class AlternateSortingWithExtraSpace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int newArr[] = new int[arr.length];
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int k =0;
        while(i<j){
            newArr[k] = arr[j];
            j--;
            k++;
            newArr[k] = arr[i];
            i++;
            k++;
        }
        if(arr.length%2 != 0){
            newArr[k] = arr[i];
        }
        System.out.print(Arrays.toString(newArr));
    }
}
