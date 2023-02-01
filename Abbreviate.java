// good
public class Abbreviate {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Abbreviate <string1>");
        }

        String output = new String();


        
        if (args[0].length() < 8) {output = args[0];}
        else {
            output = args[0].substring(0, 2) + "..." + args[0].substring(args[0].length() - 2, args[0].length());
        }
        System.out.println(output);

    }
}
