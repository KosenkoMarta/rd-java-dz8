import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    /*
        Написати клас, який репрезентує групу студентів з наступними полями:
        староста (тип студент)
        список студентів (тип студент)
        список завдань
         */
    private Student groupPresident;
    private final List<Student> students = new ArrayList<>();
    private final List<String> listOfTasks = new ArrayList<>();
    private final Map<String, ArrayList<Student>> doneTasks = new HashMap<>();

   public Group(Student groupPresident) {
            this.groupPresident = groupPresident;
   }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student){
        if (students.contains(student)) {
            if (student != this.groupPresident)
                this.students.remove(student);
            else {
                this.students.remove(student);
                this.groupPresident = students.get(1);
            }
        } else System.out.println("no such student in the group");
    }

    public void renameStudent(Student student, String newLastName, String newFirstName) {
        student.setLastName(newLastName);
        student.setFirstName(newFirstName);
    }


    public void addListOfTasks(String task) {
        this.listOfTasks.add(task);
        this.doneTasks.put(task, new ArrayList<Student>());
    }

    public void setDoneTasks(String task, Student student) {
        ArrayList<Student> studentsList = this.doneTasks.get(task);
        studentsList.add(student);
    }

    public void printGroupPresident() {
        System.out.println("Староста: " + groupPresident.getFirstName() + " " + groupPresident.getLastName());
    }

    public void printStudents() {
        System.out.println("Список студентів в группі:");
        for (Student student : this.students) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public void printTasks() {
        System.out.println("Список завдань для групи:");
        for (String task : listOfTasks) {
            System.out.println("- " + task);
        }
    }
    public void printDoneTasks(String task) {
        List<Student> students = this.doneTasks.get(task);
        if (students == null) {
            System.out.println("Жоден учень не виконав завдання " + "'" + task + "'");
        } else {
            System.out.println("Студенти, які виповнили завдання " +  "'" + task + "'" + ":");
            for (Student student : students) {
                System.out.println("- " + student.getFirstName() + " " + student.getLastName());
            }
        }
    }
}
