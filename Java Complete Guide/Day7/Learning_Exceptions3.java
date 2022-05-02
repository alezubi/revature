package Day7;

class AlreadyLogInException extends Exception{

}

class Authentication{

    private boolean logInAlready = false;

    public void login(String email, String password) {

        if (!logInAlready) {

            if (email.equals("Admin") & password.equals("123")) {
                System.out.println("Log in Succesfully");
               logInAlready = true;
            } else {
                System.out.println("Wrong Information, try again");
            }
        } else {
            try {
                throw new AlreadyLogInException();
            } catch (AlreadyLogInException e) {
                System.out.println("Someone is already logged in");
            }
        }

    }

}

public class Learning_Exceptions3 {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();
        authentication.login("Admin","123");
        authentication.login("Admin","123");

    }
}
