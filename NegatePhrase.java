public class NegatePhrase {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NegatePhrase <string1>");
        }
        

        String notarg = args[0].substring(0, 3).equals("not") ? args[0] : "not " + args[0];
        System.out.println(notarg);
        

    }
}
