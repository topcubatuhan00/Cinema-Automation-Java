package MainClasses;

public class GeneralUser extends User{

    private final String username;
    private final String password;

    public GeneralUser(String name,String mail,String phoneNumber,String username,String password){
        super(name,mail,phoneNumber);
        this.username = username;
        this.password = password;
    }

    public String getPassword() {return password;}
    public String getUsername() {return username;}

}
