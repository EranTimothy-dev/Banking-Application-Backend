import BankExceptions.SalaryException;
import java.util.Date;

public class Employee extends Person {
    private double salary;
    private String position;

    public Employee(String fullName, Date birthdate, String nic, double salary, String position){
        super(fullName, birthdate, nic);
        this.salary = salary;
        this.position = position;
    }

    public void setSalary(double salary) throws SalaryException {
        if (salary > 0){
            this.salary = salary;
            return;
        }
        throw new SalaryException();
    }

    public double getSalary(){
        return this.salary;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return this.position;
    }

    @Override
    public void setRoughIncome(double income){
        // Add bonus to the income based on salary
        double bonus = (income * 20)/100;
        this.roughIncome = income + bonus;
    }

}
