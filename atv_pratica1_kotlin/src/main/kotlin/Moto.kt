enum class TipoPartida {
    ELETRICA,
    MANUAL
}

class Moto : Veiculo() {
    var partida: TipoPartida
    var cilidradas = 0

    init {
        partida = TipoPartida.MANUAL
    }

    override val tipo: String
        get() = "Moto"
}
