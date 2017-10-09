package module6;

public class Order {
    private long id;
    private Currency currency = Currency.USD;
    private int price;
    private String itemName;
    private String shopIdentifier;
    private User user;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", currency=" + currency +
                ", price=" + price +
                ", itemName='" + itemName + '\'' +
                ", shopIdentifier='" + shopIdentifier + '\'' +
                ", user=" + user +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentifier() {
        return shopIdentifier;
    }

    public void setShopIdentifier(String shopIdentifier) {
        this.shopIdentifier = shopIdentifier;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
