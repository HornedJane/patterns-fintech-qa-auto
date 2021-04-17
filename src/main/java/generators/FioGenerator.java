package generators;

import person.Fio;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator {

    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     */

    public static Fio getNewFio(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final int firstNameIndex = getDigitsSum(code / 100);
        final int middleNameIndex = getDigitsSum(code % 100);

        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";

        final String lastName = getLastNameFromFile(lastNameIndex, sex);
        final String firstName = getFirstNameFromFile(firstNameIndex, sex);
        final String middleName = getMiddleNameFromFile(middleNameIndex, sex);

        return new Fio(lastName, firstName, middleName);
    }

    private static String getLastNameFromFile(final int i, final String sex) {
        return getLinesFromFile("lastNames_" + sex).get(i);
    }

    private static String getFirstNameFromFile(final int i, final String sex) {
        return getLinesFromFile("names_" + sex).get(i);
    }

    private static String getMiddleNameFromFile(final int i, final String sex) {
        return getLinesFromFile("middleNames_" + sex).get(i);
    }
}

