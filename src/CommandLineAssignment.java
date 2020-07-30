/*
Accept 5 command line arguments and print them on console. If there's no argument then
print "No Arguments". If there are 1 or 2 or 3 or 4 arguments then print respective no. of arguments.
 */
public class CommandLineAssignment {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No Arguments");
        }
        else{
            System.out.println("no. of arguments are : " + args.length);
            for(int i = 0; i<args.length ; i++){
                System.out.print(args[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
