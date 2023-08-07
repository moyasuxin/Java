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
        System.out.println("Enter Textbook Title: ");
        String textBookName = input.nextLine();
        System.out.println("Enter Textbook Author Name: ");
        String textBookAuthor = input.nextLine();
        System.out.println("Enter Textbook Publisher: ");
        String textBookPublisher = input.nextLine();
        System.out.println("Enter Lecturer Name: ");
        String Lecturer = input.nextLine();
        System.out.println("Enter Lecturer surname: ");
        String LecturerSurname = input.nextLine();
        System.out.println("Enter Lecturer Phone number: ");
        int LecturerPhone = input.nextInt();
        // Create a object
        TextBook textBook = new TextBook(textBookName, textBookAuthor, textBookPublisher);
        Lecturer lecturer = new Lecturer(Lecturer, LecturerSurname, LecturerPhone);

        // Initialize the CreditCard using the void method
        c19 course = new c19();
        course.Course(courseName, textBook, lecturer);
        // output
        System.out.println("=========================" + "Course" + "=========================");
        System.out.println("Course Name: " + course.getCourseString());
        System.out.println("Course Textbook: " + course.getTextBook().getTitle());
        System.out.println("Course Lecturer: " + course.getLecturer().getName());
        System.out.println("=========================" + "=========================");
        System.out.println("=========================" + "Textbook details" + "=========================");
        System.out.println("Textbook Author: " + course.getTextBook().getAuthor());
        System.out.println("Textbook Publisher: " + course.getTextBook().getPublisher());
        System.out.println("=========================" + "=========================");
        System.out.println("=========================" + "Lecturer" + "=========================");
        System.out.println(
                "Lecturer Full Name: " + course.getLecturer().getName() + " " + course.getLecturer().getSurname());
        System.out.println("Lecturer Surname: " + course.getLecturer().getSurname());
        System.out.println("Lecturer Phone Number: " + course.getLecturer().getOfficeNumber());
        System.out.println("=========================" + "=========================");
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
    String name, surname;
    int officeNumber;

    public Lecturer(String name, String surname, int officeNumber) {
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

    public int getOfficeNumber() {
        return officeNumber;
    }
}