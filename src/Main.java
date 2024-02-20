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
            Path pathToFile = Paths.get(args[0]);
            String pathToImageDirectory = args[1];

            Stream<String> lines = Files.lines(pathToFile);

            String mdTextToTranspile = lines.collect(Collectors.joining("\n"));
            lines.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("html_out.html"));
            writer.write(AntlrParser.transpileMDToHTML(mdTextToTranspile, pathToImageDirectory));

            writer.close();

        } catch (java.io.IOException e) {
            System.out.println("IOException");
            System.out.println(e.getMessage());

        }
    }
}