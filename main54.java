public class Main {
    public static void main(String[] args) {
        String slowo = "kajak";
        if (czyPalindrom(slowo)) {
            System.out.println(slowo + " jest palindromem.");
        } else {
            System.out.println(slowo + " nie jest palindromem.");
        }
    }

    public static boolean czyPalindrom(String slowo) {
        StringBuilder odwrocone = new StringBuilder(slowo).reverse();
        return slowo.equals(odwrocone.toString());
    }
}
