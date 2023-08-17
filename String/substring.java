public class substring {
    public static String printsubstring (String str, int si,int ei){
        String substring="";
        for(int i=0;i<=ei-1;i++){
            substring +=str.charAt(i);
        }
return substring;
    }
    public static void main(String[] args) {
        String str="helloworld";
//System.out.println(printsubstring(str, 0, 4));
System.out.println(str.substring(0, 5)
);
    }
}
