public class Main {
    public static void main(String[] args) {

        // Motos
        Moto m1 = new Moto();
        m1.setPlaca("JJK-213");
        m1.setPartida(TipoPartida.ELETRICA);
        m1.setAluguel(200);
        m1.setIsAlugado(false);
        m1.setQuilometragem(200);
        m1.setCilidradas(30);
        m1.setMarca("Honda");

        Moto m2 = new Moto();
        m2.setPlaca("JK-211");
        m2.setPartida(TipoPartida.ELETRICA);
        m2.setAluguel(200);
        m2.setIsAlugado(false);
        m2.setQuilometragem(100);
        m2.setCilidradas(70);
        m2.setMarca("Honda");

        Moto m3 = new Moto();
        m3.setPlaca("IOJK-213");
        m3.setPartida(TipoPartida.ELETRICA);
        m3.setAluguel(500);
        m3.setIsAlugado(true);
        m3.setQuilometragem(200);
        m3.setCilidradas(0);
        m3.setMarca("Honda");

        Moto m4 = new Moto();
        m4.setPlaca("XXEA-213");
        m4.setPartida(TipoPartida.MANUAL);
        m4.setAluguel(500);
        m4.setIsAlugado(true);
        m4.setQuilometragem(200);
        m4.setCilidradas(10);
        m4.setMarca("Honda");


        // Carros
        Carro c1 = new Carro();
        c1.setPlaca("XXEA-213");
        c1.setAluguel(500);
        c1.setIsAlugado(true);
        c1.setQuilometragem(200);
        c1.setMarca("Jeep");
        c1.setQuantPortas(2);
        c1.setPotencia(500);

        Carro c2 = new Carro();
        c2.setPlaca("HYU-213");
        c2.setAluguel(500);
        c2.setIsAlugado(true);
        c2.setQuilometragem(200);
        c2.setMarca("Jeep");
        c2.setQuantPortas(2);
        c2.setPotencia(500);

        Carro c3 = new Carro();
        c3.setPlaca("MNC-213");
        c3.setAluguel(500);
        c3.setIsAlugado(true);
        c3.setQuilometragem(200);
        c3.setMarca("Honda");
        c3.setQuantPortas(2);
        c3.setPotencia(500);

        Carro c4 = new Carro();
        c4.setPlaca("XXEA-213");
        c4.setAluguel(500);
        c4.setIsAlugado(true);
        c4.setQuilometragem(200);
        c4.setMarca("Honda");
        c4.setQuantPortas(2);
        c4.setPotencia(500);

        Carro c5 = new Carro();
        c5.setPlaca("POLd-213");
        c5.setAluguel(500);
        c5.setIsAlugado(true);
        c5.setQuilometragem(200);
        c5.setMarca("Honda");
        c5.setQuantPortas(2);
        c5.setPotencia(500);

        Carro c6 = new Carro();
        c6.setPlaca("BBBN-213");
        c6.setAluguel(500);
        c6.setIsAlugado(true);
        c6.setQuilometragem(200);
        c6.setMarca("Fiat");
        c6.setQuantPortas(2);
        c6.setPotencia(500);




        Repositorio repo = new Repositorio();
        LocaLisa view = new LocaLisa(repo);

        view.addVeiculo(m1);
        view.addVeiculo(m2);
        view.addVeiculo(m3);
        view.addVeiculo(m4);

        view.addVeiculo(c1);
        view.addVeiculo(c2);
        view.addVeiculo(c3);
        view.addVeiculo(c4);
        view.addVeiculo(c5);
        view.addVeiculo(c6);

        view.imprimirVeiculos();
        view.imprimirCarrosAlugados();
        view.imprimirCarrosDisponiveis();

        System.out.println("Hello world!");
    }
}