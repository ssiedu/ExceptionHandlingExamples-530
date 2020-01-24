//user will pass 2 nos from command line args
//this program will divide the 1st no by 2nd one
public class ExOne {
    public static void main(String[] args) {
        
        int x=0, y=0, z=0;
        try{
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            z=x/y;
        }catch(Exception e){//can handle any Exception
            System.out.println("Something Wrong.......");
        }
        System.out.println("Result : " +z );
        System.out.println("End of Program.......");
    }
}
