import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private final List<PizzaTopping> toppings;

    public PizzaOrder() {
        toppings = new ArrayList<>();
    }

    public void addTopping(PizzaTopping topping) {
        toppings.add(topping);
    }

    public void removeTopping(PizzaTopping topping) {
        toppings.remove(topping);
    }

    public List<PizzaTopping> getToppings() {
        return toppings;
    }

    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();

        // customize pizza order by adding and removing toppings
        order.addTopping(PizzaTopping.PEPPERONI);
        order.addTopping(PizzaTopping.MUSHROOMS);
        order.addTopping(PizzaTopping.EXTRA_CHEESE);
        order.removeTopping(PizzaTopping.MUSHROOMS);

        // print out the selected toppings
        System.out.println("Selected Toppings:");
        List<PizzaTopping> selectedToppings = order.getToppings();
        for (PizzaTopping topping : selectedToppings) {
            System.out.println("- " + topping);
        }
    }
}
