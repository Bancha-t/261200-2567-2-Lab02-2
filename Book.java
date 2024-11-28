public class Book{
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
      } 
    public Book(String title,String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    public void applyDiscount(double discount){
        if(discount > 0 && discount < 100){
            double newPrice = price - (price * discount / 100);
            updatePrice(newPrice);
        }
        else System.out.println("Invalid discount percentage! Must be between 0.0 and 100.0."); 
    }
    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();
    
        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();
        hp1Book.updatePrice(32000.00);
        hp1Book.applyDiscount(-100.0);
        hp1Book.applyDiscount(50);
        hp1Book.displayDetails();
    }
}