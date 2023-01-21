//1. ФИО,
// 2. номер читательского билета,
// 3. факультет,
// 4. дата рождения,
// 5. телефон.
//6. Методы (экземпляра, без слова static)  takeBook(), returnBook().


import java.util.StringJoiner;
import java.util.Arrays;

class Reader {
    private final String fullName;
    private final int ticketNumber;
    private final String faculty;
    private final String birthday;
    private final String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String birthday, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Information of reader: \n" +
                "FIO - " + fullName + "\n" +
                "Faculty - " + faculty + "\n" +
                "Birthday - " + birthday + "\n" +
                "Phone - " + phoneNumber + "\n";
    }

    public void takeBook(Book... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (Book book : books) {
            sj.add(book.toString());
        }
        System.out.printf("%s взял книги: %s\n", fullName, sj);
    }

    public void returnBook(Book... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (Book book : books) {
            sj.add(book.toString());
        }
        System.out.printf("%s вернул книги: %s\n", fullName, sj);
    }

    public void takeBook(String... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (String book : books) {
            sj.add(book);
        }
        System.out.printf("%s взял книги: %s\n", fullName, sj);
    }

    public void returnBook(String... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (String book : books) {
            sj.add(book);
        }
        System.out.printf("%s вернул книги: %s\n", fullName, sj);
    }

    public void takeBook(int count) {
        String strBook = null;
        if (count == 1) {
            strBook = "книга";
        } else if (count > 1 && count < 5) {
            strBook = "книги";
        } else strBook = "книг";

        System.out.printf("%s взял %s %s\n", fullName, count, strBook);
    }

    public void returnBook(int count) {
        String strBook = null;
        if (count == 1) {
            strBook = "книга";
        } else if (count > 1 && count < 5) {
            strBook = "книги";
        } else strBook = "книг";

        System.out.printf("%s вернул %s %s\n", fullName, count, strBook);
    }


}
