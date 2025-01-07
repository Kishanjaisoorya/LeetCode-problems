class Solution {

    public List<String> stringMatching(String[] words) {
        List<String> matchingWords = new ArrayList<>();
        for (
            int currentWordIndex = 0;
            currentWordIndex < words.length;
            currentWordIndex++
        ) {
            for (
                int otherWordIndex = 0;
                otherWordIndex < words.length;
                otherWordIndex++
            ) {
                if (currentWordIndex == otherWordIndex) continue;
                if (
                    isSubstringOf(
                        words[currentWordIndex],
                        words[otherWordIndex]
                    )
                ) {
                    matchingWords.add(words[currentWordIndex]); 
                    break;
                }
            }
        }

        return matchingWords;
    }

    // Helper function to check if `sub` is a substring of `main`.
    private boolean isSubstringOf(String sub, String main) {
        // Loop through possible starting indices in `main`.
        for (int startIndex = 0; startIndex < main.length(); startIndex++) {
            boolean subFits = true;

            // Check if the substring matches from the current start index.
            for (int subIndex = 0; subIndex < sub.length(); subIndex++) {
                if (
                    startIndex + subIndex >= main.length() ||
                    main.charAt(startIndex + subIndex) != sub.charAt(subIndex)
                ) {
                    subFits = false; // The substring doesn't match.
                    break; // No need to continue further for this start index.
                }
            }

            if (subFits) {
                return true; // Found a match, return true.
            }
        }

        return false; // No match found.
    }
}