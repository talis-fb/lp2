import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Recepcionista extends Funcionario {
    private HashSet<Horario> horarios;
    public Recepcionista(String matricula, String nome) {
        super(matricula, nome);
        this.horarios = new HashSet<>();
    }

    public void addHorario(Horario horario) {
        this.horarios.add(horario);
    }

    public void removeHorario(Horario horario) {
        this.horarios.remove(horario);
    }

    public HashSet<Horario> getHorarios() {
        return horarios;
    }

    public String getTipoFuncionario(){
        return "imd.academia.Recepcionista";
    }

    public String getHorariosPrint(){
        StringJoiner horarios_str = new StringJoiner(", ");
        for (Horario horario : this.horarios) {
            horarios_str.add(horario.toString());
        }
        return String.format("{ %s }", horarios_str.toString());
    }
}
