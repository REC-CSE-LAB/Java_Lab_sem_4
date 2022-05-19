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

    int Selling_price, quantity;
    static int book_count = 0;
    String Book_category,Author,Title,Publisher;

    BookStore( String title, int quantity ){
        this.Title = title;
        this.quantity = quantity;
        this.Book_category = "Unknown";
        this.Author = "Unknown";
        this.Publisher = "Unknown";
        this.Selling_price = 1000;

        book_count += quantity;
        System.out.println("Title-"+title+" Quantity-"+quantity);
    }

    public static void main(String[] args) {
        BookStore book1 = new BookStore( "Malgudi Days", 20);
        BookStore book2 = new BookStore( "The Cherry Tree", 10);
        BookStore book3 = new BookStore( "Industrial Engineering And Production Management", 15);
        BookStore book4 = new BookStore( "Bose", 30 );
        System.out.println("Total stock available="+book_count);
    }
}

// Output:
//        Title-Malgudi Days Quantity-20
//        Title-The Cherry Tree Quantity-10
//        Title-Industrial Engineering And Production Management Quantity-15
//        Title-Bose Quantity-30
//        Total stock available=75