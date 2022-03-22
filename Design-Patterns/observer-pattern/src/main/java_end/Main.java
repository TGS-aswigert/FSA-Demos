public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel channel187 = new NewsChannel("Channel 187");
        NewsWebsite newsDotCom = new NewsWebsite("News.com");

        newsAgency.addObserver(channel187);
        newsAgency.addObserver(newsDotCom);

        newsAgency.setNews("Tornado Warning: Take Shelter");

        channel187.getNews();
        newsDotCom.getNews();
    }
}
