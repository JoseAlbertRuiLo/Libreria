package libreria;

import java.util.Date;

class Seeder {

    public static void initialize() {

        Author author1 = new Author(new Profile("JK.", "Rowling", new Date()));
        Author author2 = new Author(new Profile("George", "Martin", new Date()));
        Author author3 = new Author(new Profile("J.R.R.", "Tolkien", new Date()));
        Author author4 = new Author(new Profile("Agatha", "Christie", new Date()));
        Author author5 = new Author(new Profile("Stephen", "King", new Date()));
        Author author6 = new Author(new Profile("Harper", "Lee", new Date()));
        Author author7 = new Author(new Profile("Gabriel", "Garcia Marquez", new Date()));

        Book book1 = new Book("9780545162074", "Harry Potter ", author1, new Date(), true);
        Book book2 = new Book("9780553588484", "Juego de Tronos", author2, new Date(), true);
        Book book3 = new Book("9780544003415", "El Hobbit", author3, new Date(), true);
        Book book4 = new Book("9780062693662", "Murder on the Orient Express", author4, new Date(), true);
        Book book5 = new Book("9781501142970", "Eso", author5, new Date(), true);
        Book book6 = new Book("9780061120084", "To Kill a Mockingbird", author6, new Date(), true);
        Book book7 = new Book("9780140278767", "One Hundred Years of Solitude", author7, new Date(), true);

        Client client1 = new Client(new Profile("Alberto","Ruiz",  new Date()));
        Client client2 = new Client(new Profile("Bob", "Smith", new Date()));
        Client client3 = new Client(new Profile("Eva", "Lee", new Date()));
        Client client4 = new Client(new Profile("Jack", "White", new Date()));
        Client client5 = new Client(new Profile("Olivia", "Moore", new Date()));
        Client client6 = new Client(new Profile("Noah", "Taylor", new Date()));
        Client client7 = new Client(new Profile("Ava", "Anderson", new Date()));

        AuthorRepository.addAuthor(author1);
        AuthorRepository.addAuthor(author2);
        AuthorRepository.addAuthor(author3);
        AuthorRepository.addAuthor(author4);
        AuthorRepository.addAuthor(author5);
        AuthorRepository.addAuthor(author6);
        AuthorRepository.addAuthor(author7);

        BookRepository.addBook(book1);
        BookRepository.addBook(book2);
        BookRepository.addBook(book3);
        BookRepository.addBook(book4);
        BookRepository.addBook(book5);
        BookRepository.addBook(book6);
        BookRepository.addBook(book7);

        ClientRepository.addClient(client1);
        ClientRepository.addClient(client2);
        ClientRepository.addClient(client3);
        ClientRepository.addClient(client4);
        ClientRepository.addClient(client5);
        ClientRepository.addClient(client6);
        ClientRepository.addClient(client7);
    }
}
