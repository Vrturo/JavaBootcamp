import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args)
    {
        List<String> myStrings = Arrays.asList(new String[] {"hello", "goodbye", "Brad", "Farr"})

        private static void doForEachString(List<String> strings, String analyzer,
            String subString) {
            for (String s : strings) {
                if (analyzer.analyze(s, "b"))
            }
        }

        doForEachString(myStrings, (x, y) -> {
            if (x.contains(y)) {
                return true;
            }
            return false;
        }, "b");

        @FunctionalInterface
        private interface IStringAnalyzer {
            boolean analyze(String mystring, String subString);
        }

        private static class stringTraverser {
            public boolean analyze(String myString, String substring) {
                return myString.contains(substring);
            }
        }
    }
}