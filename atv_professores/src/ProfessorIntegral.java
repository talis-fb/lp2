import java.util.Date;

public class ProfessorIntegral extends Professor {
    Date dataInicio;

    @Override
    public void lecionar() {
        System.out.println("Professor integral está passando aula!");
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
}
