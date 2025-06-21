package student.management;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Sample teacher added
        Teacher t = new Teacher(1, "Prince", 1000);
        Student s = new Student(1,"Pradeep",10);
        teacherArrayList.add(t);
        studentArrayList.add(s);
        // Create school object with student and teacher lists
        School school = new School(teacherArrayList, studentArrayList);


        System.out.println("📚 Welcome to the Student Management System 📚");
        System.out.println("===============================================");

        while(true){
            System.out.println("\nChoose an Option:");
            System.out.println("1. Admin");
            System.out.println("2. User");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Enter Password: ");
                int pass = sc.nextInt();
                if(pass == 5377){
                    System.out.println("Choose an Option:");
                    System.out.println("1. View All Teachers");
                    System.out.println("2. Add a Teacher");
                    System.out.println("3. Increment Salary");
                    System.out.println("4. View School Financials");
                    System.out.println("5. Exit");
                    int cho = sc.nextInt();
                    switch (cho){
                        case 1:
                            if(teacherArrayList.isEmpty()){
                                System.out.println("No Teachers added yet.");
                            }
                            else {
                                for(Teacher teach : teacherArrayList){
                                    System.out.println(teach);
                                }
                            }
                            break;

                        case 2 :
                            System.out.print("Enter Teacher ID: ");
                            int id = sc.nextInt();
                            sc.nextLine(); // consume newline

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Salary: ");
                            int salary = sc.nextInt();

                            Teacher tobj = new Teacher(id, name, salary);
                            teacherArrayList.add(tobj);
                            System.out.println("✅ Teacher added successfully.");
                            break;

                        case 3:
                            System.out.print("Enter Teacher ID to Increment Salary: ");
                            int payId = sc.nextInt();
                            Teacher found = null;
                            for (Teacher teacher : teacherArrayList) {
                                if (teacher.getId() == payId) {
                                    found = teacher;
                                    break;
                                }
                            }
                            if (found == null) {
                                System.out.println("❌ Teacher not found.");
                            } else {
                                System.out.print("Enter amount to Increment Salary: ");
                                int amount = sc.nextInt();
                                found.updateTotalMoneySpent(amount);
                                System.out.println("💰 Salary Incremented successfully.");
                            }
                            break;

                        case 4:
                            System.out.println("📊 School Financial Summary:");
                            System.out.println("Total Money Earned: ₹" + school.getTotMoneyEarned());
                            System.out.println("Total Money Spent on Salaries: ₹" + school.getTotMoneySpent());
                            break;

                        case 5:
                            System.out.println("👋 Exiting Student Management System.");
                            sc.close();
                            System.exit(0);

                        default:
                            System.out.println("⚠️ Invalid choice. Try again.");
                    }
                }
                else{
                    System.out.println("❌ Password is Wrong. Please Try again Later");
                }
            }
            else if(ch==2) {
                while (true) {
                    System.out.println("\n==============================");
                    System.out.println("Choose an Option:");
                    System.out.println("1. View All Students");
                    System.out.println("2. Add a Student");
                    System.out.println("3. Pay Fees");
                    System.out.println("4. View School Financials");
                    System.out.println("5. Exit");
                    System.out.println("==============================");
                    System.out.print("Enter your choice: ");

                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            if (studentArrayList.isEmpty()) {
                                System.out.println("No students added yet.");
                            } else {
                                for (Student student : studentArrayList) {
                                    System.out.println(student);
                                }
                            }
                            break;

                        case 2:
                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();
                            sc.nextLine(); // consume newline

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Grade (1-12): ");
                            int grade = sc.nextInt();

                            Student sobj = new Student(id, name, grade);
                            studentArrayList.add(sobj);
                            System.out.println("✅ Student added successfully.");
                            break;

                        case 3:
                            System.out.print("Enter Student ID to Pay Fees: ");
                            int payId = sc.nextInt();
                            Student found = null;
                            for (Student stuobj: studentArrayList) {
                                if (stuobj.getId() == payId) {
                                    found = stuobj;
                                    break;
                                }
                            }
                            if (found == null) {
                                System.out.println("❌ Student not found.");
                            } else {
                                System.out.print("Enter amount to pay: ");
                                int amount = sc.nextInt();
                                found.updateTotalMoneyEarned(amount);
                                System.out.println("💰 Fees paid successfully.");
                                int pendingFees = found.getFees() - found.getFeesPaid();
                                System.out.println("Pending Fees : "+ pendingFees);
                            }
                            break;

                        case 4:
                            System.out.println("📊 School Financial Summary:");
                            System.out.println("Total Money Earned: ₹" + school.getTotMoneyEarned());
                            System.out.println("Total Money Spent on Salaries: ₹" + school.getTotMoneySpent());
                            break;

                        case 5:
                            System.out.println("👋 Exiting Student Management System.");
                            sc.close();
                            System.exit(0);

                        default:
                            System.out.println("⚠️ Invalid choice. Try again.");
                    }
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }

    }
}
