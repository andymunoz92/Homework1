class Instructor{
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }

    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class TextBook{
    private String title;
    private String author;
    private String publisher;

    public TextBook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Accessors
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

    // Mutators
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class Course{
    private String name;
    private Instructor[] instructors;
    private TextBook[] textBooks;

    public Course(String name, Instructor[] instructors, TextBook[] textBooks){
        this.name = name;
        this.instructors = instructors;
        this.textBooks = textBooks;
    }

    public void print(){
        System.out.println("Course name: " + name);
        //System.out.println();

        for(int i = 0; i < instructors.length; i++){
            System.out.print("First name: " + instructors[i].getFirstName());
            System.out.print(", Last name: " + instructors[i].getLastName());
            System.out.print(", Textbook : " + textBooks[i].getTitle());
            System.out.print(", Author: " + textBooks[i].getAuthor());
            System.out.println();
        }
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Instructor[] instructors = {
                new Instructor("Nima", "Davarpanah", "3-2636"),
                new Instructor("Bruce", "Wayne", "4-5678")
        };

        TextBook[] textbooks = {
                new TextBook("Clean Code", "Robert C. Martin", "Prentice Hall"),
                new TextBook("C++", "Professor Xavier", "Addison-Wesley")
        };

        Course course = new Course("Software Engineering", instructors, textbooks);
        course.print();
    }
}