public class User {
    public String username;
    public String password;
    public String email;
    public String name;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "polinema123";
    }

    public void displayInfo(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
    }
}