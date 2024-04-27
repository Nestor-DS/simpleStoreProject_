import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Buy>shoppingList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingList = new ArrayList<>();
    }

    public boolean launchBuy(Buy buy){
        if(this.balance > buy.getValue()){
            this.balance -= buy.getValue();
            this.shoppingList.add(buy);
            return true;
        } else {
            return false;
        }
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Buy> getShoppingList() {
        return shoppingList;
    }
}
