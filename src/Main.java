public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(AntlrParser.main(args));

        } catch (java.io.IOException e) {
            System.out.println("IOException");
            System.out.println(e.toString());
        }
    }
}