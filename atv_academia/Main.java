import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Recepcionista recep1 = new Recepcionista("001", "Jessica");
        Recepcionista recep2 = new Recepcionista("001", "Amanda");

        Professor prof1 = new Professor("003", "Snape", TipoProfessor.MUSCULAÇÃO);
        Professor prof2 = new Professor("004", "Dumbledore", TipoProfessor.NATAÇÃO);

        // Alunos musculação -----------
        Aluno aluno1 = new Aluno("702.654.32-22", "Joao", new Date());
        aluno1.addTreino(new Horario(new Date(2023, 4, 15, 12, 30, 0), "Supino Reto"));
        aluno1.addTreino(new Horario(new Date(2023, 4, 14, 13, 00, 0), "Supino Inclinado"));

        Aluno aluno2 = new Aluno("893.474.44-00", "Maria", new Date());
        aluno2.addTreino(new Horario(new Date(2023, 4, 15, 15, 30, 0), "Peck Deck"));
        aluno2.addTreino(new Horario(new Date(2023, 4, 14, 18, 00, 0), "Crucifixo"));

        Aluno aluno3 = new Aluno("132.474.44-00", "Eduardo", new Date());
        aluno3.addTreino(new Horario(new Date(2023, 4, 15, 8, 30, 0), "Elevação Lateral"));
        aluno3.addTreino(new Horario(new Date(2023, 4, 14, 10, 00, 0), "Rosca Direta"));

        // Alunos natação ---------------
        Aluno aluno4 = new Aluno("003.654.77-00", "Eliza", new Date());
        aluno4.addTreino(new Horario(new Date(2023, 4, 15, 7, 30, 0), "Alongamento"));
        aluno4.addTreino(new Horario(new Date(2023, 4, 14, 11, 00, 0), "Borboleta"));

        Aluno aluno5 = new Aluno("003.654.77-00", "Luiza", new Date());
        aluno5.addTreino(new Horario(new Date(2023, 4, 15, 5, 30, 0), "Nadar direito"));
        aluno5.addTreino(new Horario(new Date(2023, 4, 14, 11, 00, 0), "Nadar"));


        prof1.addAluno(aluno1);
        prof1.addAluno(aluno2);
        prof1.addAluno(aluno3);
        prof2.addAluno(aluno4);
        prof2.addAluno(aluno5);


        BancoDeDados db = new BancoDeDados();
        db.addFuncionarios(recep1);
        db.addFuncionarios(recep2);
        db.addFuncionarios(prof1);
        db.addFuncionarios(prof2);

        // Output
        db.imprimirFuncionarios();
        System.out.println("\n");
        db.imprimirProfessores();
    }
}