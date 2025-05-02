//This was very painful to code
//I don't like boolean things
//But I should learn it so here we are
//Sorry for the yap, I'm still trying to code this with a very limited amount of knowledge about Java and programming in general
//I'm just trying my best to learn, I'm hopeful that these practice codes will help me to improve myself in computer science and programming in general

import java.util.Scanner;

interface Borrowable{
    void borrowItem(String borrower);
    void returnItem();
    boolean isAvailable();
}
abstract class LibraryItem implements Borrowable{
    private String title;
    private int publicationYear;
    private String borrower;
    private boolean available = true;

    public String getTitle(){
        return title;
    }
    public int  getPublicationYear(){
        return publicationYear;
    }
    public boolean getAvailable(){
        return available;
    }
    public String getBorrower(){
        return borrower;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    public void setBorrower(String borrower){
        this.borrower=borrower;
    }
    public String  toString(){
        return "Title: " + getTitle() + "\n" + "Publication Year: " + getPublicationYear() + "\nAvailable:" +getAvailable();
    }
    public LibraryItem(String title, int publicationYear,String borrower, boolean available){
        this.title=title;
        this.publicationYear=publicationYear;
        this.borrower=borrower;
        this.available=available;
    }
    @Override
    public boolean isAvailable(){
        return available;
    }


}
class Book extends LibraryItem{
    private String author;
    private int pageCount;

    public String getAuthor(){
        return author;
    }
    public int getPageCount(){
        return pageCount;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }
    public Book(String title, int publicationYear, String borrower, boolean available, String author, int pageCount){
        super(title, publicationYear, borrower,available);
        this.author=author;
        this.pageCount=pageCount;
    }
    @Override
    public void borrowItem(String borrower){
        if(!isAvailable()){
            System.out.println("This book is already borrowed by someone else!");
        } else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter borrower name: ");
            setBorrower(scanner.nextLine());

            setAvailable(false);
            System.out.println(getBorrower() + " named user borrowed the book successfully!");

        }
    }
    @Override
    public void returnItem(){
        if(isAvailable()){
            System.out.println("This book is already returned!");
        } else{
            setAvailable(true);
            System.out.println(getBorrower() + "named user returned the book successfully!");
        }
    }
}
class Magazine extends LibraryItem{
    private int issueNumber;

    public int getIssueNumber(){
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber){
        this.issueNumber=issueNumber;
    }
    public Magazine(String title, int publicationYear,String borrower, boolean available, int issueNumber){
        super(title, publicationYear, borrower, available);
        this.issueNumber=issueNumber;
    }
    @Override
    public void borrowItem(String borrower){
        if(!isAvailable()){
            System.out.println("This magazine is already borrowed by someone else!");
        } else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter borrower name: ");
            setBorrower(scanner.nextLine());

            setAvailable(false);
            System.out.println(getBorrower() + " named user borrowed the magazine successfully!");

        }
    }
    @Override
    public void returnItem(){
        if(isAvailable()){
            System.out.println("This magazine is already returned!");
        } else{
            setAvailable(true);
            System.out.println(getBorrower() + "named user returned the magazine successfully!");
        }
    }
}
class
public class LibrarySystem {
}
