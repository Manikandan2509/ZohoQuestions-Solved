import java.util.*;
public class SlidingWindowK {
    public static void main(String[] args) {
        int  arr[] = {3,2,7,6,5,1,2,3,4};
        int k=3;
        int max = arr[0];
        ArrayList<Integer> array =new ArrayList();
        for(int i=0;i<arr.length-k+1;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max = arr[j];
                }
            }
            array.add(max);
            max =0;
        }
        System.out.println(array);
    }
}
