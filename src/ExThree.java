
public class ExThree {
    public static void main(String[] args) {

        int x = 0, y = 0, z = 0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        }catch (ArithmeticException e) {
            System.out.println("Handling ArthEx");
            
            try{
            z = x / Integer.parseInt(args[2]);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Third No Not Exists");
            }
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient Values ");
        }catch (NumberFormatException e) {
            System.out.println("Invalid Numbers ");
        }  

        System.out.println("Result : " + z);
        System.out.println("End of Program.......");
    }
}
