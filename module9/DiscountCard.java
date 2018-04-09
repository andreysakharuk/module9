package module9;


public class DiscountCard extends PrintedEditions{

    private double percentOfDiscount;

    public DiscountCard(String type, String format, int numberOfPages,double percentOfDiscount) {
        setType(type);
        setFormat(format);
        setNumberOfPages(numberOfPages);
        this.percentOfDiscount = percentOfDiscount;
    }

    public String toString() {
        return getType() + " Формат = " + getFormat() + " Количество страниц = " + getNumberOfPages() + " Скидка = " + (percentOfDiscount * 100);
    }
}
