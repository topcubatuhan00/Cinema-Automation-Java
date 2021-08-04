package MainClasses;

public class Admin extends User{
    private String username;
    private String password;
    
    public Admin(String name,String mail,String phoneNumber,String username,String password){
        super(name,mail,phoneNumber);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
