/*
 * Course: CS1021 - 051
 * Winter 2018
 * Lab 2 - Keeping our Sources Straight
 * Name: Brendan Ecker
 * Created: 12/8/2018
 */
package eckerb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class creates and Array list and adds references to it.
 * Also turns the references in the Array list into a string.
 * Also can update the references.
 */
public class ReferenceHolder {
    private ArrayList<Reference> references = new ArrayList<>();

    /**
     * The constructor of the reference holder.
     */
    public ReferenceHolder() {
    }

    /**
     * Adds a refernce of a book to the ArrayList.
     *
     * @param book A book with specidied parameters.
     */
    public void addReference(Book book) {
        references.add(book);
    }

    /**
     * Adds a reference of an article to the ArrayList.
     *
     * @param article An article with specified parameters.
     */
    public void addReference(Article article) {
        references.add(article);
    }

    /**
     * This method gets the reference at
     * the specified index and changes its
     * elements
     *
     * @param uniqueID The index of the reference in the ArrayList
     * @param in       The scanner that is made in the driver.
     */
    public void updateReference(String uniqueID, Scanner in) {
        String id = uniqueID.substring(3);
        int index = Integer.parseInt(id);
        references.get(index).promptForUpdate(in);
    }

    /**
     * Turns the references in the ArrayList into Bibtex format.
     *
     * @return The elements in a string for every reference in the ArrayLists.
     */
    public String toString() {
        String output = " ";
        for (int i = 0; i < references.size(); i++) {
            output += references.get(i).toString();
        }
        return output;
    }
}
