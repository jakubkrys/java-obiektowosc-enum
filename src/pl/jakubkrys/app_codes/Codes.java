package pl.jakubkrys.app_codes;

public enum Codes {
    OPEN(1421),SAVED(1501),TO_PRINT(5101),PRINTED(5102);

    private int value;

    Codes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name().replaceAll("_"," ").toLowerCase();
    }
}
