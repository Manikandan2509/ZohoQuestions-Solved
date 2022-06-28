package src.Stack;
import java.util.*;
public class findGrandChildren {
    public static void main(String[] args) {
        String grandParent ="ronaldo";
        String parent ="";
        int count =0;
        String array[][] ={{"luke","shaw"},
                            {"wayne","rooney"},
                            {"rooney","ronaldo"},
                            {"shaw","rooney"},
                            {"shw","rooney"},
                            {"haw","rooney"}};
        for(int i=0;i< array.length;i++){           // Loop to find the child of the grandFather
            if(array[i][1] == grandParent){
                parent = array[i][0];
            }
        }
        for(int i=0;i<array.length;i++){           // loop to find the grandchild of the grandfather
            if(array[i][1] == parent){
                count++;
            }
        }
        System.out.print(count);
    }
}
