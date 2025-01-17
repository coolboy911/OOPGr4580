package Classes;

public class SpecialClient extends Actor{
    private int idVip;
    public SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
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

    // @Override
    // public String getName() {
    //     return name;
    // }

    // public int getIdVip() {
    //     return idVip;
    // }
}
