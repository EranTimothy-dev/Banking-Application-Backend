package Users;

import BankExceptions.InvalidFormatException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
    protected String name;
    protected Date birthdate;
    protected String nic;
    protected double roughIncome = 0;

    public Person(String fullName, Date birthdate, String nic){
        this.name = fullName;
        this.birthdate = birthdate;
        this.nic = nic;
    }

    public void setRoughIncome(double income){
        this.roughIncome = income;
    }

    public double getRoughIncome(){
        return this.roughIncome;
    }

    public void setName(String name) throws Exception{
        if (isValidName(name)) {
            this.name = name;
        }
        throw new InvalidFormatException("Invalid name entered! name has characters that are not letters.");
    }

    public String getName(){
        return this.name;
    }

    public void setBirthdate(Date birthdate){
        this.birthdate = birthdate;
    }

    public Date getBirthdate(){
        return this.birthdate;
    }

    public void setNic(String nic) throws Exception{
        if (nic.length() == 10 || nic.length() == 12){
            this.nic = nic;
            return;
        }
        throw new Exception("Invalid NIC! NIC should be 10 or 12 characters long");
    }

    public String getNic(){
        return this.nic;
    }


    // check if name consists of a certain pattern using regex
    public static boolean isValidName(String name){
        String regex = "^[A-Za-z]+( [A-za-z])+( [A-Za-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches(); // check if the name matched the pattern
    }

    public static double calculateTax(double salary){
        if (salary < 100000){
            return 0;
        } else if (salary < 200000) {
            return (salary * 13)/100;
        } else if (salary < 400000) {
            return (salary * 15)/100;
        }
        return (salary * 20)/100;
    }
}
