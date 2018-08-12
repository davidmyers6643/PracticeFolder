public class PizzaTester {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(5000, 3);
        pizza.eat();
        System.out.println(pizza.getPriceInCents());
    }
}
