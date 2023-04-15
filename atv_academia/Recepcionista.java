import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Recepcionista extends Funcionario {
    private HashSet<Horario> horarios;
    public Recepcionista(String matricula, String nome) {
        super(matricula, nome);
    }

    public void addHorario(Horario horario) {
        this.horarios.add(horario);
    }

    public void removeHorario(Horario horario) {
        this.horarios.remove(horario);
    }
}
