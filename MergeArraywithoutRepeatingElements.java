package src;

import java.util.ArrayList;

public class MergeArraywithoutRepeatingElements {
    public static void main(String[] args) {
        int arr1[] ={2,4,5,6,7,9,10,13};
        int arr2[] = {2,3,4,5,6,7,8,9,11,15};
        System.out.print(merge(arr1,arr2));
    }
    public static ArrayList merge(int[] arr1,int[] arr2){
        ArrayList<Integer> arr3 = new ArrayList<>();
        int i=0;int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr3.add(arr2[j]);
                j++;
            }
            else if(arr1[i] == arr2[j]){
                arr3.add(arr1[i]);
                i++;
                j++;
            }

        }

        while(i<arr1.length){
            arr3.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            arr3.add(arr2[j]);
            j++;
        }
        return arr3;
    }
}
