package acepta.el.reto;

/**
 *
 * @author Alfred
 */
/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs.length > 200) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
