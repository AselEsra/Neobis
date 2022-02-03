public class Cakes {
    private int id;
    private String name;
    private String flavour;
    private String frosting;
    private int price;

    public Cakes(){
    }

    public Cakes(int id, String name, String flavour, String frosting, int price) {
        this.name = name;
        this.id = id;
        this.flavour = flavour;
        this.frosting = frosting;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFrosting() {
        return frosting;
    }

    public void setFrosting(String frosting) {
        this.frosting = frosting;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", flavour='" + flavour + '\'' +
                ", frosting='" + frosting + '\'' +
                ", price=" + price +
                '}';
    }
}
