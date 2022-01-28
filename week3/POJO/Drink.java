public class Drink {
    private String type;
    private boolean sugar;
    private int price;
    private String temperate;

    public Drink(){
    }

    public Drink(String type, boolean sugar, int price, String temperate) {
        this.type = type;
        this.sugar = sugar;
        this.price = price;
        this.temperate = temperate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTemperate() {
        return temperate;
    }

    public void setTemperate(String temperate) {
        this.temperate = temperate;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", sugar=" + sugar +
                ", price=" + price +
                ", temperate='" + temperate + '\'' +
                '}';
    }
}
