import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actorOne = new Actor("Александр", "Демьяненко", "мужчина", 170);
        Actor actorTwo = new Actor("Екатерина", "Андреева", "женщина", 155);
        Actor actorThree = new Actor("Глеб", "Попов", "мужчина", 181);

        Director directorOne = new Director("Пётр", "Климов", "мужчина", 27);
        Director directorTwo = new Director("Мария", "Петрова", "женщина", 16);

        Person musicAuthor = new Person("Филип", "Китов", "мужчина");

        Person choreographerOne = new Person("Макар", "Тишков", "мужчина");

        Show show = new Show("Марсельера", 90, directorTwo, new ArrayList<>());

        Opera opera = new Opera("Мечта", 120, directorOne, new ArrayList<>(), musicAuthor, "Муза.. Моя. " +
                "Летят ромашки над рекой, я как в первые мгновения лета, чувствую запах весны", 7);

        Ballet ballet = new Ballet("Танец колокольчика", 60, directorTwo, new ArrayList<>(), musicAuthor,
                "Бегу... Бегу... Как красиво вокруг! Птицы чирикают словно тонкие колокольчики звенят, " +
                        "оповещая нас о смене сезона года ", choreographerOne);


        show.addActors(actorOne);
        opera.addActors(actorTwo);
        ballet.addActors(actorThree);

        System.out.println("Выводим список актеров :");
        show.printArray(show.listOfActors);
        opera.printArray(opera.listOfActors);
        ballet.printArray(ballet.listOfActors);
        System.out.println();

        System.out.println("Меняем актера в опере <Мечта> :");
        opera.changeActors("Екатерина", actorThree);
        System.out.println("Новый список актеров :");
        opera.printArray(opera.listOfActors);
        System.out.println();

        System.out.println("Меняем актера в балете <Танец колокольчика>, которого нет в списке :");
        ballet.changeActors("Гоша", actorThree);
        System.out.println();

        System.out.println("Печатаем текст либретто оперы и балета:");
        opera.librettoPrint();
        ballet.librettoPrint();
    }
}
