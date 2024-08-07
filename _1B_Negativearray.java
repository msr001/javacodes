public class _1B_Negativearray {
    //        ^ remove this _1B_ before runninng
    public static void main(String[] args) {
        try{
            @SuppressWarnings("unused")
            int [] array = new int[-10];
        }
        catch (NegativeArraySizeException Na ) {
            Na.printStackTrace();
        }
        System.out.println("caught exception"  );
    }
    
}
