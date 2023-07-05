package Interfaces;

// import Classes.Actor;
/**
 * Интерфейс обработки очереди в супермаркете:
 * может принимать в очередь,
 * выпускать из очереди,
 * принимать заказ,
 * отдавать заказ
 */

public interface iQueueBehaviour {
    /**
     * добавляет клиента в очередь.
     * @param actor название сущности, которая будет добавлена в очередь
     */
    void takeInQueue(iActorBehaviuor actor);

    /**
     * Выпускает из очереди тех, кто уже получил свой заказ
     */
    void releaseFromQueue();

    /**
     * принимает заказ у клиента
     */
    void takeOrder();

    /**
     * отдать заказ клиенту
     */
    void giveOrder();
}
