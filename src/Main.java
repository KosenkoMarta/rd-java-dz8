
public class Main {

    public static void main(String[] args) {

        //Староста та студенти є об'єктами класу студент.
        Student student1 = new Student("Kosenko", "Marta");
        Student student2 = new Student("Lytvynenko", "Vladyslav");
        Student student3 = new Student("Bardak", "Ihor");
        Student student4 = new Student("BardakDelete", "IhorDelete");

        //Завдання є простими рядками (приклад: вивчити інкапсуляцію).
        String task1 = "Подивитись запис вебінару";
        String task2 = "Пройти тест";
        String task3 = "Зробити домашку";


        Group group = new Group(student4);
        //староста (тип студент)
        group.printGroupPresident();
        //додати студента
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.printStudents();
        //видалити студента
        group.deleteStudent(student4);
        group.printGroupPresident();
        group.printStudents();
        //перейменувати студента
        group.renameStudent(student3, "newBardak", "newIhor");
        group.printStudents();
        //додати завдання (для всієї групи)
        group.addListOfTasks(task1);
        group.addListOfTasks(task2);
        group.addListOfTasks(task3);
        group.printTasks();
        //позначити завдання як виконане (для зазначеного студента)
        group.setDoneTasks(task1, student1);
        group.setDoneTasks(task1, student2);
        group.setDoneTasks(task3, student3);
        group.printDoneTasks(task1);
        group.printDoneTasks(task3);
    }
}
