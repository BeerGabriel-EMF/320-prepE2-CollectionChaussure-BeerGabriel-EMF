import java.util.ArrayList;
import java.util.Comparator;

import models.Basket;

public class App {
    public static void main(String[] args) throws Exception {
        Basket basket1 = new Basket("Nike", "AirMax", 42, 120.0);
        Basket basket2 = new Basket("Adidas", "UltraBoost", 42, 130.0);
        Basket basket3 = new Basket("Nike", "AirForce", 40, 100.0);
        Basket basket4 = new Basket("Puma", "Suede", 42, 90.0);
        Basket basket5 = new Basket("Nike", "Cortez", 39, 85.0);

        ArrayList<Basket> baskets = new ArrayList<>();
        baskets.add(basket1);
        baskets.add(basket2);
        baskets.add(basket3);
        baskets.add(basket4);
        baskets.add(basket5);

        // fait avec l'aide de chatgpt car je restait vraiment bloqué et que je n'avais
        // plus le temps.
        baskets.sort(Comparator.comparingInt(Basket::getTaille).thenComparingDouble(Basket::getPrix));
        System.out.println("Tri par taille puis par prix :");
        baskets.forEach(System.out::println);

        baskets.sort(Comparator.comparing(Basket::getMarque)
                .thenComparing(Basket::getNom)
                .thenComparingDouble(Basket::getPrix));
        System.out.println("\nTri par marque, nom puis prix :");
        baskets.forEach(System.out::println);
    }

}
