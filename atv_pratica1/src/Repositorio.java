import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Repositorio {
    private ArrayList<Veiculo> veiculos;

    public Repositorio(){
        this.veiculos = new ArrayList<>();
    }


    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void alugarVeiculo(String placa) {
        for (Veiculo v: this.veiculos) {
            if (v.getPlaca() == placa) {
                v.setIsAlugado(true);
            }
        }
    }

    public void imprimirMarcasMaisRelevantes() {
        HashMap<String, Integer> marcas_ocorrencias = new HashMap<String, Integer>();

        for (Veiculo v: this.veiculos) {
            if (!(v instanceof Carro)) {
                continue;
            }

            Integer ocorencias = 0;
            if (marcas_ocorrencias.containsKey(v.getMarca())) {
                ocorencias = marcas_ocorrencias.get(v.getMarca());
            }
            marcas_ocorrencias.put(v.getMarca(), ocorencias + 1);
        }

        Set<String> marcas = marcas_ocorrencias.keySet();

        System.out.println("Marcas dos carros");
        int i = 1;
        for (String m: marcas) {
            System.out.println(String.format("%d) %s", i, m));
        }
    }

    public void imprimirVeiculos() {
        System.out.println("== Lista de veiculos ==");
        int i = 1;
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(
                    String.format(
                            "%s | %s | %s | %s | %s;",
                            veiculo.getTipo(),
                            veiculo.getPlaca(),
                            veiculo.getMarca(),
                            veiculo.getIsAlugado(),
                            veiculo.getQuilometragem()
                    ));
        }
    }

    public void imprimirCarrosDisponiveis() {
        ArrayList<Veiculo> disponives = new ArrayList<>();
        int aluguelAlto = 0;
        int aluguelBaixo = 0;

        System.out.println("== Veiculos disponiveis para alugar ==");
        for (Veiculo v: this.veiculos) {
            if (!v.getIsAlugado()) {
                if (v.getAluguel() > aluguelAlto || aluguelAlto == 0){
                    aluguelAlto = v.getAluguel();
                }

                if (v.getAluguel() < aluguelBaixo || aluguelBaixo == 0){
                    aluguelBaixo = v.getAluguel();
                }

                System.out.println(
                        String.format(
                                "%s | %s | %s => %d",
                                v.getTipo(),
                                v.getPlaca(),
                                v.getMarca(),
                                v.getAluguel()
                        ));
            }
        }

        System.out.println(String.format("Aluguel mais alto: %d", aluguelAlto));
        System.out.println(String.format("Aluguel mais baixo: %d", aluguelBaixo));
    }

    public void imprimirCarrosAlugados() {
        ArrayList<Veiculo> alugados = new ArrayList<>();
        int valor_total = 0;

        System.out.println("== Veiculos alugados ==");
        for (Veiculo v: this.veiculos) {
            if (v.getIsAlugado()) {
                valor_total += v.getAluguel();
                System.out.println(
                        String.format(
                          "%s | %s | %s => %d",
                          v.getTipo(),
                          v.getPlaca(),
                          v.getMarca(),
                          v.getAluguel()
                        ));
            }
        }

        System.out.println("Valor total a receber...");
        System.out.println(valor_total);

    }
}
