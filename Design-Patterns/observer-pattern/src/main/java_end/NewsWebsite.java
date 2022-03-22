public class NewsWebsite extends NewsOutlet {
    public NewsWebsite(String name) {
        super(name);
    }

    @Override
    public void update(String news) {
        this.news = news;
    }

    @Override
    public void getNews() {
        System.out.println("--------" + this.name + "--------");
        System.out.println("Recent Post: " + this.news);
    }
}
