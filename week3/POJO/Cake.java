public class Cake {
    private String flavour;
    private int price;
    private String frosting;

    public Cake(){

    }

    public Cake(String flavour, int price, String frosting) {
        this.flavour = flavour;
        this.price = price;
        this.frosting = frosting;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrosting() {
        return frosting;
    }

    public void setFrosting(String frosting) {
        this.frosting = frosting;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "flavour='" + flavour + '\'' +
                ", price=" + price +
                ", frosting='" + frosting + '\'' +
                '}';
    }
}
