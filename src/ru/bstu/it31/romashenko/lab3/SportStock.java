package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: SportStock (Спортивный инвентарь )
 *
 * Назначение:
 *
 */

//TODO: class SportStock
abstract public class SportStock {
    protected String name;
    protected int sportType;
    protected int material;
    protected double massa;

    protected abstract int getSportType();
    protected abstract int getMaterial();
    protected abstract double getMassa();
    protected abstract String getName();

    protected abstract void init(Scanner scanner);

    public abstract String toString();
}
