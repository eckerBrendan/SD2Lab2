/*
 * Course: CS1021 - 051
 * Winter 2018
 * Lab 2 - Keeping our Sources Straight
 * Name: Brendan Ecker
 * Created: 12/8/2018
 */
package eckerb;

import java.util.Scanner;

/**
 * This class is a child class of reference.
 * Converts the elements into a String,
 * sets and gets the publisher of the book,
 * and updates the reference.
 */
public class Book extends Reference {
    private String publisher;

    /**
     * Makes a book object and sets the attributes
     * that are passed into it.
     *
     * @param author          The name of the author of the book.
     * @param title           The title of the book.
     * @param publicationYear The year the book was published.
     * @param publisher       The company that published the book.
     */
    public Book(String author, String title, int publicationYear, String publisher) {
        super(author, title, publicationYear);
        this.publisher = publisher;
    }

    /**
     * Converts the attributes into a string.
     *
     * @return A string with all of the attributes and what they are.
     */
    @Override
    public String toString() {
        String output = "@Book{ " + getMyUniqueID();
        output += "\nauthor = " + getAuthor() + ",";
        output += "\ntitle = " + getTitle() + ",";
        output += "\npublisher = " + publisher + ",";
        output += "\nyear = " + getPublicationYear() + "\n";
        return output;
    }

    /**
     * Prompts the user to update one of the references
     * they have added.
     *
     * @param in the scanner that is made in the driver.
     */
    @Override
    public void promptForUpdate(Scanner in) {
        super.promptForUpdate(in);
        System.out.println("Enter the updated publisher for the book");
        setPublisher(in.nextLine());
    }

    /**
     * Gets the publisher of the book.
     *
     * @return a string with the name of the author.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the attribute publisher to the parameter.
     *
     * @param publisher The name of the author of the book.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
