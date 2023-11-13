public class Main {

    public static int stringChallenge(String str) {

        int maxUniqueChars = 0;


        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    int uniqueChars = countUniqueChars(str.substring(i + 1, j));

                    maxUniqueChars = Math.max(maxUniqueChars, uniqueChars);

                }
              }
           }


        return maxUniqueChars;

    }


    private static int countUniqueChars(String substring) {

        int[] charCount = new int[26]; // Assuming only lowercase alphabetic characters

        int uniqueChars = 0;


        for (char c : substring.toCharArray()) {

            if (charCount[c - 'a'] == 0) {

                uniqueChars++;

                charCount[c - 'a'] = 1;

            }

        }


        return uniqueChars;

    }


    public static void main(String[] args) {

        System.out.println(stringChallenge("ahyjakh"));

        System.out.println(stringChallenge("ghececgkaem")); 

        System.out.println(stringChallenge("abcdefg")); 

    }

}