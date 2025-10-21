public class Main {
    public static void main(String[] args) {
        FileWriterUtil.writeInputFile();
        CesarShift.encryptFile("input.txt", "encrypted.txt", 19);
        FilePrinter.printFile("encrypted.txt", "Зашифрованный текст из файла:");
        CesarShift.decryptFile("encrypted.txt", "decrypted.txt", 19);
        FilePrinter.printFile("decrypted.txt", "Расшифрованный текст из файла:");
        AlphabetShift.shiftAlphabet(19);
    }
}
