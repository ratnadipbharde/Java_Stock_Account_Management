import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    ArrayList<Share> shareList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void removeShare() {
        System.out.println("Name of share which u want ti sell : ");
        String sName = sc.next();
        for (int i = 0; i < shareList.size(); i++) {
            Share share = shareList.get(i);
            if (sName.equals(share.getShareName())) {
                shareList.remove(i);
                return;
            }
        }
    }

    public void addShare() {
        System.out.println("how many share want to add : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            Share share = new Share();
            System.out.print("\nShare Name : ");
            share.setShareName(sc.next());
            System.out.println("\nHow Many Share want to purchase of " + share.getShareName() + " : ");
            share.setShareCount(sc.nextInt());
            System.out.println("\n Price of " + share.getShareName() + " : ");
            share.setSharePrice(sc.nextInt());
            shareList.add(share);
        }
    }

    public void stockPrice() {
        int totalPrice = 0;
        for (int i = 0; i < shareList.size(); i++) {
            totalPrice = totalPrice + (shareList.get(i).getSharePrice()*shareList.get(i).getShareCount());
        }
        System.out.println("Total Stock Price : " + totalPrice);
    }

    public void showAllShare() {
        if (shareList.size() == 0) {
            System.out.println("no share purchase yet");
        } else {
            System.out.println("NAME\tQUANTITY\tPRICE");
            for (int i = 0; i < shareList.size(); i++) {
                System.out.println(shareList.get(i));
            }
        }
    }
}

