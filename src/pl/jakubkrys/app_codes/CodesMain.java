package pl.jakubkrys.app_codes;

public class CodesMain {
    public static void main(String[] args) {

        Codes code = Codes.TO_PRINT;
        System.out.println(code.getValue());
        System.out.println(code.name());
        System.out.println(code.toString());
    }
}
