package src;

public class StringExpansion {
    public static void main(String[] args) {
        String s = "a12b3c15";
        Character character = null;
        String number ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >='a' && s.charAt(i) <= 'z'){
                if(i != 0){
                    print(character,number);
                    number ="";
                }
                character = s.charAt(i);
            }
            else{
                number = number +s.charAt(i);
                if(i == s.length()-1){
                    print(character,number);
                }
            }
        }


    }
    public static void print(Character character,String number){
        for(int j=0;j< Integer.parseInt(number);j++){
            System.out.print(character);
        }
    }
}
