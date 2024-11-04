package Uppgift1;

public class User {
    String name;
    int iD;
    String eMail;
    boolean active;
    UserClass userClass;

    public User(String name, int iD, String eMail, boolean active, UserClass userClass) {
        this.name = name;
        this.iD = iD;
        this.eMail = eMail;
        this.active = active;
        this.userClass = userClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserClass getUserClass() {
        return userClass;
    }

    public void setUserClass(UserClass userClass) {
        this.userClass = userClass;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", iD=" + iD + ", eMail=" + eMail + ", active=" + active + ", userClass="
                + userClass + "]";
    }

}
