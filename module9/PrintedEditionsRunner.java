package module9;

import java.util.ArrayList;

public class PrintedEditionsRunner {

    public static void main(String args[]) {

        ArrayList<PrintedEditions> printedEditions = new ArrayList<PrintedEditions>();
        printedEditions.add(new Poster("Плакат","A1", 1, "Concert"));
        printedEditions.add(new PostCard("Почтовая открытка","A5", 1, "Petrov", "Ivanov"));
        printedEditions.add(new NewsPaper("Газета","A3", 20, "новость номер1", "новость номер2"));
        printedEditions.add(new DiscountCard("Скидочная карта","A7", 1, 0.15));
        printedEditions.add(new Dictionary("Словарь","A4", 140, "термин1", "термин2"));

        for (PrintedEditions printEdition :printedEditions) {
            System.out.println(printEdition.toString());
        }
    }

}
