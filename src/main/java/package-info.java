/*
 * Singleton:   применён - Controller
 *                       Точка входа в приложение, нужен единственный экземпляр.
 * Factory:     применён - AppearanceGenerator,
 *                         FioGenerator,
 *                         PhoneGenerator,
 *                         PhysGenerator,
 *                         PersonGenerator
 *                       Потому что надо генерировать экземпляры этих классов.
 * Builder:     применён - Person/Builder
 *                       Сложный класс, удобнее создавать по частям + поле phone может быть пустым.
 * Adapter:     не применён
 *                       Отстуствует логика с несовместимыми классами.
 * Bridge:      применён - Person
 *                       Есть логика "Has a" fio, appearance e.t.c.
 * Facade:      применён - Везде и повсюду
 *                       Потому что без сокрытия низкоуровневой логики код был бы абсолютно нечитаемый
 * DTO:         применён - Fio,
 *                         Appearance,
 *                         LongHair,
 *                         NoHair,
 *                         ShortHair,
 *                         Phone,
 *                         Physical,
 *                        Данные классы не содержат в себе логики, их просто надо передавать как атрибуты Person
 * Шаблон:      не применён
 *                       Нету классов с достаточно схожим поведением. Можно было бы создать абстрактный класс
 *                       Generator с методом generate() и реализовать его в генераторах,
 *                       но мне показалось это излишним.
 *
 */