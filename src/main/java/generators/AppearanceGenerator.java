package generators;

import person.appearance.Appearance;
import person.appearance.hair.Hair;
import person.appearance.hair.LongHair;
import person.appearance.hair.NoHair;
import person.appearance.hair.ShortHair;

import java.util.HashMap;

public class AppearanceGenerator {
    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: по индексу i-1 при i>0 (=0..8).
     *
     * @param code код для генерации
     */
    public static Appearance getNewAppearance(final int code) {
        final String eyes;
        final String hairColor;
        final Hair hair;
        final int i = code % 100 / 10;

        eyes = getEyeColor(i / 2);
        if (i == 0) {
            hair = new NoHair();
        } else {
            hairColor = getHairColor(i);
            hair = (i > 4) ? new LongHair(hairColor) : new ShortHair(hairColor);
        }
        return new Appearance(eyes, hair);
    }

    private static String getEyeColor(final int i) {
        final HashMap<Integer, String> eyeColorMap = new HashMap<>() {{
            put(0, "голубые");
            put(1, "зелёные");
            put(2, "карие");
            put(3, "серые");
            put(4, "разные");
        }};
        return eyeColorMap.get(i);
    }

    private static String getHairColor(final int i) {
        final HashMap<Integer, String> hairColorMap = new HashMap<>() {{
            put(1, "чёрные");
            put(2, "каштановые");
            put(3, "рыжие");
            put(4, "светлые");
            put(5, "седые");
            put(6, "розовые");
            put(7, "зелёные");
            put(8, "фиолетовые");
            put(9, "синие");
        }};
        return hairColorMap.get(i);
    }
}

