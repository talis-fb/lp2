import java.util.ArrayList;

public class Repo {
    protected ArrayList<Veiculo> veiculos;

    public Repo() {
        this.veiculos = new ArrayList<>();
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void getCarbonFootprint() {
        System.out.println("Carbono emitido");
        for (int i = 0; i < this.veiculos.size(); i++) {
            Veiculo veiculo = this.veiculos.get(i);
            double carbono = veiculo.getCarbonFootprint();
            System.out.println(String.format("%s ) %s > %s", i + 1, veiculo.getTipo(), carbono));
        }
    }
}
