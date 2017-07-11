package basket.fruits;

public enum BasketItemEnum {

    APPLE("APPLE", 12.34),
    BANANA("BANANA", 5.4),
    ORANGE("ORANGE", 16),
    PEACHES("PEACHES", 14.23),
    LEMON("LEMON", 3);
    
    private String itemName;
    private double cost;

    private BasketItemEnum(String itemName, double cost) {
        this.itemName = itemName;
        this.cost = cost;
    }

    public String getItemName() {
        return itemName;
    }
    
    public double getCost() {
        return cost;
    }
    
    public static BasketItemEnum getItemEnum(String item) throws Exception {
        BasketItemEnum basketItem = null;
        for (BasketItemEnum itemEnum : BasketItemEnum.values()) {
            if(itemEnum.getItemName().equals(item)){
                basketItem = itemEnum;
            }
        }
        if(basketItem == null) {
            throw new Exception("Invalid Item: " + item);
        }
        return basketItem;
    }

    public static double getCost(BasketItemEnum item) throws Exception {
        double itemCost = 0.00;
        for (BasketItemEnum itemEnum : BasketItemEnum.values()) {
            if (itemEnum == item) {
                itemCost = itemEnum.getCost();
            }
        }
        return itemCost;
    }
}