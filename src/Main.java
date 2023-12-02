public class Main {
    public static void main(String[] args) {
        Author huxley = new Author("Олдос", "Хаксли");
        Author roth = new Author("Вероника", "Рот");
        Book braveNewWorld = new Book("О дивынй новый мир", huxley, 2001);
        Book divergent = new Book("Дивергент", roth, 2015);
        Book insurgent = new Book("Инсургент", roth, 2016);
        Book allegiant = new Book("Аллигент", roth, 2017);
        braveNewWorld.setPublishingYear(2011);
    }
}