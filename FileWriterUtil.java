import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterUtil {

    public static void writeInputFile() {
        Path inputPath = Paths.get("input.txt");
        try {
            BufferedWriter writer = Files.newBufferedWriter(inputPath);
            for (int i = 0; i < 2; i++) {
                writer.write("Hello World! Line " + i);
                writer.newLine();
            }
            writer.close();
            System.out.println("✅ Файл input.txt успешно записан.\n");
        } catch (IOException e) {
            System.err.println("❌ ОШИБКА при записи в файл: " + e.getMessage());
        }
    }
}

