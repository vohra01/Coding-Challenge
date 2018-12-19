/**
 * Created by kv58935 on 12/15/2018.
 */
public class ReverseWords {

    public static void main(String[] args) {
        String s[]="i like this program very much".split(" ");
        String ans="";
        for(int i=s.length - 1; i >= 0; i--) {
            ans+=s[i]+" ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans);
        System.out.println(ans.substring(0,ans.length()-1));    //Will remove white space at te end, add if there are anytestcases you need to match.
        System.out.println(ans.trim()); //This is also easy alternative to above line.
    }
}
