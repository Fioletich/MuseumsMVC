import controllers.MuseumController;
import views.MuseumView;

public class Main {
    public static void main(String[] args) {
        new MuseumController(new MuseumView());
    }
}