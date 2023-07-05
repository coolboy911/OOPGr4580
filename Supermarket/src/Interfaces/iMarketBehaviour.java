package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * интерфейс работы супермаркета:
 * позволяет запускать посетителей,
 * выпускать посетителей,
 * обновлять статус очередей
 */
public interface iMarketBehaviour {
    /**
     * добавляет посетителя в супермаркет
     * @param actor название посетителя которого нужно добавить
     */
    void acceptToMarket(iActorBehaviuor actor);

    /**
     * убирает посетителя из супермаркета
     * @param actor название посетителя которого нужно убрать
     */
    void releaseFromMarket(List<Actor> actor);
    
    /**
     * обновляет деятельность внутри супермаркета
     */
    void update();
}
