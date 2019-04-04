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
    protected int sportType;
    protected int material;
    protected double massa;

    public abstract int getSportType();
    public abstract int getMaterial();
    public abstract double getMassa();

    public abstract void init(Scanner scanner);
}
