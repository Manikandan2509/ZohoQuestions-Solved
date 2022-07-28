import java.util.*;

public class Main{
    public static void main(String[] args){
        int arr[] ={16,17,4,3,5,2};
        int max =0;
        int arr1[] = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            
            if(stack.isEmpty() || arr[i] <= stack.peek()){
                stack.push(arr[i]);
            }
            else{
                stack.pop();
                arr1[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
