import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private String employeeId;
    private int experience;
    private String designation;
    private double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numOfEmployees = Integer.parseInt(scanner.nextLine());

        Employee[] employees = new Employee[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.printf("Enter details for employee %d:\n", i+1);

            Employee employee = new Employee();

            System.out.print("Enter first name: ");
            employee.setFirstName(scanner.nextLine());

            System.out.print("Enter last name: ");
            employee.setLastName(scanner.nextLine());

            System.out.print("Enter employee ID: ");
            employee.setEmployeeId(scanner.nextLine());

            System.out.print("Enter experience (in years): ");
            employee.setExperience(Integer.parseInt(scanner.nextLine()));

            System.out.print("Enter salary: ");
            employee.setSalary(Double.parseDouble(scanner.nextLine()));

            employees[i] = employee;
        }

        for (Employee employee : employees) {
            String designation = "";
            double hikePercent = 0.0;

            if (employee.getExperience() >= 3 && employee.getExperience() <= 5) {
                designation = "Team Lead";
                hikePercent = 0.1;
            } else if (employee.getExperience() >= 6 && employee.getExperience() <= 10) {
                designation = "Manager";
                hikePercent = 0.2;
            }

            if (designation != "") {
                double hikeAmount = employee.getSalary() * hikePercent;
                double newSalary = employee.getSalary() + hikeAmount;
                employee.setSalary(newSalary);
                employee.setDesignation(designation);
            }

            double monthlySalary = employee.getSalary() / 12;
            double yearlySalary = employee.getSalary();

            System.out.printf("\nEmployee Name: %s %s\n", employee.getFirstName(), employee.getLastName());
            System.out.printf("Employee ID: %s\n", employee.getEmployeeId());
            System.out.printf("Designation: %s\n", employee.getDesignation());
            System.out.printf("Monthly Salary: $%.2f\n", monthlySalary);
            System.out.printf("Yearly Salary: $%.2f\n", yearlySalary);
        }
    }
}
