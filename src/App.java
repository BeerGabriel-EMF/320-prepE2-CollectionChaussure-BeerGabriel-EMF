import java.util.ArrayList;
import java.util.Collections;
import models.Basket;

public class App {
    public static void main(String[] args) throws Exception {
        Basket basket1 = new Basket("Nike", "AirMax", 42, 120.0);
        Basket basket2 = new Basket("Adidas", "UltraBoost", 42, 130.0);
        Basket basket3 = new Basket("Nike", "AirForce", 40, 100.0);
        Basket basket4 = new Basket("Puma", "Suede", 42, 90.0);
        Basket basket5 = new Basket("Nike", "Cortez", 39, 85.0);

        ArrayList<Basket> baskets = new ArrayList<Basket>();
        baskets.add(basket1);
        baskets.add(basket2);
        baskets.add(basket3);
        baskets.add(basket4);
        baskets.add(basket5);

        Collections.sort(baskets);
        for (Basket basket : baskets) {
            System.out.println(basket);
        }

    }
}
