package by.itAcademy.Chaplinskaya.lesson10;

public enum Sizes {
    XXS(32) {
        @Override
        public String getDescription() {

            return "Детский размер";

        }
    }, XS(34), S(36), M(38), L(40);

    int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {

            return "Взрослый размер";

    }
}
