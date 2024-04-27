import com.nds.storeProject.PurchaseManager;
import com.nds.storeProject.CreditCard;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta: ");
        double limit = scanner.nextDouble();
        var creditCard = new CreditCard(limit);

        int exit = 1;
        while(exit != 0){
            System.out.println("Escriba la descripción de la compra: ");
            String description = scanner.next();

            System.out.println("Escriba el valor de la compra:");
            double value = Double.valueOf(scanner.next());

            var buy = new PurchaseManager(value, description);
            boolean purchaseMade = creditCard.launchBuy(buy);

            if(purchaseMade){
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                exit = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                exit = 0;
            }
        }
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS:");
        Collections.sort(creditCard.getShoppingList());
        for (PurchaseManager purchaseManager : creditCard.getShoppingList()){
            System.out.println(purchaseManager.getDescription() + " " + purchaseManager.getValue());
        }
        System.out.println("\n********************");
        System.out.println("\nSaldo de la tarjeta: "+creditCard.getBalance());

    }
}
