    import java.util.Scanner;


public class exercitiu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String generatia;
        if (age <= 0) {
            // generatia = "valoare incorecta";
            System.out.println("varsta incorecta");
            return;

        } else if (age < 6) {
            generatia = "alpha";

        } else if (age <= 20) {
            generatia = "z";
        } else {
            generatia = "builders";
        }
        System.out.println("Generatia este: " + generatia);



        //
    }
}

