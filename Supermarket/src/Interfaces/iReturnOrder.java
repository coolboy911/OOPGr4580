package Interfaces;

/**
 * интерфейс позволяющий вернуть деньги за товар если он подлежит гарантии
 */
public interface iReturnOrder {

    /**
     * проверяет наличие гарантии у покупателя
     */
    public boolean isProductWarrantyCase();

    /**
     * назначает есть ли гарантия
     * @param setWarranty где true это гарантия есть
     */
    public void setWarrantyCase(boolean setWarranty);

    /**
     * возвращает товар в магазин
     */
    public void returnProduct();

    /**
     * возвращение средств за товар
     */
    public void getMoneyBack();
}
