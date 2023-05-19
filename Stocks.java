import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        int currentSize = scan.nextInt();
        StockInter listOfStocks[] = new StockInter[capacity];
        String vas[] = new String[4];
        for (int i = 0; i < currentSize; i++) {
            String stockName = scan.next();
            double price = scan.nextDouble();
            StockInter stockGroup = new StockInter(stockName, price);
            listOfStocks[i] = stockGroup;
            System.out.println(listOfStocks[i].toString());
        }
        scan.close();    

    }

}
