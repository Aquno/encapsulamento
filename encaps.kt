class BankAccount(private var _balance: Double, val accountHolder: String) {
    val balance: Double
        get() = _balance

    fun deposit(amount: Double) {
        if (amount > 0) {
            _balance += amount
            println("Depósito de R$$amount realizado com sucesso. Saldo atual: R$$_balance")
        } else {
            println("Valor de depósito inválido.")
        }
    }

    
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= _balance) {
            _balance -= amount
            println("Saque de R$$amount realizado com sucesso. Saldo atual: R$$_balance")
        } else if (amount > _balance) {
            println("Erro: Saldo insuficiente para o saque de R$$amount.")
        } else {
            println("Valor de saque inválido.")
        }
    }
}



//-----------------------------------------------------------------------------------------
fun main() {
   
    val account = BankAccount(1000.0, "João Silva")

    println("Saldo inicial: R$${account.balance}")

    account.deposit(500.0)

    account.withdraw(200.0)

    account.withdraw(1500.0)

    account.deposit(-50.0)

    account.withdraw(-100.0)

    println("Saldo final: R$${account.balance}")
}
