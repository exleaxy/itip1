public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " - палиндром.");
            } else {
                System.out.println(s + " не палиндром.");
            }
        }
    }
// отец  цето
    // метод переворачивания строки
    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    // метод для проверки палиндрома
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
