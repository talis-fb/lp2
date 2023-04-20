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
        val marcas_ocorrencias = HashMap<String?, Int>()
        for (v in veiculos) {
            if (v !is Carro) {
                continue
            }
            var ocorencias: Int? = 0
            if (marcas_ocorrencias.containsKey(v.marca)) {
                ocorencias = marcas_ocorrencias[v.marca]
            }
            marcas_ocorrencias[v.marca] = ocorencias!! + 1
        }
        val marcas: Set<String?> = marcas_ocorrencias.keys
        println("Marcas dos carros")
        val i = 1
        for (m in marcas) {
            println(String.format("%d) %s", i, m))
        }
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
