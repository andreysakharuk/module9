package module9;


public class PostCard extends PrintedEditions {

    private String sender;
    private String recipient;

    public PostCard(String type, String format, int numberOfPages, String sender, String recipient) {
        setType(type);
        setFormat(format);
        setNumberOfPages(numberOfPages);
        this.sender = sender;
        this.recipient = recipient;
    }

    public String toString() {
        return getType() + " Формат = " + getFormat() + " Количество страниц = " + getNumberOfPages() + " Отправитель = " + sender
               + " Получатель = " + recipient;
    }
}
