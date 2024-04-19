public class Purchase implements Comparable<Purchase>{
    private double charge;
    private String description;

    public Purchase(double charge, String description) {
        this.charge = charge;
        this.description = description;
    }

    public double getCharge() {
        return charge;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Purchase: Charge= " + charge +
                "Description= " + description;
    }

    @Override
    public int compareTo(Purchase otherPurchase) {
        return Double.valueOf(this.charge).compareTo(otherPurchase.getCharge());
    }
}
