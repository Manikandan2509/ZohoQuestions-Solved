package src;
import java.util.*;
public class AlternateSortingWithoutExtraSpace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};                // sort the array if not sorted
        int min = 0;
        int max = arr.length-1;                     // two pointers min and max
        int maxElement = arr[arr.length-1] + 1;        // Max Element = max value +1
        for (int i = 0; i < arr.length; i++) {

            if(i%2 == 0){
                arr[i] = arr[i] +(arr[max] % maxElement ) * maxElement; // formula for even index
                max--;
            }
            else{
                arr[i] = arr[i] + (arr[min]%maxElement )*maxElement;     // formula for odd index
                min++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] /maxElement+" ");   //  arr % max element = original array
        }                                                  // arr / max element = alternate sorted array
    }
}
