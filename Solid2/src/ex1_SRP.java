/*
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
*/
public class ex1_SRP {
    public static void main(String[] args) {
        Employee emp1 = new Employee("bob", "2001.01.01", 5000);

        NetSalary netSalary = new NetSalary();
        int emp1TotalSalary = netSalary.calculateNetSalary(emp1.getBaseSalary());
    }
}

/**
 * сущность работник
 */
class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}

/**
 * сущность обработки выплат
 */
class NetSalary {
    public final int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}



