import java.util.ArrayList;

public class LocaLisa {
    Repositorio repo;
    public LocaLisa(Repositorio repo) {
        this.repo = repo;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.repo.addVeiculo(veiculo);
    }

    public void imprimirVeiculos() {
        this.repo.imprimirVeiculos();
        this.repo.imprimirMarcasMaisRelevantes();
    }

    public void imprimirCarrosDisponiveis() {
        this.repo.imprimirCarrosDisponiveis();
    }

    public void imprimirCarrosAlugados() {
        this.repo.imprimirCarrosAlugados();
    }

}
