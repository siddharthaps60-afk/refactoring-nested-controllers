public class Router {

    public void route(String role) {

        if(role.equals("admin")) {

            AdminController admin = new AdminController();
            admin.dashboard();

        } else {

            UserController user = new UserController();
            user.dashboard();

        }

    }

}