import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 int arr[] = {2,1,3,2,2,5,8,9,8};
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<arr.length;i++){
		     if(map.containsKey(arr[i])){
		         map.put(arr[i],map.get(arr[i])+1);
		     }
		     else{
		         map.put(arr[i],1);
		     }
		 }
		 System.out.println(map);

	}
}
