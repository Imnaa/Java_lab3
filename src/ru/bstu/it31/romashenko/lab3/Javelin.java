package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Javelin (Метательное копье)
 *
 * Назначение:
 *
 */

//TODO: class Javelin
public class Javelin  extends SportStock {

    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public int getSportType() {
        return sportType;
    }

    @Override
    public double getMassa() {
        return massa;
    }

    @Override
    public int getMaterial() {
        return material;
    }

    @Override
    public void init(Scanner scanner) {
        /*System.out.print("Введите тип спортивного инвентаря: ");
        System.out.print("\t> 1. Мяч. Волейбольный.");
        System.out.print("\t> 2. Мяч. Теннисный.");
        System.out.print("\t> 3. Ракетка.");
        System.out.print("\t> 4. Метательное копье.");
        System.out.print("\t> 5. Тренажерный инвентарь. Штанга.");
        System.out.print("\t> 6. Тренажерный инвентарь. Гиря.");*/
        //
        sportType = 4;
        System.out.print("Введите массу в кг: ");
        massa = scanner.nextDouble();
        System.out.println("Введите тип материала:");
        System.out.print("\t> 1. Аллюминий.");
        System.out.print("\t> 2. Железо.");
        System.out.print("\t> 3. Стекло.");

        material = scanner.nextInt();

    }
}
