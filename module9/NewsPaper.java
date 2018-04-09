package module9;

import java.util.ArrayList;

public class NewsPaper extends PrintedEditions{

    private ArrayList<String> news = new ArrayList<String>();

    public NewsPaper(String type, String format, int numberOfPages, String news1, String news2) {
        setType(type);
        setFormat(format);
        setNumberOfPages(numberOfPages);
        news.add(0, news1);
        news.add(1, news2);
    }

    public String toString() {
        return getType() + " Формат = " + getFormat() + " Количество страниц = " + getNumberOfPages() + " Новость1 = " + news.get(0)
               + " Новость2 = " + news.get(1);
    }
}
