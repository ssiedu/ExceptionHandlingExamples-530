
public class ExTwo {

    public static void main(String[] args) {

        int x = 0, y = 0, z = 0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Numbers ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient Values ");
        } catch (ArithmeticException e) {
            z = x / 2;
        }

        System.out.println("Result : " + z);
        System.out.println("End of Program.......");
    }
}
