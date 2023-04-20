class LocaLisa(var repo: Repositorio) {
    fun addVeiculo(veiculo: Veiculo?) {
        repo.addVeiculo(veiculo!!)
    }

    fun imprimirVeiculos() {
        repo.imprimirVeiculos()
        repo.imprimirMarcasMaisRelevantes()
    }

    fun imprimirCarrosDisponiveis() {
        repo.imprimirCarrosDisponiveis()
    }

    fun imprimirCarrosAlugados() {
        repo.imprimirCarrosAlugados()
    }
}
