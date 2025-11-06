// Prints a crowd cheering output.

import java.util.List;
import java.util.stream.Collectors;

public class Cheers {
        public static final List<Character> AN_LETTERS = List.of('A', 'E', 'F', 'H',
                        'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'); // Letters who require "an" before them.

        public static void main(String[] args) {
                // Gets the word and number of cheers from the user.
                String word = args[0].toUpperCase();
                int numCheers = Integer.parseInt(args[1]);

                // Creates a list with the given word's letters.
                List<Character> lettersList = word.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                for (Character letter : lettersList) {
                        // Prints the letter with a cheer. Uses "an" for letters from the constant list.
                        String indefiniteArticle = "a  ";
                        if (AN_LETTERS.contains(letter)) {
                                indefiniteArticle = "an ";
                        }
                        String cheerMessage = "Give me " + indefiniteArticle + letter + ": " + letter + "!";
                        System.out.println(cheerMessage);
                }
                System.out.println("What does that spell?");

                // Prints the given word as a cheer the number of times the user wrote.
                int n = 0;
                while (n < numCheers) {
                        System.out.println(word + "!!!");
                        n += 1;
                }
        }
}