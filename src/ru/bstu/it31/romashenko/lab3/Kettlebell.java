package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Kettlebell (Гиря)
 *
 * Назначение:
 *
 */

//TODO: class Kettlebell
public class Kettlebell extends GymEquipment{
    @Override
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
        /*
        1. Мяч
        2. Ракетка
        3. Метательное копье
        4. Тренажерный инвентарь
         */
        System.out.println("Тип спортивного инвентаря: Гиря");
        sportType = 4;
        //
        System.out.println("Название: Гиря");
        name = "Гиря";
        gymType = 2;
        //
        System.out.print("Введите массу в кг: ");
        massa = scanner.nextDouble();
        scanner.nextLine();
        //
        System.out.println("Введите тип материала:");
        System.out.println("\t> 1. Аллюминий.");
        System.out.println("\t> 2. Железо.");
        System.out.println("\t> 3. Стекло.");
        material = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Тип спортивного инвентаря: Штанга"          + "\n" +
                "Название: "                + name          + "\n" +
                "Масса: "                   + massa + " кг" + "\n" +
                "Тип материала: "           + material      + "\n";
    }
}
