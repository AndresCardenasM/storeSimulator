import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el límite de la tarjeta: ");
        double limit = lectura.nextDouble();
        CreditCard card = new CreditCard(limit);

        int salir = 1;
        while(salir != 0) {
            System.out.println("Escriba la descripción de la compra:");
            String descripcion = lectura.next();

            System.out.println("Escriba el valor de la compra:");
            double valor = Double.valueOf(lectura.next());

            Purchase purchase = new Purchase(valor, descripcion);
            boolean purchaseMade = card.launchPurchase(purchase);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = lectura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(card.getShoppingList());
        for (Purchase compra : card.getShoppingList()) {
            System.out.println(compra.getDescription() + " - " +compra.getCharge());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " + card.getBalance());


    }
}
