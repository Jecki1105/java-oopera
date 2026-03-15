import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printArray(ArrayList<Actor> listOfActors) {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }

    }

    public void addActors(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр уже существует в списке.");
            return;
        }
        listOfActors.add(actor);
    }


public void changeActors(String name, Actor newActor) {
    for (int i = 0; i < listOfActors.size(); i++) {
        if (listOfActors.get(i).name.equals(name)) {
            listOfActors.set(i, newActor);
            System.out.println("Актёр успешно заменён.");
            return;
        }
    }
    System.out.println("Актёр с таким именем не найден.");
}

public String getTitle() {
    return title;
}

public int getDuration() {
    return duration;
}

public Director getDirector() {
    return director;
}

public ArrayList<Actor> getListOfActors() {
    return listOfActors;
}
}
