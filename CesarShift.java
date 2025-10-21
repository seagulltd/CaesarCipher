import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CesarShift {

    public static void encryptFile(String inputFile, String outputFile, int shift) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile));
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(encryptChar((char) c, shift));
            }
            reader.close();
            writer.close();
            System.out.println("✅ Файл успешно зашифрован: " + outputFile + "\n");
        } catch (IOException e) {
            System.err.println("❌ ОШИБКА при шифровании файла: " + e.getMessage());
        }
    }

    public static void decryptFile(String inputFile, String outputFile, int shift) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile));
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(decryptChar((char) c, shift));
            }
            reader.close();
            writer.close();
            System.out.println("✅ Файл успешно расшифрован: " + outputFile + "\n");
        } catch (IOException e) {
            System.err.println("❌ ОШИБКА при расшифровании файла: " + e.getMessage());
        }
    }

    public static void shiftArrayInPlace(char[] arr, int shift) {
        int len = arr.length;
        shift = ((shift % len) + len) % len; // нормализуем
        char[] copy = new char[len];
        for (int i = 0; i < len; i++) {
            copy[(i + shift) % len] = arr[i];
        }
        System.arraycopy(copy, 0, arr, 0, len);
    }

    private static char encryptChar(char c, int shift) {
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) ((c - base + shift) % 26 + base);
        }
        return c;
    }

    private static char decryptChar(char c, int shift) {
        return encryptChar(c, 26 - (shift % 26));
    }
}
