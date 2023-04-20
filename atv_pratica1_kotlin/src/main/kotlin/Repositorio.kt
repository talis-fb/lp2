class Repositorio {
    private val veiculos: ArrayList<Veiculo>

    init {
        veiculos = ArrayList()
    }

    fun addVeiculo(veiculo: Veiculo) {
        veiculos.add(veiculo)
    }

    fun alugarVeiculo(placa: String) {
        for (v in veiculos) {
            if (v.placa === placa) {
                v.isAlugado = true
            }
        }
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
        val i = 1
        for (veiculo in veiculos) {
            println(
                java.lang.String.format(
                    "%s | %s | %s | %s | %s;",
                    veiculo.tipo,
                    veiculo.placa,
                    veiculo.marca,
                    veiculo.isAlugado,
                    veiculo.quilometragem
                )
            )
        }
    }

    fun imprimirCarrosDisponiveis() {
        val disponives = ArrayList<Veiculo>()
        var aluguelAlto = 0
        var aluguelBaixo = 0
        println("== Veiculos disponiveis para alugar ==")
        for (v in veiculos) {
            if (!v.isAlugado) {
                if (v.aluguel > aluguelAlto || aluguelAlto == 0) {
                    aluguelAlto = v.aluguel
                }
                if (v.aluguel < aluguelBaixo || aluguelBaixo == 0) {
                    aluguelBaixo = v.aluguel
                }
                println(
                    String.format(
                        "%s | %s | %s => %d",
                        v.tipo,
                        v.placa,
                        v.marca,
                        v.aluguel
                    )
                )
            }
        }
        println(String.format("Aluguel mais alto: %d", aluguelAlto))
        println(String.format("Aluguel mais baixo: %d", aluguelBaixo))
    }

    fun imprimirCarrosAlugados() {
        val alugados = ArrayList<Veiculo>()
        var valor_total = 0
        println("== Veiculos alugados ==")
        for (v in veiculos) {
            if (v.isAlugado) {
                valor_total += v.aluguel
                println(
                    String.format(
                        "%s | %s | %s => %d",
                        v.tipo,
                        v.placa,
                        v.marca,
                        v.aluguel
                    )
                )
            }
        }
        println("Valor total a receber...")
        println(valor_total)
    }
}
