open class Veiculo {
    var marca: String? = null
    var placa = ""
    var quilometragem = 0
    var aluguel = 0

    var isAlugado = false

    open val tipo: String
        get() = "INDEFINIDO"

}
