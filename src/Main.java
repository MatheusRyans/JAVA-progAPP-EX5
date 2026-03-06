public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("1234-5", "João Silva", 500.0);

        System.out.println("Saldo Inicial: R$ " + conta.getSaldo());

        // Testando depósito inválido
        conta.depositar(-50);

        // Testando saque com cédulas (Exemplo do enunciado: 256)
        //conta.sacar(256);

        // Testando saque maior que o saldo
       // conta.sacar(300);

        System.out.println("Saldo Final: R$ " + conta.getSaldo());

    }
}