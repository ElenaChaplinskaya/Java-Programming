package by.itAcademy.Chaplinskaya.lesson10;

public enum Sizes {
    XXS(32) {
        @Override
        public String getDescription(int euroSize) {
            String s = null;
            if (euroSize == 32) {
                s = "Детский размер";
            }
            return s;
        }
    }, XS(34), S(36), M(38), L(40);

    int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(int euroSize) {
        String s = null;
        if (euroSize <= 34 || euroSize >= 40) {
            s = "Взрослый размер";
        }
        return s;
    }
}
