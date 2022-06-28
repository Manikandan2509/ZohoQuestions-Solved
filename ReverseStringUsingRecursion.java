package src;
import java.util.*;
public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String array[] = {"hello","world","one","two","three"};
        int start =0;
        int end =array.length-1;
        reverse(start,end,array);
        System.out.print(Arrays.toString(array));

    }
    public static void reverse(int start,int end,String[] array){
        if(start<end){
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverse(start+1,end-1,array);
        }

    }
}
