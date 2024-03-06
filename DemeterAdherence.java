//class to define Employee object
class Employee {

    private Department department = new Department();
    private Manager manager;

    Employee(Manager manager) {
        this.manager = manager;
    }

    void submitExpense(Expenses expenses) {
        manager.approveExpense(expenses);
    }

    public Department getDepartment() {
        return department;
    }
}

// class to define Department object
class Department {
    private Manager manager = new Manager();

    public Manager getManager() {
        return manager;
    }
}

// Manager object
class Manager {
    public void approveExpense(Expenses expenses) {
        System.out.println("Total amounts approved" + expenses.total());
    }
}

class Expenses {

    private double total;
    private double tax;

    public Expenses(double total, double tax) {
        this.total = total;
        this.tax = tax;
    }

    public double total() {
        return total + tax;
    }
}

public class DemeterAdherence {
    public static void main(String args[]) {
        Expenses expenses = new Expenses(100, 10);

        Manager mgr = new Manager();
        Employee employee = new Employee(mgr);

        employee.submitExpense(expenses);
    }

}
