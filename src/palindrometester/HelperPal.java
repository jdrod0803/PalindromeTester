/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometester;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author mtsguest
 */
public class HelperPal {
    /**
     * Basically initiates the process of checking if palindrome.
     * Called from driver class.
     * @param llist linked list.
     * @return true if linked list is a palindrome.
     */
    public boolean isPalindrome(LinkedList<String> llist) {
        return newReversedLinkedList(llist).equals(llist);
    }
    /**
     * Creates a new reversed linked list from a give on one.
     * @param input linked list.
     * @return new reversed linked list from the original
     */
    public LinkedList<String> newReversedLinkedList(LinkedList<String> input) {
        LinkedList<String> list = new LinkedList<>();
        Iterator lit = input.descendingIterator();

        while (lit.hasNext()) {
            list.addLast(lit.next().toString());
        }
        return list;
    }
    /**
     * Check if two linked lists are equal.
     * @param llist1 linked list 1
     * @param llist2 linked list 2
     * @return true if the lists are equal.
     */
    public boolean isEqual(LinkedList<String> llist1, LinkedList<String> llist2) {
        return llist1.equals(llist2);
    }

}
