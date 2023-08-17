public class concatanation {

    public static void printcharecter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" "); 
        }
    }
        public static void main(String[] args) {
        String str="subhadip";

        String str2="karmakar";
        String fullname=str+" "+str2;
       // System.out.println(fullname);
      // System.out.println(fullname.charAt(0));
      printcharecter(fullname);
    
    }
}
