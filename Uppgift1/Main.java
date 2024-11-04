
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {

        UserService us = new UserService();

        List<UserDTO> dtoList = us.getActiveAdminUsers(us.userList);

        dtoList.forEach(System.out::println);
    }
}
