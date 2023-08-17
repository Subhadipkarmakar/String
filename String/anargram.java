import java.util.Arrays;

public class anargram {
    public static boolean isanargram(String str,String str1){
      str=str.toLowerCase();
      str1=str1.toLowerCase();
      char[] strcharArray=str.toCharArray();
      char[] str1charArray=str1.toCharArray();
      Arrays.sort(strcharArray);
      Arrays.sort(str1charArray);
      return Arrays.equals(strcharArray, str1charArray);
    }
    public static void main(String[] args) {
       String str="race";
       String str1="care";
       System.out.println(isanargram(str, str1));
     }
}
