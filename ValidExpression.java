package src.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        String s = "((ab)))((((aba))";
        char arr[] = s.toCharArray();
        int open = 0;
        int close = 0;
        int start = 0;
        int end = s.length() - 1;
       for(start=0;start<arr.length;start++) {
           if (arr[start] == '(') {
               open++;
           } else if (arr[start] == ')') {
               open--;
           }
           if (arr[end] == ')') {
               close++;
           } else if (arr[end] == '(') {
               close--;
           }
           if (open < 0) {
               arr[start] = '0';
               open =0;
           }
           if (close < 0) {
               arr[end] = '0';
               close =0;
           }
           end--;
       }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != '0'){
                System.out.print(arr[i]);
            }
        }
    }
}
