package OtherProjects.hust.soict.ict.lab02;

public class Cart {
    public static final int MAX_NUMBER_ORDER = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 20) {
            System.out.println("The cart is almost full");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++){
            if (this.itemsOrdered[i].equals(disc)){
                for (int j = i; j < qtyOrdered - 1; j++){
                    this.itemsOrdered[j]=this.itemsOrdered[j+1];
                }
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("Cannot find. No disc have been removed");
    }

    public float totalCost(){
        float cost = 0;
        for (int i=0; i<qtyOrdered; i++){
            cost += this.itemsOrdered[i].getCost();
        }
        return cost;
    }
}
