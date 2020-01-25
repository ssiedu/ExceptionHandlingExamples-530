
import sun.nio.cs.ext.Big5;

public class ExSix {
 public static void main(String[] args) {

        int x = 0, y = 0, z = 0;
        try {
            
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            System.out.println(x+","+y);
            if(y>x){
                //ArithmeticException ob=new ArithmeticException();
                BigNumberException ob=new BigNumberException();
                throw ob;
            }
            
            z = x / y;
        }catch (ArithmeticException e) {
            System.out.println("Handling ArthEx");
            z = x / 2;
        }catch(BigNumberException e){
            System.out.println("Second Number Should Be Smaller");
        }

        System.out.println("Result : " + z);
        System.out.println("End of Program.......");
    }    
}
