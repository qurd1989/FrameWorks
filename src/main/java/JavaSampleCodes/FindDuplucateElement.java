package JavaSampleCodes;

public class FindDuplucateElement {
    public  static void main (String[] args){
        //duplucate String
        String [] arrays = {"got", "wor", "got", "elmar " +
                "deli"};

        for (int i= 0; i<arrays.length; i++){
            for (int j = i+1; j<arrays.length; j++){

                if (arrays[i].equals(arrays[j])){
                    System.out.println("This is the duplucate arrays " + arrays[i]);
                }
            }
        }
    }
}
