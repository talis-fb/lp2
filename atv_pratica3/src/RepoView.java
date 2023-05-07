public class RepoView {
    private Repo repo;

    public RepoView(Repo repo) {
        this.repo = repo;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.repo.addVeiculo(veiculo);
    }

    public void getCarbonFootprint() {
        this.repo.getCarbonFootprint();
    }
}