
public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Lunev N.V.",
                908756, "Programming",
                "01.12.1986", "89969430044");

        Reader reader2 = new Reader("Ivanov I.I.",
                789788, "Math",
                "01.01.2001", "8998332898");
        Book book1 = new Book("Химия", "Рудзитис");
        Book book2 = new Book("Happy English", "Клементьева");

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(book1);
        System.out.println(book2);
        reader2.takeBook(4);
        System.out.println();
        reader1.takeBook("Геометрия", "Програмирование", "Эконометрика", "Алгебра");
        reader1.returnBook("Геометрия");
        reader2.takeBook(new Book("New book", "New Author"));
        reader2.returnBook(2);
        reader1.takeBook(book1, book2);
        reader1.returnBook(book1);

    }
}