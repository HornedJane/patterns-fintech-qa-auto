import generators.PersonGenerator;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            result = PersonGenerator.getNewPerson(input).toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}
