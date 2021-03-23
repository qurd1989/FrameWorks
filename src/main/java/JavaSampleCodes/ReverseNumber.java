package JavaSampleCodes;

public class ReverseNumber {

    public  static void main (String[] args){

        //reversing number with while loop
        /*int num = 1234567;

        int rev= 0;

       while(num != 0){
           rev = rev*10+num%10;
           num = num/10;

       }
       System.out.println(rev);
       */


        //reverisn number with for loop
        int num = 1234567, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
