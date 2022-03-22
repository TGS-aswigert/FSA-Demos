public class NewsChannel extends NewsOutlet {
    public NewsChannel(String name) {
        super(name);
    }

    @Override
    public void update(String news) {
        this.news = news;
    }

    @Override
    public void getNews() {
        System.out.println("--------" + this.name + "--------");
        System.out.println("News Anchor: \"" + this.news + "\"");
    }
}
