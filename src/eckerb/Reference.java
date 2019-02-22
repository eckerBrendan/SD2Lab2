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
 * This class creates an object that is stored in an ArrayList in reference holder.
 * It can also set and get the attributes.
 * Also can prompt to update the reference and change the attributes without changing
 * the unique id.
 */
abstract class Reference {
    private static int instanceCount = 0;
    private String author;
    private String myUniqueID;
    private int publicationYear;
    private String title;

    /**
     * Constructs a new Refernce object that can be made into
     * a child class of a book or a article.
     *
     * @param author The name of the author that wrote the reference.
     * @param title The title of the reference.
     * @param publicationYear   The year the reference was published.
     */
    public Reference(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        myUniqueID = "REF" + instanceCount;
        instanceCount += 1;
    }

    /**
     * This asks the user to enter the new elements
     * of the reference and then changes them.
     *
     * @param in the scanner that is made in the driver.
     */
    public void promptForUpdate(Scanner in) {
        System.out.println("Enter the updated author of the reference");
        setAuthor(in.nextLine());
        System.out.println("Enter the updated title of the reference");
        setTitle(in.nextLine());
        System.out.println("Enter the updated copyright year for the reference.");
        setPublicationYear(in.nextInt());

    }

    /**
     * Gets the unique id of the reference.
     *
     * @return a string that is the unique id that is
     * different for every reference.
     */
    public String getMyUniqueID() {
        return myUniqueID;
    }

    /**
     * Gets the author of the reference
     *
     * @return a string that is the author of the reference.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the reference.
     *
     * @param author the name of the author that
     *               wrote the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the year the book was published.
     *
     * @return an int of the year the book was published.
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the year the book was published.
     *
     * @param publicationYear the year that the book was published
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * Gets the title of the reference.
     *
     * @return a string of the title of the reference
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the reference.
     *
     * @param title a string that is the title of the reference.
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
