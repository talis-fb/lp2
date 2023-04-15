import java.text.SimpleDateFormat;
import java.util.Date;

public class Horario {
    private Date horario;
    private String nome;
    public Horario(Date horario, String nome){
        this.horario = horario;
        this.nome = nome;
    }

    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        return String.format("%s=%s", formatter.format(this.horario), this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public Date getHorario() {
        return horario;
    }
}
