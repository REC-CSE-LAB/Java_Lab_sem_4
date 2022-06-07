// Aim: Define a class called BookStore to maintain the record of books sold. The store contains three
//         categories of books i.e. “Kids”, “Engineering”, and “Story”. The following details should be
//         maintained for each book. Book category, Author, Title, Publisher, Selling price of the book,
//         Quantity. Create a constructor that initializes the Store ID and the rest of the details of the
//         book mentioned above. Include a method named trackSalesStatus that will display the total
//         number of books sold by the store (add a static variable that tracks the total number of books
//         sold). Also, include a method to display the quantity available corresponding to each Book ID.
//         Write a main method to test your class.


package com.College_Java_Lab.Exp_4_Static;

public class BookStore {

    int Selling_price, Quantity;
    static int book_count = 0;
    String Book_category,Author,Title,Publisher;

    BookStore( String title, String author, String publisher, String category, int quantity, int selling_price){
        this.Title = title;
        this.Quantity = quantity;
        this.Book_category = category;
        this.Author = author;
        this.Publisher = publisher;
        this.Selling_price = selling_price;

        book_count += this.Quantity;
    }

    void displayQuantity(){
        System.out.println("Title-"+this.Title+" Quantity-"+this.Quantity);
    }

    static void trackSalesStatus(){
        System.out.println("Total stock available="+book_count);
    }

    public static void main(String[] args) {
        BookStore book1 = new BookStore( "Malgudi Days", "R.K. Narayan","Indian Thought Publications","story", 20, 999);
        BookStore book2 = new BookStore( "The Cherry Tree","Ruskin Bond","Boyds Mills Press", "kids", 10, 175);
        BookStore book3 = new BookStore( "Industrial Engineering And Production Management", "Martand T Telsang", "Global Net Publication", "Engineering", 15, 509);
        BookStore book4 = new BookStore( "Bose","Maj Gen G.D. Bakshi","National Book Trust","story", 30, 980 );

        book1.displayQuantity();
        book2.displayQuantity();
        book3.displayQuantity();
        book4.displayQuantity();

        trackSalesStatus();
    }
}

// Output:
//        Title-Malgudi Days Quantity-20
//        Title-The Cherry Tree Quantity-10
//        Title-Industrial Engineering And Production Management Quantity-15
//        Title-Bose Quantity-30
//        Total stock available=75