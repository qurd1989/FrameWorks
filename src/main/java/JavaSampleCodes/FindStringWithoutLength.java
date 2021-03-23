package JavaSampleCodes;

public class FindStringWithoutLength {

    public static void main(String[] args) {

        String helloWorld = "This is my World";
        System.out.println("Length  of helloWorld String " + getLengthOfString(helloWorld));

    }
     public  static int getLengthOfString(String str) {
         int i = 0;
         try {


             for (i = 0; ; i++) {
                 str.charAt(i);
             }
         }
         catch (Exception e) {
             

             return i;
         }
     }
    
}
