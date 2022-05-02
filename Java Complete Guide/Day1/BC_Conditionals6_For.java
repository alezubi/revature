package Day1;

public class BC_Conditionals6_For {
    public static void main(String[] args) {
        int i, j, row = 8;

        for (i=0; i<row; i+=2)
        {

            for (j=row-i; j>1; j--)
            {

                System.out.print(" ");
            }

            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
