public abstract class NewsOutlet {
    String name;
    String news;

    public NewsOutlet(String name) {
        this.name = name;
    }

    public abstract void update(String news);
    public abstract void getNews();
}
