package Uppgift1;

public class UserDTO {

    private int iD;
    private String name;
    private String email;

    public UserDTO(int iD, String name, String email) {
        this.iD = iD;
        this.name = name;
        this.email = email;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO [iD=" + iD + ", name=" + name + ", email=" + email + "]";
    }

}
