import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        int  arr[] = {2,1,3,2,2,5,8,9,8};
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else {
                hash.put(arr[i],1);
            }
        }
        System.out.println(hash);
    }
}
