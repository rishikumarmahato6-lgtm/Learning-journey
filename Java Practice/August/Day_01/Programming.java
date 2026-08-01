public class Programming{
    public static void main(String[] args){

        String name = "Programming";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10));

        // Print every character on a new line 
        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

        
    }
}