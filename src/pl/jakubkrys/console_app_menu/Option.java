package pl.jakubkrys.console_app_menu;

public enum Option {
    ADD(1),GET_ALL(2),REMOVE(3);

    private int optionValue;

    Option(int optionValue) {
        this.optionValue = optionValue;
    }

    public int getOptionValue() {
        return optionValue;
    }
}
