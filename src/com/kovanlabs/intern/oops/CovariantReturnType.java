package com.kovanlabs.intern.oops;

class Book {
    Book getBook(){
        return new Book();
    }

}
class BookValidation extends Book{
    BookValidation getBook(){
        return new BookValidation();
    }
}

public class CovariantReturnType {
}
