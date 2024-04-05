public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("David", "Veloza", 100);
        Employee employee2 = new Employee("Nexon", "Forero", 200);

        showInfo(employee1);
        showInfo(employee2);
    }
        public static void showInfo(Employee Employee) {
            System.out.println("The first name is " + Employee.getFirst() + ", and his second name is " + Employee.getlast() + ". His salary is " + Employee.getSalary() );
    }
}
