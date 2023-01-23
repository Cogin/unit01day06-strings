public class ShortLongShort {
    public static void main(String[] args) {
        String output = new String();

        if (args.length != 2) {
            System.out.println("Usage: java ShortLongShort <string1> <string2>");
        }

        output = (args[0].length() < args[1].length()) ? (args[0] + args[1] + args[0]) : (args[1] + args[0] + args[1]);

        System.out.println(output);

    }
}
