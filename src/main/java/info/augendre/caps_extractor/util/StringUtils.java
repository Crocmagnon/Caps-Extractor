package info.augendre.caps_extractor.util;

/**
 * Created on 05/06/15.
 *
 * @author gaugendre
 */
public class StringUtils {
    /**
     * Extracts the upper case characters from the given string.
     * @param s The string where to extract upper case characters.
     * @return The upper case characters found in the given string.
     */
    public static String extractUpperCase(String s) {
        String upperCase = "";
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isUpperCase(current)) {
                upperCase += current;
            }
        }

        return upperCase;
    }
}
