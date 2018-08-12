public class Pizza extends Food{

    public void eat() {
        System.out.println("Eat that pie!");
    }


    public Pizza(int priceInCents, int quantity) {
        super(priceInCents, quantity);
    }

    public void slice() {
        System.out.println("Slicing pizza...");
    }
}
