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
    @Override
    public String  toString(){
        return "Title: " + getTitle() + "\n" + "Publication Year: " + getPublicationYear() + "\nAvailable:" +getAvailable() + "\nAuthor: " +getAuthor() + "\nPage Count: " + getPageCount();
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
    @Override
    public String  toString(){
        return "Title: " + getTitle() + "\n" + "Publication Year: " + getPublicationYear() + "\nAvailable:" +getAvailable() + "\nIssue number: "+ getIssueNumber();
    }
}
class DVD extends LibraryItem{
    private int duration;

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public DVD( String title, int publicationYear, String borrower, boolean available, int duration){
        super(title, publicationYear, borrower, available);
        this.duration=duration;
    }
    @Override
    public void borrowItem(String borrower){
        if(!isAvailable()){
            System.out.println("This DVD is already borrowed by someone else!");
        } else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter borrower name: ");
            setBorrower(scanner.nextLine());

            setAvailable(false);
            System.out.println(getBorrower() + " named user borrowed the DVD successfully!");

        }
    }
    @Override
    public void returnItem(){
        if(isAvailable()){
            System.out.println("This DVD is already returned!");
        } else{
            setAvailable(true);
            System.out.println(getBorrower() + "named user returned the DVD successfully!");
        }
    }
    public String  toString(){
        return "Title: " + getTitle() + "\n" + "Publication Year: " + getPublicationYear() + "\nAvailable:" +getAvailable() + "\nDuration: "+ getDuration();
    }
}
public class LibrarySystem {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("Effective Java", 2018, "", true, "Joshua Bloch", 416);
        items[1] = new Magazine("Tech Monthly", 2023, "", true, 45);
        items[2] = new DVD("Inception", 2010, "", true, 148);

        while(true){
            System.out.println("\nLIBRARY SYSTEM");
            System.out.println("1.Borrow an item.");
            System.out.println("2.Return an item.");
            System.out.println("3.View all the items.");
            System.out.println("4.Exit.");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice==4){
                System.out.println("Exiting the library system...");
                break;
            }
            switch(choice){
                case 1:
                    System.out.println("Enter item title: ");
                    String borrowTitle = scanner.nextLine();
                    for (LibraryItem item : items){
                        if ((item.getTitle().equalsIgnoreCase(borrowTitle))){
                            item.borrowItem(""); // Kullanıcıdan ismini isteyip atama yapacak
                            break;
                        }
                    }
                    break;

                case 2: // İade etme
                    System.out.print("Enter item title to return: ");
                    String returnTitle = scanner.nextLine();
                    for (LibraryItem item : items) {
                        if (item.getTitle().equalsIgnoreCase(returnTitle)) {
                            item.returnItem();
                            break;
                        }
                    }
                    break;

                case 3: // Tüm öğeleri görüntüleme
                    System.out.println("\nLibrary Inventory:");
                    for (LibraryItem item : items) {
                        System.out.println(item);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();


    }
}
