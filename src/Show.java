import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printArray(ArrayList<Actor> listOfActors) {
        for (Actor actor : listOfActors) {
            System.out.println(actor.name + " " + actor.surname + " " + actor.height);
        }

    }

    public void addActors(Actor actor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.equals(actor)) {
                System.out.println("Актёр уже существует в списке.");
                return;
            }
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
}
