package enums;

public enum ProductEnum {
    TR("₺", "TRY", 200, "Toy", "Red"),
    EN("$", "USD", 10, "Toy", "Red");

    public String getSymbol() {
        return symbol;
    }

    public String getCodeAlpha() {
        return codeAlpha;
    }

    public Integer getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductColor() {
        return productColor;
    }

    private final String symbol;
    private final String codeAlpha;
    private final Integer price;
    private final String productName;
    private final String productColor;

    ProductEnum(String symbol, String codeAlpha, Integer price, String productName, String productColor) {
        this.symbol = symbol;
        this.codeAlpha = codeAlpha;
        this.price = price;
        this.productName = productName;
        this.productColor = productColor;
    }
}
