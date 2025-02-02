public class merge_strings_alternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Interleave characters from both strings
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++)); // Add character from word1
            merged.append(word2.charAt(j++)); // Add character from word2
        }

        // Append remaining characters from word1
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        // Append remaining characters from word2
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrstu";
        String result = mergeAlternately(word1, word2);
        System.out.println(result); // Output: apbqcrstu
    }
}


