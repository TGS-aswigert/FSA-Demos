import java.util.ArrayList;

public class NewsAgency {
    private String news;
    private ArrayList<NewsOutlet> newsOutlets = new ArrayList<>();

    public void addObserver(NewsOutlet newsOutlet){
        this.newsOutlets.add(newsOutlet);
    }

    public void removeObserver(NewsOutlet newsOutlet) {
        this.newsOutlets.remove(newsOutlet);
    }

    public void setNews(String news) {
        this.news = news;
        for (NewsOutlet outlet : this.newsOutlets) {
            outlet.update(this.news);
        }
    }
}
