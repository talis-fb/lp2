public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto();
        m1.setCilindrada(10);
        m1.setQuiloMensal(200);
        m1.setCustoCombustivelMensal(30.9);
        Moto m2 = new Moto();
        m2.setCilindrada(15);
        m2.setQuiloMensal(100);
        m2.setCustoCombustivelMensal(40.9);
        Moto m3 = new Moto();
        m3.setCilindrada(21);
        m3.setQuiloMensal(100);
        m3.setCustoCombustivelMensal(51.0);
        Moto m4 = new Moto();
        m4.setCilindrada(15);
        m4.setQuiloMensal(250);
        m4.setCustoCombustivelMensal(40.0);


        Carro c1 = new Carro();
        c1.setMotor(30.0);
        c1.setQuiloMensal(100);
        c1.setCustoCombustivelMensal(400);
        Carro c2 = new Carro();
        c2.setMotor(50.0);
        c2.setQuiloMensal(500);
        c2.setCustoCombustivelMensal(800);
        Carro c3 = new Carro();
        c3.setMotor(40.0);
        c3.setQuiloMensal(300);
        c3.setCustoCombustivelMensal(600);
        Carro c4 = new Carro();
        c4.setMotor(35.0);
        c4.setQuiloMensal(250);
        c4.setCustoCombustivelMensal(500);


        Taxi t1 = new Taxi();
        t1.setEspacoPassageiros(4);
        t1.setQuiloMensal(400);
        t1.setCustoCombustivelMensal(70);
        Taxi t2 = new Taxi();
        t2.setEspacoPassageiros(6);
        t2.setQuiloMensal(800);
        t2.setCustoCombustivelMensal(120);
        Taxi t3 = new Taxi();
        t3.setEspacoPassageiros(4);
        t3.setQuiloMensal(500);
        t3.setCustoCombustivelMensal(90);
        Taxi t4 = new Taxi();
        t4.setEspacoPassageiros(5);
        t4.setQuiloMensal(600);
        t4.setCustoCombustivelMensal(100);

        Repo repo = new Repo();
        repo.addVeiculo(m1);
        repo.addVeiculo(m2);
        repo.addVeiculo(m3);
        repo.addVeiculo(m4);

        repo.addVeiculo(c1);
        repo.addVeiculo(c2);
        repo.addVeiculo(c3);
        repo.addVeiculo(c4);

        repo.addVeiculo(t1);
        repo.addVeiculo(t2);
        repo.addVeiculo(t3);
        repo.addVeiculo(t4);

        RepoView view = new RepoView(repo);

        view.getCarbonFootprint();
    }
}