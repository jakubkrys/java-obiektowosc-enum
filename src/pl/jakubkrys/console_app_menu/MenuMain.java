package pl.jakubkrys.console_app_menu;

public class MenuMain {
    public static void main(String[] args) {

        Option o1 = Option.ADD;
        Option o2 = Option.GET_ALL;
        Option o3 = Option.REMOVE;

        System.out.println("----- App Menu -----");
        System.out.println(o1.getOptionValue()+" - "+o1.name().toLowerCase());
        System.out.println(o2.getOptionValue()+" - "+o2.name().toLowerCase().replaceAll("_","").replace('a','A'));
        System.out.println(o3.getOptionValue()+" - "+o3.name().toLowerCase());

    }
}
