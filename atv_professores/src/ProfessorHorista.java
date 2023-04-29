public class ProfessorHorista extends Professor {
    int horasTrabalhadas;

    static final double VALOR_HORA = 25.00;

    @Override
    public void lecionar() {
        System.out.println("Professor horista está passando aula!");
    }

    @Override
    public double getSalario() {
        return this.horasTrabalhadas * ProfessorHorista.VALOR_HORA;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
