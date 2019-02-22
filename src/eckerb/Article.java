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
 * A subclass of the reference class
 * Sets and gets the attributes of the class,
 * changes the attributes to a string and,
 * updates the reference.
 */
public class Article extends Reference {
    private int endingPage;
    private int startingPage;
    private String journal;

    /**
     * Creates an article object with the attributes
     * that are passed into it.
     *
     * @param author          The name of the author that wrote the article.
     * @param title           The name of the title of the article.
     * @param publicationYear the year the article was published.
     * @param journal         The title of the journal of the article.
     * @param startingPage    The page that the journal starts on.
     * @param endingPage      The page that the journal ends on.
     */
    public Article(String author, String title,
                   int publicationYear, String journal, int startingPage, int endingPage) {
        super(author, title, publicationYear);
        this.journal = journal;
        this.startingPage = startingPage;
        this.endingPage = endingPage;
    }

    /**
     * Converts the attributes into a string.
     *
     * @return A string wiht all of the attributes and what they are.
     */
    public String toString() {
        String output = "@Article{ " + getMyUniqueID();
        output += "\nauthor = " + getAuthor() + ",";
        output += "\ntitle = " + getTitle() + ",";
        output += "\njournal = " + journal + ",";
        output += "\npages = " + startingPage + "-" + endingPage + ",";
        output += "\nyear = " + getPublicationYear() + "\n";
        return output;
    }

    /**
     * Prompts the user to update a reference
     * they have already entered and not
     * change the unique id.
     *
     * @param in the scanner that is created in the driver.
     */
    @Override
    public void promptForUpdate(Scanner in) {
        super.promptForUpdate(in);
        System.out.println("Enter the updated title of the journal.");
        setJournal(in.next());
        System.out.println("Enter the updated starting page.");
        setStartingPage(in.nextInt());
        System.out.println("Enter the updated ending page.");
        setEndingPage(in.nextInt());
    }

    /**
     * Gets the page that the journal ended.
     *
     * @return an int of the page that the journal ends on.
     */
    public int getEndingPage() {
        return endingPage;
    }

    /**
     * Gets the page that the journal starts on.
     *
     * @return an int of the page that the journal starts on.
     */
    public int getStartingPage() {
        return startingPage;
    }

    /**
     * Gets the title of the journal.
     *
     * @return a string that is the title of the journal.
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Sets the page that the journal ended at.
     *
     * @param endingPage an int of the page that the journal ends at.
     */
    public void setEndingPage(int endingPage) {
        this.endingPage = endingPage;
    }

    /**
     * Sets the page that the journal starts on.
     *
     * @param startingPage an int of the page thath the journal starts on.
     */
    public void setStartingPage(int startingPage) {
        this.startingPage = startingPage;
    }

    /**
     * Sets the titele of the journal.
     *
     * @param journal a string that is the title of the journal.
     */
    public void setJournal(String journal) {
        this.journal = journal;
    }
}
