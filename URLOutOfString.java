package Main.Kunal;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLOutOfString {

    public static void main(String[] args) {
        String str = "internet address : http://test.com Click this!" + "," + "internet address : http://tes1t.com Click this!";
        List<String> result = new ArrayList<>();
        int counter = 0;
        final Pattern urlPattern = Pattern.compile(
                "(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)"
                        + "(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*"
                        + "[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);

        Matcher matcher = urlPattern.matcher(str);

        while (matcher.find()) {
            result.add(str.substring(matcher.start(1), matcher.end()));
            counter++;
        }
        System.out.println(result);
    }
}
