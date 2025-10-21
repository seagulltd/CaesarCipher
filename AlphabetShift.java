{

    public static void shiftAlphabet(int shift) {
        char[] letters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        try {
            CesarShift.shiftArrayInPlace(letters, shift);
            System.out.print("Сдвинутый алфавит: ");
            for (char c : letters) {
                System.out.print(c);
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.err.println("❌ ОШИБКА при сдвиге алфавита: " + e.getMessage());
        }
    }
}
