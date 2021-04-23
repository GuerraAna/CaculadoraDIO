import kotlin.math.pow

//Funções das operações matemáticas na calculadora. Soma-Subtração-Multiplicação-Divisão-Porcentagem-Potenciação (Sair não precisa de função).
fun soma(num1: Float, num2: Float) = num1.plus(num2)
fun subtracao(num1: Float, num2: Float) = num1.minus(num2)
fun multiplicacao(num1: Float, num2: Float) = num1.times(num2)
fun divisao(num1: Float, num2: Float) = num1.div(num2)
fun porcentagem(num1: Float, num2: Float) = num1.times(num2)/100
fun potenciacao(num1: Float, num2: Float) = num1.pow(num2)

//Função principal.
fun main() {
    //Menu de seleção das operações e saída.
    println("Bem-vindo(a) à calculadora de Ana. Escolha a operação que deseja realizar.")
    println("1) Soma;")
    println("2) Subtração;")
    println("3) Multiplicação;")
    println("4) Divisão;")
    println("5) Porcentagem;")
    println("6) Potenciação;")
    println("7) Sair.")

    //Entrada da operação selecionada pelo cliente.
    println("Digite a operação escolhida: ")
    val operacao: Int = readLine()!!.toInt()

    //Seleção do primeiro número que deseja calcular.
    println("Agora, preciso que você selecione o primeiro número que deseja calcular: ")
    val num1: Float = readLine()!!.toFloat()

    //Seleção do segundo número que deseja calcular.
    println("Selecione o segundo número que deseja calcular: ")
    val num2: Float = readLine()!!.toFloat()

    //Confirmação da operação e dos números desejados.
    println("Ok, você selecionou a operação $operacao e os números $num1 e $num2?. Digite:")
    println("1) Para sim;")
    println("2) Para não.")

    //Condição para a confirmação.
    when(readLine()!!.toInt()) {
        1-> {
            //Condição para a operação desejada.
            when(operacao) {
                1 -> println("O resultado da somatória é: " + soma(num1, num2))
                2 -> println("O resultado da subtração é: " + subtracao(num1, num2))
                3 -> println("O resultado da multiplicação é: " + multiplicacao(num1, num2))
                4 -> println("O resultado da divisão é: " + divisao(num1, num2))
                5 -> println("O resultado da porcentagem é: " + porcentagem(num1, num2))
                6 -> println("O resultado da potenciação é: " + potenciacao(num1, num2))
                7 -> println("Que pena que você decidiu sair! Volte logo. Saindo...")
            }
        }
        //Condição para a operação desejada.
        2-> println("Tente novamente.")
    }
    println("Obrigada, volte sempre!")
}
