import java.util.*;

//assume c19 = course
public class c19 {
    TextBook textBook;
    Lecturer lecturer;
    String courseName;

    public void Course(String name, TextBook textbook, Lecturer lecturer) {
        this.courseName = name;
        this.textBook = textbook;
        this.lecturer = lecturer;
    }

    public String getCourseString() {
        return courseName;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Course Name: ");
        String courseName = input.nextLine();
        // Create a object
        TextBook textBook = new TextBook(null, null, null);
        Lecturer lecturer = new Lecturer(null, null, null);

        // Initialize the CreditCard using the void method
        c19 course = new c19();
        course.Course(courseName, textBook, lecturer);
        input.close();
    }
}

class TextBook {
    String title, author, publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}

class Lecturer {
    String name, surname, officeNumber;

    public Lecturer(String name, String surname, String officeNumber) {
        this.name = name;
        this.surname = surname;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}