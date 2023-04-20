import java.util.*

fun main(args: Array<String>) {
    // Motos
    val m1 = Moto()
    m1.placa = "JJK-213"
    m1.partida = TipoPartida.ELETRICA
    m1.aluguel = 200
    m1.isAlugado = false
    m1.quilometragem = 200
    m1.cilidradas = 30
    m1.marca = "Honda"

    val m2 = Moto()
    m2.placa = "JK-211"
    m2.partida = TipoPartida.ELETRICA
    m2.aluguel = 200
    m2.isAlugado = false
    m2.quilometragem = 100
    m2.cilidradas = 70
    m2.marca = "Honda"

    val m3 = Moto()
    m3.placa = "IOJK-213"
    m3.partida = TipoPartida.ELETRICA
    m3.aluguel = 500
    m3.isAlugado = true
    m3.quilometragem = 200
    m3.cilidradas = 0
    m3.marca = "Honda"

    val m4 = Moto()
    m4.placa = "XXEA-213"
    m4.partida = TipoPartida.MANUAL
    m4.aluguel = 500
    m4.isAlugado = true
    m4.quilometragem = 200
    m4.cilidradas = 10
    m4.marca = "Honda"


    // Carros
    val c1 = Carro()
    c1.placa = "XXEA-213"
    c1.aluguel = 500
    c1.isAlugado = true
    c1.quilometragem = 200
    c1.marca = "Jeep"
    c1.quantPortas = 2
    c1.potencia = 500

    val c2 = Carro()
    c2.placa = "HYU-213"
    c2.aluguel = 500
    c2.isAlugado = true
    c2.quilometragem = 200
    c2.marca = "Jeep"
    c2.quantPortas = 2
    c2.potencia = 500

    val c3 = Carro()
    c3.placa = "MNC-213"
    c3.aluguel = 500
    c3.isAlugado = true
    c3.quilometragem = 200
    c3.marca = "Honda"
    c3.quantPortas = 2
    c3.potencia = 500

    val c4 = Carro()
    c4.placa = "XXEA-213"
    c4.aluguel = 500
    c4.isAlugado = true
    c4.quilometragem = 200
    c4.marca = "Honda"
    c4.quantPortas = 2
    c4.potencia = 500

    val c5 = Carro()
    c5.placa = "POLd-213"
    c5.aluguel = 500
    c5.isAlugado = true
    c5.quilometragem = 200
    c5.marca = "Honda"
    c5.quantPortas = 2
    c5.potencia = 500

    val c6 = Carro()
    c6.placa = "BBBN-213"
    c6.aluguel = 500
    c6.isAlugado = true
    c6.quilometragem = 200
    c6.marca = "Fiat"
    c6.quantPortas = 2
    c6.potencia = 500

    val repo = Repositorio()
    val view = LocaLisa(repo)
    view.addVeiculo(m1)
    view.addVeiculo(m2)
    view.addVeiculo(m3)
    view.addVeiculo(m4)
    view.addVeiculo(c1)
    view.addVeiculo(c2)
    view.addVeiculo(c3)
    view.addVeiculo(c4)
    view.addVeiculo(c5)
    view.addVeiculo(c6)
    view.imprimirVeiculos()
    view.imprimirCarrosAlugados()
    view.imprimirCarrosDisponiveis()
    println("Hello world!")
}