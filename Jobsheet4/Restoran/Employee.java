public class Employee {
    private String employeeId;
    private String name;
    private String role;

    public Employee(String employeeId, String name, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
    }
    public String getId(){
        return employeeId;
    }
    public void setId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
}