import java.util.Arrays;

public class Main {

    public static boolean isPalindrome(String str) {
        System.out.println("");
        System.out.println("Start!");
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isEmptyOrWhitespace(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static int countLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static String replaceDigitsWithStars(String input) {
        return input.replaceAll("[0-9]", "*");
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static String longestCommonSubstring(String str1, String str2) {
        int maxLength = 0;
        int endIndex = 0;
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return str1.substring(endIndex - maxLength, endIndex);
    }

    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {

        System.out.println("Завдання 1:");
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));

        System.out.println("\nЗавдання 2:");
        System.out.println(countVowels("hello world"));

        System.out.println("\nЗавдання 3:");
        System.out.println(reverseString("hello"));

        System.out.println("\nЗавдання 4:");
        System.out.println(isEmptyOrWhitespace(""));
        System.out.println(isEmptyOrWhitespace(" "));
        System.out.println(isEmptyOrWhitespace("abc"));

        System.out.println("\nЗавдання 5:");
        System.out.println(countLetters("Hello123!"));

        System.out.println("\nЗавдання 6:");
        System.out.println(countWords("This is a simple sentence"));

        System.out.println("\nЗавдання 7:");
        System.out.println(replaceDigitsWithStars("Hello123"));

        System.out.println("\nЗавдання 8:");
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "world"));

        System.out.println("\nЗавдання 9:");
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abc"));

        System.out.println("\nЗавдання 10:");
        System.out.println(longestCommonSubstring("abcdef", "zbcdf"));
        System.out.println(longestCommonSubstring("hello", "yellow"));

        System.out.println("\nЗавдання 11:");
        System.out.println(containsSubstring("Hello world", "world"));
        System.out.println(containsSubstring("Hello world", "earth"));

        System.out.println("\nЗавдання 12:");
        System.out.println(toUpperCase("hello"));

        System.out.println("\nЗавдання 13:");
        System.out.println(toLowerCase("HELLO"));

        System.out.println();
        System.out.println("Finish!");
    }
}
