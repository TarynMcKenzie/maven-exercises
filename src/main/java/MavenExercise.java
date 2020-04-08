
// TODO: The goal for this exercise is to get familiar with Maven, adding dependencies to your project, and using those dependencies.

// TODO: 1. Create a new Maven project named maven-exercises.

// TODO: 2. Add the Apache Commons Lang library to your project.
//          This is a utility library for many different things; we will use it specifically for String manipulations, which is available through the StringUtils class.

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercise {

    // TODO: 3. Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//          a. Tells whether or not what the user entered is a number
//          b. Flips the case of the string
//          c. Reverses the string

// Example Console Output:

// Enter Something: Life, The Universe, and Everything
// You Entered: "Life, The Universe, and Everything"
// "Life, The Universe, and Everything" is not a number
// Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
// Reversed: gnihtyrevE dna ,esrevinU eht ,efiL

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of input are you feeling today?");

        String userInput = scanner.nextLine();

        System.out.println("You have entered: \"" + userInput + "\"");

        if (!StringUtils.isNumeric(userInput))
            System.out.println("\"" + userInput + "\" is not a number");

        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }


// TODO: 1. As always make sure you add, commit and push your changes to a new repo to github.
}
