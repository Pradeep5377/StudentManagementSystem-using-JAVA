package student.management;

import java.util.List;

public class School {
    // ArrayList to handle the objects of Teachers and Student classes
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totMoneySpent;
    private static int totMoneyEarned;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totMoneyEarned = 0;
        totMoneySpent = 0;
    }
    //Setters for both the student and teacher.
    public void addStudent(Student s){
        students.add(s);
    }
    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public int getTotMoneyEarned() {
        return totMoneyEarned;
    }

    public static void setTotMoneyEarned(int MoneyEarned) {
        totMoneyEarned +=MoneyEarned;
    }

    public int getTotMoneySpent() {
        return totMoneySpent;
    }

    public static void setTotMoneySpent(int moneySpent) {
        totMoneyEarned -= moneySpent;
    }
    }
