import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountHolder {
    private String name;
    private Date birthdate;
    private String nic;

    public AccountHolder(String fullName, Date birthdate, String nic){
        this.name = fullName;
        this.birthdate = birthdate;
        this.nic = nic;
    }

    public void setName(String name){
        if (isValidName(name)){
            this.name = name;
        }
        System.out.println("Invalid Name! Name not set.");
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

    public void setNic(String nic){
        if (nic.length() == 10 || nic.length() == 12){
            this.nic = nic;
            return;
        }
        System.out.println("Invalid NIC! NIC was not set.");

    }

    // check if name consists of a certain pattern using regex
    private boolean isValidName(String name){
        String regex = "^[A-Za-z]+( [A-za-z])+( [A-Za-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches(); // check if the name matched the pattern
    }
}
