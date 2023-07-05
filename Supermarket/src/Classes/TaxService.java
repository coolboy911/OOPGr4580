package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class TaxService implements iActorBehaviuor, iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isProductWarrantyCase;

    public TaxService() {
        this.name = "Tax audit";
    }

     public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    @Override
    public boolean isProductWarrantyCase() {
        return isProductWarrantyCase();
    }

    @Override
    public void setWarrantyCase(boolean setWarranty) {
        this.isProductWarrantyCase = setWarranty;
    }

    @Override
    public void returnProduct() {
        System.out.println(name + " хочет вернуть товар");
        if (isProductWarrantyCase){
            System.out.println("Товар подлежит гарантии");
            getMoneyBack();
        }
        else {
            System.out.println("Товар Возврату не подлежит");
        }
    }

    @Override
    public void getMoneyBack() {
        System.out.println("Денежные средства за товар возвращены");
    }
}
