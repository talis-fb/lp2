class Repositorio {
    private val veiculos: ArrayList<Veiculo>

    init {
        veiculos = ArrayList()
    }

    fun addVeiculo(veiculo: Veiculo) {
        veiculos.add(veiculo)
    }

    fun alugarVeiculo(placa: String) {
        val veiculo = veiculos.find { it.placa === placa }
        veiculo?.isAlugado = true
    }

    fun imprimirMarcasMaisRelevantes() {
        val marcas = veiculos.map { it.marca }
        val counts = marcas.groupingBy { it }.eachCount()
        val sortedList = marcas.toSet().sortedByDescending { counts[it] }
        sortedList.forEachIndexed { index, m -> println("${index + 1} ) $m") }
    }

    fun imprimirVeiculos() {
        println("== Lista de veiculos ==")
        veiculos.forEach {
            println("${it.tipo} | ${it.placa} | ${it.marca} | ${it.isAlugado} | ${it.quilometragem};")
        }
    }

    fun imprimirCarrosDisponiveis() {
        println("== Veiculos disponiveis para alugar ==")

        val veiculos_disponives = veiculos.filter { !it.isAlugado }

        val alugueis = veiculos_disponives.asSequence().map { it.aluguel }
        val aluguelAlto = alugueis.max()
        val aluguelBaixo = alugueis.min()

        veiculos_disponives.forEach {
            println("${it.tipo} | ${it.placa} | ${it.marca} => ${it.aluguel}")
        }

        println("Aluguel mais alto: $aluguelAlto")
        println("Aluguel mais baixo: $aluguelBaixo")
    }

    fun imprimirCarrosAlugados() {
        var valor_total = 0
        println("== Veiculos alugados ==")

        veiculos
            .filter { it.isAlugado }
            .forEach {
                valor_total += it.aluguel
                println("${it.tipo} | ${it.placa} | ${it.marca} => ${it.aluguel}")
            }

        println("Valor total a receber...")
        println(valor_total)
    }
}
