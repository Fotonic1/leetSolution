import java.util.ArrayList;
import java.util.List;

public class P443 {
    public int compress(char[] chars) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        char prev = chars[0];
        for (char c : chars){
            if (c != prev) {
                res.append(c);
                if (count > 1) {
                    res.append(count);
                }
                count = 1;
                prev = c;
            }
            count++;
        }

        res.append(prev);
        if (count > 1) {
            res.append(count);
        }


        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }


        return res.length();
    }
}
