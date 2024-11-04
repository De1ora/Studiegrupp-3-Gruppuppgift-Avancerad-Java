
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    List<User> userList = new ArrayList<>();

    public UserService() {

        userList.add(new User("Bo Shui", 12345, "boshui@mail.com", true, UserClass.Normal_User));
        userList.add(new User("Sandra BackGren", 12346, "sandrabayckgren@mail.com", true, UserClass.Admin));
        userList.add(new User("Lisa Falth", 12347, "lisafalth@mail.com", true, UserClass.Normal_User));
        userList.add(new User("William Enander", 12348, "wiliamenander@mail.com", false, UserClass.Private_User));
        userList.add(new User("Michale Jakcson", 12121, "michalejackson@mail.com", true, UserClass.Admin));
        userList.add(new User("Bolton John", 12349, "boltonjohn@mail.com", false, UserClass.Private_User));

    }

    public List<UserDTO> getActiveAdminUsers(List<User> users) {
        return users.stream()
                .filter(user -> user.isActive() && user.getUserClass() == UserClass.Admin)
                .map(user -> convertToDTO(user))
                .collect(Collectors.toList());
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO(user.getiD(), user.getName(), user.geteMail());
    }

    
}

