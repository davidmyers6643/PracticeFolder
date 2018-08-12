public abstract class Food extends PizzaTester {

    private int priceInCents;
    private int quantity;

    public abstract void eat();

    public Food(int priceInCents, int quantity) {
        this.priceInCents = priceInCents;
        this.quantity = quantity;



    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
