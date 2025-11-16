class Employee {
    int emp_id;
    String name;
    String department;
    int salary;

    public Employee(int id, String nm, String dept, int sal) {
        this.emp_id = id;
        this.name = nm;
        this.department = dept;
        this.salary = sal;
    }

    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

}

class Main {
    public static void main(String[] args) {
        Employee eobj1 = new Employee(1, "Ketan", "IT", 23000);
        System.out.println(eobj1);
    }
}
