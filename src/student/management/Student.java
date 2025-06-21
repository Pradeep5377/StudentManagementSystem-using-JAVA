package student.management;


// to handle student's information.
public class Student {
    private int id;
    private String name;
    private int feesPaid;
    private int fees;
    private int grade;

    public Student(int id,String name,int grade){
        this.feesPaid = 0;
        if(grade<7) this.fees = 30000;
        else this.fees = 45000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void updateTotalMoneyEarned(int currFees) {
        feesPaid += currFees;
        School.setTotMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFees() {
        return fees;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade +
                ", feesPaid=" + feesPaid + ", totalFees=" + fees + "}";
    }

}
