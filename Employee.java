public class Employee {
    private String first_name;
    private String last_name;
    private double salary;

    //Constructor
    public Employee(String first_name, String last_name, double salary){
        this.first_name=first_name;
        this.last_name=last_name;
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }
    public String getFirst() {
        return first_name;
    }
    public String getlast() {
        return last_name;
    }
    public double getSalary() {
        return salary;
    }
}
