package person;

import person.appearance.Appearance;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public static class Builder {
        private final String id;
        private Fio fio;
        private Physical phys;
        private Appearance appearance;
        private Phone phone;

        public Builder(final String id) {
            this.id = id;
        }

        public final Builder withFio(final Fio fio1) {
            this.fio = fio1;
            return this;
        }

        public final Builder withPhysical(final Physical phys1) {
            this.phys = phys1;
            return this;
        }

        public final Builder withAppearance(final Appearance appearance1) {
            this.appearance = appearance1;
            return this;
        }

        public final Builder withPhone(final Phone phone1) {
            this.phone = phone1;
            return this;
        }

        public final Person build() {
            final Person person = new Person();
            person.id = this.id;
            person.fio = this.fio;
            person.phys = this.phys;
            person.appearance = this.appearance;
            person.phone = this.phone;
            return person;
        }

    }

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}