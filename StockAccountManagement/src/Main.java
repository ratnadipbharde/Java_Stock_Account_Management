import java.util.Scanner;

public class Main {
    public static final int ADD = 1;
    public static final int REMOVE = 2;
    public static final int STOCKPRICE = 3;
    public static final int SHOWALLSHARE = 4;
    public static final int EXIT = 0;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stock stock = new Stock();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n1. ADD SHARE\n2. SELL SHARE\n3. STOCK PRICE\n4.SHOW ALL SHARE IN STOCK\n0. Exit\n Enter Your Choice:");
            switch (sc.nextInt()) {
                case ADD:
                    stock.addShare();
                    break;
                case REMOVE:
                    stock.removeShare();
                    break;
                case STOCKPRICE:
                    stock.stockPrice();
                    break;
                case SHOWALLSHARE:
                    stock.showAllShare();
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("invalid input....");
            }
        }
    }
}