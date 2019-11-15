import static java.lang.System.out;
import static java.lang.System.setOut;

public class Hello {
    public static void main(String[] args) {
        // aici incepe programul
                /*
                un comentariu
                mai lung
                 */

        long age;
        boolean lightOn = false;
        String text = "Hello Java";
        String nimic = null;
        age = 63;
        System.out.println(age);
        System.out.println('H' + 'A'); /* un comentariu */
        System.out.println((100 + age) * 10 / 10);
        System.out.println("-36");
        System.out.println("Hello!");
        System.out.println("Hello" + "Java");
        System.out.println("Hello" + " " + "Java");
        System.out.println(0.64 / 0.3);
        System.out.println(true);
        System.out.println(!!true);
        System.out.println(false);
        System.out.println(100 % 3);
        System.out.println(100 / 3.0);


        int x = 80;
        double y = x;
        System.out.println(x);


        x--;
        System.out.println(x);


        int a = 10;
        int b = a++;
        System.out.println(a++);
        System.out.println(b);


        boolean isRaining = true;
        boolean isSnowing = true;
        boolean isSunny = false;
        boolean IsNotRaining = !isRaining;


        if (isRaining) {
            System.out.println("luam o umbrela");
            System.out.println("Si iesim in ploaie");


        } if (isSunny) {
            System.out.println("luam ochelarii de soare");
        }    if (isSnowing) {
                System.out.println("stam drc acasa");
            } if (isRaining && isSnowing)  {
            System.out.println("nu mi convine");
        }
        if (!isSunny) {
            System.out.println("Tralalala");
        }
            }
        }









