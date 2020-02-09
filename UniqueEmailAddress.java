import java.util.HashSet;
import java.util.Set;
/*
 * id:929
 * runtime: 9ms faster than 99.5%
 */
public class UniqueEmailAddress {
	public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String str : emails) {
            String translated = translate(str);
            set.add(translated);
        }
        return set.size();
    }
    private String translate(String input) {
        char[] a = input.toCharArray();
        int len = a.length;
        int s = 0;
        int f = 0;
        // before @
        while (a[f] != '@') {
           if (a[f] == '.') {
               f++;
           } else if (a[f] == '+') {
               while (a[f] != '@') {
                   f++;
               }
               // the fast node is ahead and reconstruct the arr
           } else {
               a[s++] = a[f++];
           }
        }
        //after @
        while (f < len) {
            a[s++] = a[f++];
        }
        return new String(a, 0, s);
    }
}
