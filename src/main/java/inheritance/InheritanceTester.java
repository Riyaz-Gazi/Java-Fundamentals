package inheritance;

class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double baseSalary;

    // Parameterized constructor
    Employee(int employeeId, String employeeName, Double baseSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println("Employee details");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
    }

}

class PermanentEmployee extends Employee {
    private String designation;
    private Integer hikePercent;

    PermanentEmployee(int employeeId, String employeeName, Double baseSalary, String designation) {
        super(employeeId, employeeName, baseSalary);
        this.designation = designation;
        this.hikePercent = 12;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getHikePercent() {
        return hikePercent;
    }

    public void calculateSalaryHike() {
        Float salaryHike =  (float) (this.getBaseSalary() * (this.getHikePercent()*0.01));
        System.out.println("Salary Hike: "+salaryHike);
    }

}

class TemporaryEmployee extends Employee {
    private Float servicePeriod;

    TemporaryEmployee(int employeeId, String employeeName, Double baseSalary, Float servicePeriod) {
        super(employeeId, employeeName, baseSalary);
        this.servicePeriod = servicePeriod;
    }

    public Float getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(Float servicePeriod) {
        this.servicePeriod = servicePeriod;
    }

    public void calculateSalaryHike() {
        Float salaryHike =  (float) (this.getBaseSalary() * (this.getServicePeriod()*2*0.01));
        System.out.println("Salary Hike: "+salaryHike);
    }

}

public class InheritanceTester {
    public static void main(String[] args) {
        PermanentEmployee permanentEmp = new PermanentEmployee(101, "John", 28000.0, "Lead");
        permanentEmp.display();
        System.out.println("Designation: " + permanentEmp.getDesignation());
        permanentEmp.calculateSalaryHike();

        System.out.println("----------------");
        TemporaryEmployee tempEmp = new TemporaryEmployee(210, "Ross", 20000.0, 2.5f);
        tempEmp.display();
        System.out.println("Service Duration (in years): " + tempEmp.getServicePeriod());
        tempEmp.calculateSalaryHike();
    }
}

