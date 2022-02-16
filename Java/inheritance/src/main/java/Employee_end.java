public class Employee_end {
    private final int employeeID;
    private String name;
    private final String email;
    private double salary;

    public Employee_end(String name, String email, double salary) {
        this.employeeID = (int) (Math.random() * 10000);
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void onBoard() {
        System.out.println(this.name + " setup their laptop");
        System.out.println(this.name + " checked their email");
        System.out.println(this.name + " completed the Degreed security training");
    };

    public void offBoard() {
        System.out.println(this.name + " has been offboarded from TEKsystems.");
    };

    public void grabCoffee() {
        System.out.println(this.name + " got a coffee from the break room.");
    };

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
