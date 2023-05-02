import java.util.Date;

public class Tigre extends Animal {
    public Tigre(String nome, int peso, String alimentacao, Date dataNascimento) {
        super(nome, peso, alimentacao, dataNascimento);
    }

    @Override
    public void comer() {
        double necessarioComer = this.getPeso() * 0.04;
        System.out.println(String.format("O animal %s precisa comer %s de %s", this.nome, necessarioComer, this.alimentacao));
        this.alimentado = true;
    }

    protected String tipoTigre;

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }
}
