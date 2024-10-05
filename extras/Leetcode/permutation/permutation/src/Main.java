public class Main {
    public static boolean challenge(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length() - s1.length(); i++) {
            if(matches(s1Count, s2Count)) return true;
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }


        return false;
    }

    private static boolean matches(int[] s1Count, int[] s2Count) {
        for(int i = 0; i < 26; i++) {
            if(s1Count[i] != s2Count[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean result = challenge("ab", "eidbaooo");

        System.out.println(result);
    }
}