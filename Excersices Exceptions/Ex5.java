package ExercisesDay7;

class AlsCustomException extends Exception
{
    public AlsCustomException(String s)
    {
        super("Custom Message");
    }
}

class Foo{
    public String getBar(int i)
            throws AlsCustomException
    {
        if (i == 0)
        {

            throw new AlsCustomException("zero ...");
        }
        else
        {
            return "SIU";
        }
    }
}

public class Ex5 {
    public static void main(String[] args) throws Exception {

        Foo foo = new Foo();

        foo.getBar(3);

        try {

            String bar = foo.getBar(1);
        } catch (AlsCustomException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
