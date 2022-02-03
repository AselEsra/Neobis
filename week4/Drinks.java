public class Drinks {
    private int id;
    private String name;
    private boolean sugar;
    private String temperate;
    private int price;

    public Drinks(){
    }

    public Drinks(int id, String name, boolean sugar, String temperate, int price) {
        this.id = id;
        this.name = name;
        this.sugar = sugar;
        this.temperate = temperate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public String getTemperate() {
        return temperate;
    }

    public void setTemperate(String temperate) {
        this.temperate = temperate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sugar=" + sugar +
                ", temperate='" + temperate + '\'' +
                ", price=" + price +
                '}';
    }
}
