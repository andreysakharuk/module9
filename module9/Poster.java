package module9;

public class Poster extends PrintedEditions{

    private String event;

    public Poster(String type, String format, int numberOfPages, String event){
        setType(type);
        setFormat(format);
        setNumberOfPages(numberOfPages);
        this.event = event;
    }

    public String toString(){
        return getType() + " Формат = " + getFormat() + " количество страниц = " + getNumberOfPages() + " событие = " + event;
    }
}
