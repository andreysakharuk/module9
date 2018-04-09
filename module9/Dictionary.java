package module9;

import java.util.ArrayList;

public class Dictionary extends PrintedEditions{

    private ArrayList<String> listOfTermins = new ArrayList<String>();

    public Dictionary(String type, String format, int numberOfPages, String termin1, String termin2) {
        setType(type);
        setFormat(format);
        setNumberOfPages(numberOfPages);
        listOfTermins.add(0, termin1);
        listOfTermins.add(1, termin2);
    }

    public String toString() {
        return getType() + " Формат = " + getFormat() + " Количество страниц = " + getNumberOfPages() + " Термин1 = " + listOfTermins.get(0)
               + " Термин2 = " + listOfTermins.get(1);
    }

}
