package student.management;

// to handle teacher's information
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int totSalary;

    public Teacher(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        totSalary = 0;
    }
    public void updateTotalMoneySpent(int salary){
        totSalary +=salary;
        School.setTotMoneySpent(salary);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    static int count = 0;
    @Override
    public String toString() {
        return "Teacher - " + ++count + " {id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

}
