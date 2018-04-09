package module9;


public class PrintedEditions {

    private int numberOfPages;
    private String format;
    private String type;

    public PrintedEditions(){
        this("Empty",0,"Empty");
    }

    public PrintedEditions(String type, int numberOfPages, String format){
        this.type = type;
        this.numberOfPages = numberOfPages;
        this.format = format;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
