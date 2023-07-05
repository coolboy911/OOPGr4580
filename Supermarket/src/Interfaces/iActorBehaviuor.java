package Interfaces;

import Classes.Actor;

/** интерфейс описывающий активность покупателя внутри магазина */
public interface iActorBehaviuor {

    /**
     * получил ли покупатель свой товар
     */
    public boolean isTakeOrder() ;

    /**
     * сделал ли покупатель свой заказ
     */
    public boolean isMakeOrder() ;

    /**
     * установка состояния, что покупатель забрал свой заказ
     * @param takeOrder
     */
    public void setTakeOrder(boolean takeOrder) ;

    /**
     * установка состояния, что покупатель совершил свой заказ
     * @param makeOrder
     */
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    
}
