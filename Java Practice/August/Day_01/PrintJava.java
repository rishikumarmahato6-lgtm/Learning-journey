/*public class PrintJava{
    public static void main(String[]args){
        String name = "Java";

        System.out.println("0 ->" + name.charAt(0));
        System.out.println("1 ->" + name.charAt(1));
        System.out.println("2 ->" + name.charAt(2));
        System.out.println("3 ->" + name.charAt(3));
        
    }
}

 alternate version 
             |
             |
             v
             v
    */
public class PrintJava{
    public static void main(String[] args){

        String name = "Java";
        for(int i = 0; i < name.length(); i++){
            System.out.println(i + " -> " + name.charAt(i));
        }
    }
}



