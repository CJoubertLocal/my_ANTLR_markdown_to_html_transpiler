import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        try {
            //https://www.baeldung.com/reading-file-in-java
            //https://www.baeldung.com/java-write-to-file
            Path path = Paths.get(args[0]);

            Stream<String> lines = Files.lines(path);

            String mdTextToTranspile = lines.collect(Collectors.joining("\n"));
            lines.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("html_out.html"));
            writer.write(AntlrParser.transpileMDToHTML(mdTextToTranspile));

            writer.close();

        } catch (java.io.IOException e) {
            System.out.println("IOException");
            System.out.println(e.getMessage());

        }
    }
}