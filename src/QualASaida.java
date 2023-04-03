import banco.entidades.ContaSimples;
public class QualASaida {
    public static void main(String[] args) {

        ContaSimples umaConta = new ContaSimples("Raquel", "1234");

        umaConta.depositar(1000);

        ContaSimples conta;

        //conta.depositar(10);

        System.out.println("Saldo eh R$ " + umaConta.getSaldo());

    }

}

