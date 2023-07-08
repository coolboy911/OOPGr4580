# OOPGr4580
## VendingMachine
with hot drinks
1. Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
2. Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
3. В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

## Supermarket
1. Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции(поле статическое)
2. Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
3. Добавить комментарии(javadoc) ко всем методам и интерфейсам.

(задача со *)
1. Реализовать отказ в обслуживании для акционного клиента при превышении участников акции
2. Сохранить в файл лог работы магазина, включая возвраты товара(реализовать возврат нескольких товаров)

## StudentApp
1. Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
2. Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на кансоль
3. Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль

(задача со *)
1. Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы
2. Переопределить методы ToString классов StudentGroup(выводить идентификатор группы, количество студентов и список студентов) и StudentSteam(выводить номер потока, количество групп и список студентов с указанием идентификатора группы)