// class to represent a person
class Person {
    private Department department;

    public Person() {
        this.department = new Department();
    }

    public void printDepartmentManager() {
        System.out.println(department.getManagerName());
    }
}

// class to represent a department
class Department {
    private Manager manager;

    public Department() {
        this.manager = new Manager("John");
    }

    public String getManagerName() {
        return manager.getName();
    }
}

// class to represent a manager
class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DemeterAdherence {

}
