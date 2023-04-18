public class Veiculo {
    private String marca;
    private String placa;
    private int quilometragem;

    private int aluguel;

    private boolean isAlugado;

    public Veiculo(){
        this.placa = "";
        this.quilometragem = 0;
        this.aluguel = 0;
        this.isAlugado = false;
    }




    // getters

    public String getTipo() {
        return "INDEFINIDO";
    }

    public boolean getIsAlugado() {
        return isAlugado;
    }

    public int getAluguel() {
        return aluguel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    // setters

    public void setIsAlugado(boolean v) {
        this.isAlugado = v;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}
