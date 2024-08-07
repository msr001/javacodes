public class _2B_Nullpointer {
    //        ^ remove this _2B_ before runninng
    public static void main(String[] args) {
        String city = null;

        try{
            if(city.equals("Banglore")){
                System.out.println("Ture is equal");
            }
            else{
                System.out.println("False its not ture ");
            }
        }
        catch(NullPointerException e){
            System.out.println("Null pointer caught ");
        }
        finally{
            System.out.println("Post catching process in the house ");
        }

    }
    
}
