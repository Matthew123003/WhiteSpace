import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Whitespace {

    public static void main(String[] args) throws IOException {
        Whitespace wspc = new Whitespace();

        // for each file "testdata{1,2,3}.txt
        // read in all the text and
        // send it to countBoth

        wspc.countBoth("a b c d e"); // should print 4, 5

    }

    private void countBoth(String testdata) {

        // count the number of whitepace chars and non-whitspace chars.
        // need to use a FOR loop.
        // print the results simply on a line #whitespaces, #ofnonwhitespacechars for each file.
        int whitespaceCount = 0;
        int nonWhitespaceCount = 0;

        // Iterate over each character in the string
        for (int i = 0; i < testdata.length(); i++) {
            char ch = testdata.charAt(i);

            // Check if the character is whitespace
            if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' || ch == '\f') {
                whitespaceCount++;
            } else {
                nonWhitespaceCount++;
            }
        }

        // Print the counts
        System.out.printf("%d, %d\n", whitespaceCount, nonWhitespaceCount);
    }


    // what you CANNOT do is use `Character.isWhitespace()`
    // you have to "write your own" by checking the char against what you think is whitespace
    // you should also USE a FOR loop to step thru each char in the String.
//    private void cannotDoThis(String input) {
//        long wspc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> Character.isWhitespace(c)).count();
//        long nwpsc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> !Character.isWhitespace(new Character(c))).count();
//
//        System.out.printf("%d, %d\n", wspc, nwpsc);
//    }
}
