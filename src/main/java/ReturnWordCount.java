
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        if (in == null || in.trim().isEmpty()) {
            return 0; // Handle null or empty strings
        }
        String[] words = in.trim().split("\\s+"); // Split by one or more spaces
        return words.length;
        
    }
}
