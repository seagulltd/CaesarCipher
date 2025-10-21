import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePrinter {

    public static void printFile(String fileName, String title) {
        System.out.println(title);
        Path path = Paths.get(fileName);
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null && lineCount < 10) {
                System.out.println(line);
                lineCount++;
            }
            reader.close();
            System.out.println();
        } catch (IOException e) {
            System.err.println("❌ ОШИБКА при чтении файла " + fileName + ": " + e.getMessage());
        }
    }
}
