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

    public void init(Scanner scanner) {

        //
        System.out.print("Введите массу в кг: ");
        massa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите тип материала:");
        System.out.println("\t> 1. Аллюминий.");
        System.out.println("\t> 2. Железо.");
        System.out.println("\t> 3. Стекло.");
        material = scanner.nextInt();
        scanner.nextLine();
    }

    public abstract String toString();
}
