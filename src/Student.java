public class Student {
    //Написати мінімальний клас студент, який має: ідентифікатор студента (тобто, унікальний), ім'я, прізвище.
    private static int idBase = 0;
    private int id;
    private String lastName;
    private String firstName;


    public Student(String lastName, String firstName) {
        idBase++;
        this.id = idBase;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}



