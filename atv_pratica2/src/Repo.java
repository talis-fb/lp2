import java.util.ArrayList;

public class Repo {
    protected ArrayList<Animal> animais;
    public Repo(ArrayList<Animal> animais){
        this.animais = animais;
    }

    public void addAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void alimentarTodosAnimais() {
        double totalVegatais = 0.0;
        double totalCarne = 0.0;

        for (Animal animal: this.animais) {
            animal.comer();
            if (animal instanceof Tigre) {
                totalCarne += animal.getPeso() * 0.05;
            }
            if (animal instanceof Girafa) {
                totalVegatais += animal.getPeso() * 0.1;
            }
            if (animal instanceof Elefante) {
                totalVegatais += animal.getPeso() * 0.15;
            }
        }

        System.out.println("Total de gastos com alimento...");
        System.out.println(String.format("Carnes  : %s", totalCarne));
        System.out.println(String.format("Vegetais: %s", totalVegatais));
    }

    public void imprimirTodosAnimais() {
        for (Animal animal: this.animais) {
            String out = String.format(
                    "%s | %s anos | %s kgs | Alimentado: %s",
                    animal.getNome(),
                    Animal.calcularIdade(animal),
                    animal.getPeso(),
                    animal.getAlimentado()
                );
            System.out.println(out);
        }
    }

    public void imprimirAnimaisMaisNovos() {
        ArrayList<Tigre> tigres = new ArrayList<>();
        for (Animal animal: this.animais) {
            if (animal instanceof Tigre){
                tigres.add((Tigre) animal);
            }
        }

        ArrayList<Elefante> elefantes = new ArrayList<>();
        for (Animal animal: this.animais) {
            if (animal instanceof Elefante){
                elefantes.add((Elefante) animal);
            }
        }

        ArrayList<Girafa> girafas = new ArrayList<>();
        for (Animal animal: this.animais) {
            if (animal instanceof Girafa){
                girafas.add((Girafa) animal);
            }
        }

        System.out.println("Os 5 animais TIGRES mais jovens");
        for (Animal animal: tigres.subList(0, 4)) {
            String out = String.format("%s", animal.getNome());
            System.out.println(out);
        }

        System.out.println("As 5 animais GIRAFAS mais jovens");
        for (Animal animal: girafas.subList(0, 4)) {
            String out = String.format("%s", animal.getNome());
            System.out.println(out);
        }

        System.out.println("Os 5 animais ELEFANTES mais jovens");
        for (Animal animal: elefantes.subList(0, 4)) {
            String out = String.format("%s", animal.getNome());
            System.out.println(out);
        }
    }

    public void imprimirAnimaisPrecisamConsulta() {
        for (Animal animal: this.animais) {
            if (animal instanceof Girafa) {
                boolean precisa = (Animal.calcularIdade(animal) % 5) == 0;
                if (precisa) {
                    System.out.println(String.format("Girafa: %s precisa de uma consulta", animal.getNome()));
                }
            }

            if (animal instanceof Elefante) {
                boolean precisa = (Animal.calcularIdade(animal) % 5) == 0;
                if (precisa) {
                    System.out.println(String.format("Elefante: %s precisa de uma consulta", animal.getNome()));
                }
            }

            if (animal instanceof Tigre) {
                boolean precisa = (Animal.calcularIdade(animal) % 5) == 0;
                if (precisa) {
                    System.out.println(String.format("Tigre: %s precisa de uma consulta", animal.getNome()));
                }
            }
        }
    }
}
