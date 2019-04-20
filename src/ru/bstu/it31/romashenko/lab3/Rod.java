package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Rod (Штанга)
 *
 * Назначение:
 *
 */

public class Rod extends GymEquipment {
    private boolean sbornaya;

    public boolean isSbornaya() {
        return sbornaya;
    }

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
        System.out.println("Тип спортивного инвентаря: Штанга");
        sportType = 4;
        //
        System.out.println("Название: Штанга");
        name = "Штанга";

        gymType = 1;
        //
        super.init(scanner);
        scanner.nextLine();
        //
        System.out.print("Штанга сборная (y/n) ? ");
        String res = scanner.next();
        scanner.nextLine();
        sbornaya = (res.toLowerCase() == "y" || res.toLowerCase() == "д") ? true : false;
    }

    @Override
    public String toString() {
        return "Тип спортивного инвентаря: Штанга"          + "\n" +
                "Название: "                + name          + "\n" +
                "Масса: "                   + massa + " кг" + "\n" +
                "Тип материала: "           + material      + "\n" +
                "Сборная: "                 + sbornaya      + "\n";
    }
}
