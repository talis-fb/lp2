import java.util.ArrayList;

public class ZoologicoView {
    protected Repo repo;
    public ZoologicoView(Repo repo) {
        this.repo = repo;
    }

    public void alimentarTodosAnimais() {
        this.alimentarTodosAnimais();
    }

    public void imprimirTodosAnimais() {
        this.repo.imprimirTodosAnimais();
    }

    public void imprimirAnimaisMaisNovos() {
        this.repo.imprimirAnimaisMaisNovos();
    }

    public void imprimirAnimaisPrecisamConsulta() {
        this.repo.imprimirAnimaisPrecisamConsulta();
    }
}
