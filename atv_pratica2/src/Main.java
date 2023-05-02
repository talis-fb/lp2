import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Repo repo = new Repo();

        Tigre t1 = new Tigre("Onca", 34, "Carne", new Date(2017, 12,2));
        Tigre t2 = new Tigre("Richard", 20, "Carne", new Date(2018, 12,2));
        Tigre t3 = new Tigre("Cotoco", 18, "Carne", new Date(2017, 1,2));

        Girafa g1 = new Girafa("Pescocao", 44, "Folhas", new Date(2017, 12,8));
        Girafa g2 = new Girafa("Miro", 35, "Folhas", new Date(2015, 6,12));
        Girafa g3 = new Girafa("Osoo", 48, "Folhas", new Date(2013, 1,8));
        Girafa g4 = new Girafa("Oscar", 50, "Folhas", new Date(2014, 2,20));

        Elefante e1 = new Elefante("Pescocao", 84, "Frutas", new Date(2012, 2,2));
        Elefante e2 = new Elefante("Pescocao", 75, "Frutas", new Date(2012, 8,2));
        Elefante e3 = new Elefante("Pescocao", 69, "Frutas", new Date(2011, 9,2));
        Elefante e4 = new Elefante("Pescocao", 80, "Frutas", new Date(2010, 5,2));

        repo.addAnimal(t1);
        repo.addAnimal(t2);
        repo.addAnimal(t3);

        repo.addAnimal(g1);
        repo.addAnimal(g2);
        repo.addAnimal(g3);
        repo.addAnimal(g4);

        repo.addAnimal(e1);
        repo.addAnimal(e2);
        repo.addAnimal(e3);
        repo.addAnimal(e4);

        ZoologicoView zoo = new ZoologicoView(repo);

        zoo.imprimirTodosAnimais();
    }
}