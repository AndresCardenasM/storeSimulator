import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> shoppingList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingList = new ArrayList<>();
    }

    public boolean launchPurchase(Purchase purchase){
        if (this.balance >= purchase.getCharge() ){
            this.balance -= purchase.getCharge();
            this.shoppingList.add(purchase);
            return true;
        }
            return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getShoppingList() {
        return shoppingList;
    }
}