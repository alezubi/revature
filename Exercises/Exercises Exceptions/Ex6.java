package ExercisesDay7;

class SomeIsAlreadyLogInException extends Exception{

}


class SchoolAuthentificator{

    boolean someoneIsLogIn = false;


    public void logIn(String firstName, String lastName) {

        if (!someoneIsLogIn) {

            if (firstName.equals("Ale") && lastName.equals("Zubi")) {

                System.out.println("Student Record Validated");

                someoneIsLogIn = true;

            } else {
                System.out.println("Student Record is not Validated");
            }

            } else {
            try {
                throw new SomeIsAlreadyLogInException();
            } catch (SomeIsAlreadyLogInException ex) {
                System.out.println("There is someone log in already");
            }
        }

        }

    }


public class Ex6 {
    public static void main(String[] args) {

        SchoolAuthentificator authentification = new SchoolAuthentificator();
        authentification.logIn("Ale","Zubi");
        authentification.logIn("Ale","Zubi");

    }
}
