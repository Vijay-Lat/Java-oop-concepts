public class StocksList {
    private String stockName;
    private double price;
    private int capacity;
    private int currentSize;

    public StocksList(int capacity, int currentSize, String stockName, double price) {
        this.capacity = capacity;
        this.currentSize = currentSize;
        this.stockName = stockName;
        this.price = price;

    }

}
