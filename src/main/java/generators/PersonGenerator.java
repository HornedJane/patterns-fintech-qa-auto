package generators;

import person.Fio;
import person.Person;
import person.Phone;
import person.Physical;
import person.appearance.Appearance;

public class PersonGenerator {

    public static Person getNewPerson(final String input) {
        final int intCode = Integer.parseInt(input);

        final Fio fio = FioGenerator.getNewFio(intCode);
        final Physical physical = PhysGenerator.getNewPhysical(intCode);
        final Appearance appearance = AppearanceGenerator.getNewAppearance(intCode);
        Phone phone = null;
        // добавляем телефон, только если введённый код не палиндром
        if (!input.equals(new StringBuilder(input).reverse().toString())) {
            phone = PhoneGenerator.getNewPhone(intCode);
        }
        return new Person.Builder(input)
                .withFio(fio)
                .withPhysical(physical)
                .withAppearance(appearance)
                .withPhone(phone)
                .build();
    }
}
