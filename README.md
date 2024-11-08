#Homework 3
Abstract Classes
Book
Book will consist of four fields:
• title (string)
• author (string)
• ISBN (string)
• is_checked_out (bool)
Book will contain two methods:
• check_out() – mark the book as checked_out.
• return_book() – mark the book as returned.
• describe() – return a string indicating the type of book. This method will change
functionality in the derived classes.
Person
Person will consist of two fields:
• name (string)
• id (string) – this will be interpreted as a staff ID or member ID based on the
derived class
Person will contain one method:
• describe() – return a string indicating the type of book. This method will change
functionality in the derived classes.
Concrete Classes
Member, derived from Person
Member does not contain extra methods, functions, or fields.
Staff, derived from Person
Staff adds two methods:
• register_member(library, member) – adds a new member to the library.
• register_book(library, book) – adds a new book to the library.
Fiction, derived from Book
Fiction does not contain extra methods, functions, or fields.
NonFiction, derived from Book
NonFiction does not contain extra methods, functions, or fields.
Library
Library will contain three fields:
• books – list of books
• members – list of members
• staff – list of staff
Library will contain five methods:
• add_book(Book) – adds a new book to the library.
• register_member(Member) adds a new member to the library.
• List_books() – print a list of all books.
• List_member() – print a list of all members.
• List_staff() – print a list of all staff.
