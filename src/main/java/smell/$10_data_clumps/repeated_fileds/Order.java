package smell.$10_data_clumps.repeated_fileds;

public class Order {

    private Sku sku;

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Order(Sku sku, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.sku = sku;
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }
}

// stock keeping unit 库存保有单位
class Sku {

}
