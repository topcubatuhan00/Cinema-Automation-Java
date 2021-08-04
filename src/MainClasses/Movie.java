package MainClasses;

public class Movie {

    private final String title;
    private final String language;
    private final String type;
    private final String publishingDate;
    private final int price;

    public Movie(String title,String language,String type,String publishingDate,int price){
        this.title = title;
        this.language = language;
        this.type = type;
        this.publishingDate = publishingDate;
        this.price = price;
    }

    public String getLanguage() {return language;}
    public String getPublishingDate() {return publishingDate;}
    public String getTitle() {return title;}
    public String getType() {return type;}
    public int getPrice() {return price;}
}
