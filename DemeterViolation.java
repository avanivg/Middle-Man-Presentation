
class Person {

    private Department department;

    public Person() {

        this.department = new Department();

    }

    public void printDepartmentManager() {
        System.out.println(department.getManager().getName());

    }

}

class Department {

    private Manager manager;

    public Department() {

        this.manager = new Manager("John");

    }

    public Manager getManager() {

        return manager;

    }

}

class Manager {

    private String name;

    public Manager(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

}

public class DemeterViolation {

}
