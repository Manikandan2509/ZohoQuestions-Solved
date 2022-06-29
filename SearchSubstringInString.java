package src.Stack;
import java.util.*;
public class SearchSubstringInString {
    public static void main(String[] args) {
        String s = "hellollworld";
        String sub ="lol";
        System.out.println(isPresent(s,sub));

    }
   public static int isPresent(String s,String sub){
        int count=0;
        int i=0;
        for( i=0;i<s.length();i++){
            if(count == sub.length()){
                break;
            }
            if(s.charAt(i) == sub.charAt(count)){
                count++;
            }
            else{
                if(count>0){
                    i = i-count;
                }
                count =0;
            }
        }
        return count<sub.length()?-1:i-count;
   }

    }


