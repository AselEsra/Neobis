import java.util.Date;

public class Orders {
    private int id;
    private int customerId;
    private int cakeId;
    private int drinkId;
    private Date date;

    public Orders(int id, int customerId, int cakeId, int drinkId, Date date) {
        this.id = id;
        this.customerId = customerId;
        this.cakeId = cakeId;
        this.drinkId = drinkId;
        this.date = date;
    }

    public Orders(int id, int customerId, int cakeId, Date date) {
        this.id = id;
        this.customerId = customerId;
        this.cakeId = cakeId;
        this.date = date;
    }

    public Orders(int id, Date date, int customerId, int drinkId) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.drinkId = drinkId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCakeId() {
        return cakeId;
    }

    public void setCakeId(int cakeId) {
        this.cakeId = cakeId;
    }

    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", cakeId=" + cakeId +
                ", drinkId=" + drinkId +
                ", date=" + date +
                '}';
    }
}
