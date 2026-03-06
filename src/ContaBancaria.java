public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public ContaBancaria() {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito){

        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.println("Valor de " + valorDeposito + " depositado com sucesso!!");
        }else{
            System.out.println("Valor de depósito deve ser maior que 0");
        }
    }

    public void sacar(double valorSaque){
        if (valorSaque < 0) {
            System.out.println("Valor de saque deve ser maior que 0");
        } else if (valorSaque > saldo) {
            System.out.println("Valor de saque não pode ser maior que o saldo da conta");
        }
        else {

            this.saldo -= valorSaque;
            double aux =  valorSaque;

                    int valor100 = (int)valorSaque / 100;
                    valorSaque =valorSaque % 100;


                    int valor50 = (int)valorSaque / 50;
                    valorSaque =valorSaque % 50;


                   int valor20 = (int)valorSaque / 20;
                    valorSaque =valorSaque % 20;


                    int valor10 = (int)valorSaque / 10;
                    valorSaque =valorSaque % 10;


                    int valor5 = (int)valorSaque / 5;
                    valorSaque =valorSaque % 5;

                    int valor2 = (int)valorSaque / 2;
                    valorSaque =valorSaque % 2;

                int valor1 = (int)valorSaque;

            System.out.printf("Saque de R$ %.2f efetuado!%n", aux);
            System.out.println();
            System.out.printf("Notas: 100x%d, 50x%d, 20x%d, 10x%d, 5x%d, 2x%d, 1x%d%n",
                    valor100, valor50, valor20, valor10, valor5, valor2, valor1);
            }
        }


    }




