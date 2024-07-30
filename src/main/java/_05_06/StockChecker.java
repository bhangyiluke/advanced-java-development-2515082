package _05_06;

public class StockChecker {

    private int stock = 20;

    public int getStock() {
        return stock;
    }

    public synchronized void updateStock(int amount) {
        stock -= amount;
    }
}
