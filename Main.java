package org.example;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Создать класс Сотрудник (Employee).
 * У класса должны быть следующие поля:
 * 1. Возраст (int)
 * 2. Имя (String)
 * 3. Фамилия (String)
 * 4. Зарплата (double)
 * 5. ... можно придумать свои поля
 *
 * У класса должно быть 2 конструктора:
 * 1. Конструктор, который принимает все аргументы
 * 2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)
 *
 * Переопределить:
 * 1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
 * 2. Метод toString (в любом формате)
 *
 * * Реализовать методы:
 * 1. String getFullName() - возвращает полное имя сотрудника
 * 2. boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
 * 3. void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц.
 * Пример: Было 50.0, upgrade(20.0) -> стало 70.0
 */
public class Main {

    public static void main(String[] args) {

        Employee w1 = new Employee(33, "Иван", "Иванов", 77.5, 1);
        Employee w2 = new Employee(35, "Егор", "Ли", 75.1, 2);
        Employee w3 = new Employee(22, "Динар", "Волк", 3);
        Employee w4 = new Employee(11, "Дмитрий", "Медведев", 4);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println(w4.getFullName());
        System.out.println(w2.getFullName());

    }


}