/**
 *
 * Title:           Linked List of a Palindrome
 * Semester:        COP3804 – Spring 2019
 *
 * @author 6114243(Do NOT Use Your First or Last Name) Instructor: C. Charters
 *
 * Due Date: 04/12/19
 *
 * Introduction to linked lists, reversing linked lists, and comparing objects.
 */
package palindrometester;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mtsguest
 */
public class PalindromeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File myFile;
        Scanner inFile = null;
        String word;
        LinkedList<String> possiblePal;
        HelperPal myPalHelp = new HelperPal();

        try {
            myFile = new File("candidates.txt");
            inFile = new Scanner(myFile);
            while (inFile.hasNext()) {
                word = inFile.next();
                possiblePal = makeLinkedList(word);

                if (myPalHelp.isPalindrome(possiblePal)) {
                    System.out.println(word + " is a Palindrome.");

                } else {
                    System.out.println(word + " is NOT a Palindrome.");
                }

            }

        } catch (IOException e) {
            System.out.println("Sorry, wrong file.  Come back later.");
        } finally {
            if (inFile != null) {
                inFile.close();
            }
        }

    }

    public static LinkedList<String> makeLinkedList(String word) {
        LinkedList<String> list = new LinkedList<>();
        String[] arr = word.split("");
        for(String s : arr){
            list.addLast(s);
        }
        return list;
    }

}
