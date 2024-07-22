public class CharacterCount {
    public static void main(String[] args) {
        String str = "valorant";
        int count = 0;

        // Loop through the string and count each character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') { // Optional: Exclude spaces from the count
                count++;
            }
        }

        System.out.println("Total number of characters: " + count);
    }
}
