public class ExFive {
 public static void main(String[] args) {

        int x = 0, y = 0, z = 0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        }catch (ArithmeticException e) {
            z = x / 2;
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException  e) {
            System.out.println("Invalid Inputs ");
        }catch (Exception e){
            System.out.println("Unknown Error");
        }  

        System.out.println("Result : " + z);
        System.out.println("End of Program.......");
    }    
}
