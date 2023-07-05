package Classes;

public class OrdinaryClient extends Actor {
    // private boolean setTakeOrder;
    // private boolean setMakeOrder;

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
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
        System.out.println(super.name + " хочет вернуть товар");
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

    // public boolean isSetTakeOrder() {
    //     return setTakeOrder;
    // }

    // public void setSetTakeOrder(boolean setTakeOrder) {
    //     this.setTakeOrder = setTakeOrder;
    // }

    // public boolean isSetMakeOrder() {
    //     return setMakeOrder;
    // }

    // public void setSetMakeOrder(boolean setMakeOrder) {
    //     this.setMakeOrder = setMakeOrder;
    // }

    // @Override
    // public String getName() {
    //     return name;
    // }
}
