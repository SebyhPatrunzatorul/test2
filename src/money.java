public class money {
    public static void main(String[] args) {

        int money = 5;
        int chocolate = 0;
        int price = 1;


  /*      while(money > price) {
            chocolate++;
            // money = money - price;
            money -= price;

        }
        System.out.println(chocolate); */

        do {
            chocolate++;
           // money = money - price;
            money -= price;

        } while(money > price);
        System.out.println(chocolate);
    }
}
